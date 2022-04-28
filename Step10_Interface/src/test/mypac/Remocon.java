package test.mypac;
/*
 *  [ interface ]
 * 
 *  -생성자가 없다 (단독 객체 생성 불가)
 *  -{}구현된 메소드는 가질수 없다 (()추상 메소드만 가질수 있다)
 *   추상클래스는 구현된 것도 가질수 있고, 구현되지 않은 것도 가질 수 있다.
 *   굳이, abstract 라는 예약어는 붙여줄 필요가 없다.
 *  -필드는 static final 상수만 가질수 있다.
 *  -data type 의 역할을 할 수 있다.
 *  -interface type 의 참조값이 필요하면 구현(implements) 클래스를 만들어서
 *   객체를 생성해야 한다.
 *  -클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다.
 */

public interface Remocon {
	//필드는 static final 필드만 가질 수 있다.
	public static final String COMPANY="LG"; //final은 값을 변경 못시키게 상수화시키는것(상수의 이름은 대문자)
	//public static final double PI=3.14159;// 참조하고 싶으면 Remocon.PI Remocon.COMPANY
    
	//메소드는 추상 메소드만 정의할 수 있다.
	public void up();
	public void down();
    
}
