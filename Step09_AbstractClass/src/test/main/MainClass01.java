package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 *  [ 추상클래스 (Abstract Class) ]
 *  
 *  - class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 *  - 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재할수 있다.
 *  - 형태만 정의된 메소드를 만들때는 abstract 예약어를 
 *  - 붙여서 메소드를 정의한다.
 *  - 생성자는 존재하지만 단독으로 객체 생성은 불가하다.
 *  - 추상클래스 Type 의 id 가 필요하다면 추상클래스를 상속받은 
 *  - 자식클래스를 정의해서 객체 생성한다.
 *  - 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 
 *    모두 오버라이드(재정의) 해야한다.
 */
public class MainClass01 {
    public static void main(String[] args) {
		//null에 어떻게 하면 Weapon type의 참조값을 얻을 수 있을까?
    	//Weapon w1=null;
    	Weapon w1=new MyWeapon();
		w1.prepare();
		w1.attack();
	}
}
/*
 *  우리는 application을 만들때 다른 사람이 만든 클래스를 import해서 객체를 생성해서 사용한다.
 *  기반시설은 자기들은 만드는데, 다 갖춰놓고, 프로젝트 상황에 맞게끔 알아서 오버라이드해라. 
 *  추상클래스 상속하면 강제 오버라이드 하게 되있음.
 *  자세한 부분까지 만들어줄수 없어서 비워둔채로 생성한것.
 * 
 *  클래스 제공자가 모든 기능을 완성해 놓을 수 없을때가 있다.
 */ 
