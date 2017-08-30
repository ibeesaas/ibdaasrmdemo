package com.ibeesaas.riskmgm.demo;

import com.google.gson.GsonBuilder;
import com.ibeesaas.riskmgm.demo.util.ZipUtil;
import org.apache.commons.codec.binary.Hex;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * 风控模型接口调用实例
 */
public class RMDemo {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        // TODO 需要使用真实申请的appkey
        String appKey = "";
        // TODO 需要使用真实ak（AccessKey,Token 认证的存取 Key，用于交互双方确定使用相同 Key Pair 计算校验的 Token 值，合作方的 AK 由平台进行分配。）
        String ak = "";
        // TODO 需要使用真实sk（Secure Key,Token 认证的安全密钥，和需要计算内容组合，生成唯一Token 值。合作方的SK由平台进行分配。）
        String sk = "";
        // TODO 需要使用实际URL
        String url = "https://api.ibeesaas.com/daas/v1/tasks";
        String urlPath = "/daas/v1/tasks";

        String taskType = "risk_management_1";
        String method = "POST";

        //拼接请求参数
        String queryParam = "appKey=" + appKey + "&taskType=" + taskType;
        //post请求体
        Map<String, Object> bodyMap = new LinkedHashMap<String, Object>();
        // TODO 回调URL需要是自己服务的真实URL
        bodyMap.put("callbackUrl", "https://callbackUrl");

        //原报告
        String report = SampleData.getDataString();
        //对报告进行zip压缩
        String compress = ZipUtil.zip(report);
        bodyMap.put("data", compress);
        //将请求体序列化
        String body = new GsonBuilder().disableHtmlEscaping().serializeNulls().create().toJson(bodyMap);
        int expireTime = (int) (System.currentTimeMillis() / 1000 + 1800);
        //生成token
        String token = generateToken(ak, sk, urlPath, method, queryParam, body, expireTime);
        String requestUrl = url + "?appKey=" + appKey + "&taskType=" + taskType;
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(requestUrl);
        post.setHeader("X-IbeeAuth-Token", token);
        StringEntity stringEntity = new StringEntity(body, "UTF-8");
        stringEntity.setContentType("application/json");
        post.setEntity(stringEntity);
        HttpResponse response = httpClient.execute(post);
        if (response != null) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
                String line = "";
                StringBuilder builder = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }
                System.out.println(builder.toString());
            }
        }
    }

    /**
     * 生成Token
      */
    private static String generateToken(String ak, String sk, String urlPath, String method, String queryParam, String body, int expireTime) throws NoSuchAlgorithmException, UnsupportedEncodingException, UnsupportedEncodingException {
        StringBuffer sbSign = new StringBuffer(String.format("|%s-%s-%d|%s|", "v2",
                ak, expireTime, sk));

        // {UrlPath}|
        sbSign.append(URLDecoder.decode(urlPath, "UTF-8")).append("|");

        // {Method}|
        sbSign.append(method).append("|");

        // {QueryParam}|
        if (queryParam!=null && queryParam.length()>0) {
            List<String> qsArray = new ArrayList<String>();
            for (String kv : queryParam.split("&")) {
                String[] t = kv.split("=");
                if (t.length > 1) {
                    qsArray.add(String.format("%s=%s", URLDecoder.decode(t[0], "UTF-8"), URLDecoder.decode(t[1], "UTF-8")));
                } else {
                    qsArray.add(String.format("%s=", URLDecoder.decode(t[0], "UTF-8")));
                }
            }

            Collections.sort(qsArray);
            boolean first = true;
            for (String s : qsArray) {
                if (first) {
                    first = false;
                } else {
                    sbSign.append("&");
                }
                sbSign.append(s);
            }
        }
        sbSign.append("|");

        // {body}|
        if (body!=null && body.length()>0) {
            sbSign.append(body);
        }
        sbSign.append("|");

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.reset();
        md5.update(sbSign.toString().getBytes("UTF-8"));

        //  v2-{AK}-{ExpireTime}-{Signature}
        String token = String.format("%s-%s-%s-%s", "v2", ak, expireTime,
                new String(Hex.encodeHex(md5.digest())));
        return token;
    }
}
