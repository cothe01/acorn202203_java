package test.mypac;

public class SmartPhone extends HandPhone{
    //생성자
	public SmartPhone() {
		System.out.println("SmartPhone 생성자 호출됨");
	}
	
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	//부모의 메소드 재정의(Override)
    //원하는 메소드가 있으면 얼마든지 재정의 할 수 있다.
	@Override
	public void takePicture() {
		System.out.println("100만 화소의 고화질 사진을 찍어요!");
	}
}
