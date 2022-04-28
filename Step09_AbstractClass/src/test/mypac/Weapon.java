package test.mypac;

//미완성된 추상메소드를 멤버로 가지고 있는 클래스는 abstract 예약어를 붙여서 정의 해야 한다.
public abstract class Weapon {
   
	// 무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	
	//공격을 하는 메소드의 모양만 정의하고 실제 구현은 하지 않기
	//미완성된 추상메소드를 만들때는 abstract 예약어가 필요하다
   	public abstract void attack();
}

/* 미 완 성 의 클래스
 
   완성 클래스면 new Weapon() 할 수 있는것이고, 그 참조값은 w1에 담을 수 있는것인데
   Weapon w1= new Weapon(); 
   w1.prepare(); 성립 됨
   w1.attack(); 성립 안됨
   모양은 멀쩡해서 data type 역할은 충분하지만 메소드가 빠져있다.
*/