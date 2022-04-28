package test.main;

import test.mypac.Weapon;

public class MainClass05 {
   /* 필드 */
   //Weapon type의 참조값을 얻어내기!!!
	
   //static String str="kim"; static 필드 선언
   //static String str=new String("kim"); 필드에서는 대입연산자 우측에서 new로 생성해서 값을 집어 넣을수 있음
   
   //Weapon w1; non-static 필드, 선언만 하면 null 이 들어있음
   
	//static 메소드안에서는 static 자원만 쓸수 있다.
   static Weapon w1=new Weapon() {
   //추상클래스는 단독으로 객체 생성이 불가능하다.(오버라이드)  
      @Override
      public void attack() {
         System.out.println("뭔진 모르겠지만 공격하자!");
      } /*메소드*/
      
   };/*클래스*/
   //익명Class(클래스에 이름이 없음)
   //이름은 없지만, new 뒤에있는 클래스를 (Weapon 이라는 클래스) 자동으로 상속받게됨
   //new 다음에 상속 받고 싶은 클래스명을 적으면 됨
   // class ? extends Weapon{ }
   //클래스를 굳이 안만들고 Weapon type의 참조값을 얻어낼 수 있다.
   
   public static void main(String[] args) {
	  //여기서 useWeapon 메소드를 호출해서 사용하려면!
	  //useWeapon 메소드를 호출하면서 field 에 있는 값을 사용하고 싶음
      useWeapon(w1);
      //메소드 안에서 클래스 작성할수 있다.
      //Weapon type 의 참조값을 얻어내서 변수 w2에 담아두는 방법
      Weapon w2=new Weapon() {
         @Override
         public void attack() {
            System.out.println("오잉? 이것도 공격하네?");
         }
      };
      //변수에 담아 한번만 쓰는 방법
      useWeapon(w2);
      //변수에 담지 않고 전달하는 방법(메소드 호출하면서, 객체를 직접 new 해서 만들어서 집어 넣은것, 값을 (이안에서) 직접 만들수도 있음)      
      //추상클래스 type의 참조값을 즉석에서 얻어낼수도 있다.
      useWeapon(new Weapon() {
         @Override
         public void attack() {
            System.out.println("오잉? 이것도 공격하네?");
         }
      });
      
   }
   //Weapon type 을 전달을 해줘야함!!   
   public static void useWeapon(Weapon w) {
      w.prepare();
      w.attack();
   }
}









