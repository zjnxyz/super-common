package cn.friday.common.service.global.utils;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionUtil {
	public static final String MD5 = "MD5";
	public static final String UTF_8 = "UTF-8";

	public static String encryptionByKey(String s, String preKey) {
		String retVal = "";
		// byte[] b = DigestUtils.md5(preKey);//getBytes(string, Charsets.UTF_8)
		byte[] b = getDigest(MD5).digest(getBytes(preKey, Charset.forName(UTF_8)));

		SecretKey key = new SecretKeySpec(b, "AES");
		// 根据key加密
		try {
			Cipher cp = Cipher.getInstance("AES");// 创建密码器
			cp.init(Cipher.ENCRYPT_MODE, key); // 初始化
			byte[] ctext = cp.doFinal(s.getBytes("utf-8")); // 加密
			retVal = StringByteUtil.parseByte2HexStr(ctext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}

	/**
	 * 加密id
	 * 
	 * @param s
	 * @param preKey
	 * @return
	 */
	public static String encryptionIdByMD5(String s, String preKey) {
		String retVal = "";
		// byte[] b = DigestUtils.md5(preKey);
		byte[] b = getDigest(MD5).digest(getBytes(preKey, Charset.forName(UTF_8)));
		SecretKey key = new SecretKeySpec(b, "AES");
		// 根据key加密
		try {
			Cipher cp = Cipher.getInstance("AES");// 创建密码器
			cp.init(Cipher.ENCRYPT_MODE, key); // 初始化
			byte[] ctext = cp.doFinal(s.getBytes("utf-8")); // 加密
			retVal = StringByteUtil.parseByte2HexStr(ctext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}

	public static String decryptionByKey(String s, String preKey) {
		String retVal = "";
		// byte[] b = DigestUtils.md5(preKey);
		byte[] b = getDigest(MD5).digest(getBytes(preKey, Charset.forName(UTF_8)));
		SecretKey key = new SecretKeySpec(b, "AES");
		try {
			// 根据key解密
			Cipher cp2 = Cipher.getInstance("AES"); // 创建密码器
			cp2.init(Cipher.DECRYPT_MODE, key); // 初始化
			byte[] ptext2 = cp2.doFinal(StringByteUtil.parseHexStr2Byte(s)); // 解密
			retVal = new String(ptext2); // 重新显示明文
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}

	/**
	 * 解密id
	 * 
	 * @param s
	 * @param preKey
	 * @return
	 */
	public static String decryptionIdByMD5(String s, String preKey) {
		String retVal = "";
		// byte[] b = DigestUtils.md5(preKey);
		byte[] b = getDigest(MD5).digest(getBytes(preKey, Charset.forName(UTF_8)));
		SecretKey key = new SecretKeySpec(b, "AES");
		try {
			// 根据key解密
			Cipher cp2 = Cipher.getInstance("AES"); // 创建密码器
			cp2.init(Cipher.DECRYPT_MODE, key); // 初始化
			byte[] ptext2 = cp2.doFinal(StringByteUtil.parseHexStr2Byte(s)); // 解密
			retVal = new String(ptext2); // 重新显示明文
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}

	public static MessageDigest getDigest(final String algorithm) {
		try {
			return MessageDigest.getInstance(algorithm);
		} catch (final NoSuchAlgorithmException e) {
			throw new IllegalArgumentException(e);
		}
	}

	private static byte[] getBytes(final String string, final Charset charset) {
		if (string == null) {
			return null;
		}
		return string.getBytes(charset);
	}

	public static String encryptedByMD5(String password) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] btInput = password.getBytes();
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
