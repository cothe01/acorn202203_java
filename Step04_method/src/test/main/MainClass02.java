package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass02 {
    public static void main(String[] args) {
    	//Messenger m=new Messenger();
    	//m.getMessage();
    	//사용하지도 않는 쓸데없는 객체를 생성한것.
    	
		//Messenger 클래스에 만든 static 메소드 3개를 호출하는 code 를 작성해 보세요.
    	Messenger.sendMessage("hi");
    	Messenger.getMessage();
    	Messenger.useCar(new Car());
    
	}
}
