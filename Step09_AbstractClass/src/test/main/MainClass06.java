package test.main;

import test.mypac.Weapon;

public class MainClass06 {
    public static void main(String[] args) {
		//Weapon 추상클래스 type 의 참조값이 필요하다면!
    	//Weapon 추상클래스를 상속받은 익명클래스
    	Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				System.out.print("공격해요!");
			}
		};
        //호출하면서 이안에서 직접 new Weapon 할수 있음	
		//특정메소드-오버라이드를 위한 익명클래스
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.print("공격해요!");
			}
		});
    }
   
    public static void useWeapon(Weapon w) {
	   w.prepare();
	   w.attack();
    }
}