package test.main;
import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
    public static void main(String[] args) {
		//Remocon r1=null; import 해가지고 Remocon type의 지역변수를 만듬->Interface도 데이터 type 역할을 할수 있다.
    	//null 에 어떻게 입력을 하면 Remocon type 의 참조값을 얻어낼수 있는지
		//Remocon r1=new Remocon(); (Interface는 생성자가 없어서 단독으로 new 못함/추상클래스는 생성자는 있지만 new는 못함)
    	
    	//Remocon 인터페이스를 구현(implements) 한 클래스를 이용해서 Remocon type 의 참조값 얻어내기
    	Remocon r1=new MyRemocon();
    	r1.up();
    	r1.down();
    	
    	//인터페이스의 필드 참조 ( static final )
    	String result=Remocon.COMPANY;
	}
}
