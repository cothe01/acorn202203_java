package test.mypac;
/*
 *  [ 생성자 ]
 *  
 *  1. 클래스명과 동일하다
 *  2. 메소드 모양과 유사 하지만 리턴 type 이 없다.
 *  3. 객체를 생성할때 (new 할때) 호출된다.
 *  4. 객체를 생성하는 시점에 무언가 준비 작업을 할때 유용하다.
 *  5. 생성자를 명시적으로 정의하지 않아도 기본 생성자는 있다고 간주된다.
 */

public class Student {
    //생성자 
	/*생성자는 객체가 생성되는 시점(new하는 시점)에 뭔가 준비작업을 할게 있으면
	생성자 안에서 작업을 하면 된다.*/
	public Student() {
		System.out.println("Student 클래스의 생성자 호출됨");
	}
	
	//메소드
	public void study() {
		System.out.println("공부를 해요");
	}
    public void goSchool() {
    	System.out.println("학교에 가요");
    }
}
