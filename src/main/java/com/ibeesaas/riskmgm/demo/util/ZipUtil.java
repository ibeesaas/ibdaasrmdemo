package com.ibeesaas.riskmgm.demo.util;

/**
 * 解压缩工具
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public abstract class ZipUtil {

    /**
     * 使用zip进行压缩
     *
     * @param str 压缩前的文本
     * @return 返回压缩后的文本
     * @throws IOException io exception
     */
    public static final String zip(String str) throws IOException {
        if (str == null)
            return null;

        byte[] bytes = zip(str.getBytes(Charset.forName("UTF-8")));
        return Base64Util.getEncoder().encodeToString(bytes);
    }


    /**
     * 使用zip进行压缩
     *
     * @param bytes 压缩前的文本
     * @return 返回压缩后的文本
     * @throws IOException io exception
     */
    public static final byte[] zip(byte[] bytes) throws IOException {
        if (bytes == null)
            return null;

        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             ZipOutputStream zout = new ZipOutputStream(out)) {
            zout.putNextEntry(new ZipEntry("0"));
            zout.write(bytes);
            zout.closeEntry();
            byte[] compressed = out.toByteArray();
            return compressed;
        }
    }


    /**
     * 使用zip进行解压缩
     *
     * @param compressedStr 压缩后的文本
     * @return 解压后的字符串
     * @throws IOException io exception
     */
    public static final String unzip(String compressedStr) throws IOException {
        if (compressedStr == null) {
            return null;
        }
        Base64Util.getDecoder().decode(compressedStr);
        byte[] unzip = unzip(Base64Util.getDecoder().decode(compressedStr));
        return new String(unzip, Charset.forName("UTF-8"));
    }


    /**
     * 使用zip进行解压缩
     *
     * @param bytes 压缩后的文本
     * @return 解压后的字符串
     * @throws IOException io exception
     */
    public static final byte[] unzip(byte[] bytes) throws IOException {
        if (bytes == null) {
            return null;
        }

        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             ByteArrayInputStream in = new ByteArrayInputStream(bytes);
             ZipInputStream zin = new ZipInputStream(in)) {

            zin.getNextEntry();
            byte[] buffer = new byte[1024];
            int offset = -1;
            while ((offset = zin.read(buffer)) != -1) {
                out.write(buffer, 0, offset);
            }
            return out.toByteArray();
        }
    }
}