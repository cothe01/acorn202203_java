package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	//static 메소드 안에서는 동일한 클래스안에서의 자원을 사용할때, 동일한 자원만 사용 가능하다.
	
	//내부 클래스(inner class)
	static class YourWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("공중 공격을 해요!");
	    }
	}
	//static main() 메소드 
    public static void main(String[] args) {
		Weapon w1=new YourWeapon();
		useWeapon(w1);
		
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("지겹다 이제 아무나 공격하자!");
			}
		}
		
		 Weapon w2=new OurWeapon();
	      useWeapon(w2);
    }

    public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
