package cn.friday.common.service.global.common;

public class Constant {
	/**
	 * 加密密钥
	 */
	public static String ENCRYPT_KEY = "TDSx32SJX8S86AS1EE";
	
	public static String PARAMETER_ERROR_TIP = "参数错误";
	
	public static String OPERATE_FAIL = "操作失败";
	
	public static Integer SCHOOL_NOTAVAILABLE = 0;
	
	public static Integer INAVAILABLE_VERSION_ID = 114;
	
	
	public static final class Redis{
		
		/**
		 * 每个redis存储的实体都要加这个后缀
		 */
		public final static String ENTITY_SUFFIX = "Redis";
		
		/**
		 * redis实体过期时间
		 */
		public final static int ENTITY_EXPIRE_TIME = 864000;
		
		
	}
	
	public static final class PushConst{
		 /**
		  * 秒
		  */
		 public static long DAY_SECOND = 86400;
	}
	
}
