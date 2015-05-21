package cn.friday.common.service.global.common;

import cn.friday.common.service.global.utils.EncryptionUtil;

public class Common {
	/**
	 * 加密ID
	 * @author KING
	 * @CreateTime 2015年1月27日 下午6:55:26
	 * 
	 * @param Id
	 * @return
	 */
	public static String encryptionID(Object Id){
		return EncryptionUtil.encryptionByKey(Id.toString(), Constant.ENCRYPT_KEY);
	}
	/**
	 * 解密ID
	 * @author KING
	 * @CreateTime 2015年1月27日 下午6:55:23
	 * 
	 * @param data
	 * @return
	 */
	public static String decryptID(String data){
		return EncryptionUtil.decryptionByKey(data, Constant.ENCRYPT_KEY);
	}
}
