package test.main;

import test.mypac.*;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;
/*
 *  클래스 안에 만든 클래스 : inner class
 *  메소드 안에 만든 클래스 : local inner class
 */

public class MainClass03 {
    public static void main(String[] args) {
    	// Zoo 클래스에 있는 getMonkey() 메소드를 호출해서
        // 리턴되는 값을 m1 이라는 지역 변수에 담아 보세요.
    	Zoo z=new Zoo();
		Monkey m1=z.getMonkey();
        m1.say();
        
        // Zoo 클래스에 있는 getTiger() 메소드를 호출해서
        // 리턴되는 값을 t1 이라는 지역 변수에 담아 보세요.
        Tiger t1=z.getTiger();
        t1.say();
        
        // 메소드 안에도 클래스를 정의 할수 있다. (메소드 안에서만 쓸수 있는 클래스)
        class Gura{
        	public void say() {
        		System.out.println("안녕 나는 구라야!");
        	}
        }
        
        Gura g1=new Gura();
        g1.say();
    }
}
