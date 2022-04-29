package test.main;
import test.mypac.Phone;
import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass04 {
    public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 Phone type p1 이라는 지역변수에 담아 보세요.
    	Phone p1 = new SmartPhone();
    	//p1 에 들어 있는 참조값을 이용해서 전화를 걸고 싶다면?
    	p1.call();
    	//p1 에 들어 있는 참조 값을 이용해서 이동중에 전화를 걸고 싶다면?
    	//부모 type은 자식 type에 그냥 담기지 않는다.
    	//HandPhone p2=p1; 에러
    	HandPhone p2=(HandPhone)p1;
    	p2.mobileCall();
        //p1 에 들어 있는 참조값을 이용해서 인터넷을 하고 싶다면?
        SmartPhone p3=(SmartPhone)p1;
    	p3.doInternet();
    	
    	//new 생성된 객체가 같으므로 참조값들은 같음
    	//boolean result = p1 == p2;
	}
}
