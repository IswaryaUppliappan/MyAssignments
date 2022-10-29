package week1.day1;

public class Mobile {
	public void makecall() {
		String mobileModel="Samsung s2";
		float mobileWeight=115.9f;
		System.out.println("To make call");
	}
	public void sendMsg() {
		boolean FullCharged=true;
		int mobilecost=10000;
		System.out.println("To send Message");
		

	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makecall();
		obj.sendMsg();
		System.out.println("This is my mobile");
	}
}
