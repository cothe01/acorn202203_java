package test.mypac;

public class HandPhone extends Phone{
    
	public HandPhone() {
		System.out.println("HandPhone() 생성자 호출됨");
	}
	//메소드
	public void mobileCall() {
		System.out.println("이동중에 전화를 걸어요");
	}
	//사진 찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요"); 
    }
}
