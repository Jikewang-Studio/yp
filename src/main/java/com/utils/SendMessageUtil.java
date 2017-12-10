package com.utils;
public class SendMessageUtil {

	//用户名
	private static String Uid = "eggs";

	//接口安全秘钥
	private static String Key = "28307da9f4ee2f66e57f";
	
	//手机号码，多个号码如13800000000,13800000001,13800000002
	private static String smsMob ;
	
	//短信内容
	private  String smsText = "尊敬的用户，您的验证码为:";
    private Integer radndomNum;
	//电话的get，set方法。
	public  String getSmsMob() {
		return smsMob;
	}
	public  void setSmsMob(String smsMob) {
		SendMessageUtil.smsMob = smsMob;
	}
    //随机验证码的get,set方法
	public Integer getRadndomNum() {
		return radndomNum;
	}
	public void setRadndomNum(Integer radndomNum) {
		this.radndomNum = radndomNum;
	}

	public  void sendMessage(){
//		//随机生成六位数。前端生成
//		int radndomNum=(int) ((Math.random()*9+1)*100000);

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
