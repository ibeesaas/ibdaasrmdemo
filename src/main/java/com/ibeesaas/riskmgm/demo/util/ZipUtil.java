package com.ibeesaas.riskmgm.demo.util;

/**
 * 解压缩工具
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.*;

public abstract class ZipUtil {

    /**
     * 使用gzip进行压缩
     *
     * @param str 压缩前的文本
     * @return 返回压缩后的文本
     * @throws IOException io exception
     */
    public static final String gzip(String str) throws IOException {
        if (str == null)
            return null;

        byte[] bytes = gzip(str.getBytes(Charset.forName("UTF-8")));
        return Base64Util.getEncoder().encodeToString(bytes);
    }

    /**
     * 使用gzip进行压缩
     *
     * @param bytes 压缩前的文本
     * @return 返回压缩后的文本
     * @throws IOException io exception
     */
    public static final byte[] gzip(byte[] bytes) throws IOException {
        if (bytes == null)
            return null;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream zout = new GZIPOutputStream(out);
        zout.write(bytes);
        zout.finish();
        byte[] compressed = out.toByteArray();
        return compressed;
    }

    /**
     * 使用zip进行解压缩
     *
     * @param compressedStr 压缩后的文本
     * @return 解压后的字符串
     * @throws IOException io exception
     */
    public static final String ungzip(String compressedStr) throws IOException {
        if (compressedStr == null) {
            return null;
        }
        Base64Util.getDecoder().decode(compressedStr);
        byte[] unzip = ungzip(Base64Util.getDecoder().decode(compressedStr));
        return new String(unzip, Charset.forName("UTF-8"));
    }

    /**
     * 使用zip进行解压缩
     *
     * @param bytes 压缩后的文本
     * @return 解压后的字符串
     * @throws IOException io exception
     */
    public static final byte[] ungzip(byte[] bytes) throws IOException {
        if (bytes == null) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        GZIPInputStream ungzip = new GZIPInputStream(in);
        byte[] buffer = new byte[1024];
        int n;
        while ((n = ungzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }
        return out.toByteArray();
    }
}