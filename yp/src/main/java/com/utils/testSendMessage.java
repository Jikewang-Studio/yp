package com.utils;

/**
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class testSendMessage {
	
	//用户名
	private static String Uid = "eggs";
	
	//接口安全秘钥
	private static String Key = "28307da9f4ee2f66e57f";
	
	//手机号码，多个号码如13800000000,13800000001,13800000002
	private static String smsMob = "15178708627";
	
	//短信内容
	private static String smsText = "尊敬的用户，您的验证码为:";

	
	public static void main(String[] args) {
		//随机生成六位数
		int radndomNum=(int) ((Math.random()*9+1)*100000);

		HttpClientUtil client = HttpClientUtil.getInstance();
		
		//UTF发送
		int result = client.sendMsgUtf8(Uid, Key, smsText+radndomNum, smsMob);
		if(result>0){
			System.out.println("UTF8成功发送条数=="+result);
		}else{
			System.out.println(client.getErrorMsg(result));
		}
	}
}
