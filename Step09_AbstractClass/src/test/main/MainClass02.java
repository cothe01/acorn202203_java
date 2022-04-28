package test.main;

import test.mypac.*;
public class MainClass02 {
    public static void main(String[] args) {
		//여러분이 직접 클래스를 만들고 객체 생성을 해서 아래의 useWeapon() 메소드를 호출해 보세요.
    	//Weapon w=new Going();
    	//useWeapon(w);
    	
    	Weapon w1=new Gun();
    	MainClass02.useWeapon(w1);
	}
    
    //이 메소드는 아주 복잡한 동작을 하는 메소드라고 가정하자(기반 틀)    
    public static void useWeapon(Weapon w) {
    	w.prepare();
    	w.attack();
    	
    }
}
/* java는 틀에 박힌 프로그래밍을 하는 경우가 많음.(type이 추상클래스)
 * MainClass02와 Weapon 추상클래스는
 * 여러분들이 중학교 시절에 이미 만들어져 있었다.
 */

