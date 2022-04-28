package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
    public static void main(String[] args) {
		//Student s1=new Student();
    	//s1.study();
    	/* 객체를 생성해서 한번만 사용할거라면?
    	   일회용으로 사용하고 싶다면?
    	   지역변수를 만드는게 낭비
    	*/
    	new Student().study();
    	new Student().goSchool();
		// Student 클래스의 기본(default) 생성자(constructor)를 호출해서 객체를 생성한다는 의미
		// 생성자는 return type 이 없고, class 명과 동일하다.
		Member m1=new Member(1, "김구라", "노량진");
		Member m2=new Member(2, "해골", "행신동");
		
		Member m3=new Member();
		
	    //하나 더 정의 하고 싶으면 클래스에서 하나 더 정의하면 됨
		//new Scanner
	}
}
