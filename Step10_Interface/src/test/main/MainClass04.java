package test.main;

import test.mypac.Remocon;

public class MainClass04 {
   public static void main(String[] args) {
      Remocon r1=new Remocon() {
         @Override
         public void up() {
            System.out.println("올려요");
         }
         @Override
         public void down() {
            System.out.println("내려요");
         }
      };// class ? new 다음 단어*Remocon*가 class면 extends Weapon
        //       자동으로                  interface면 implements Remocon
      
      useRemocon(r1);
      //지역변수 만들 필요없이 메소드 호출하면서 직접 new
      useRemocon(new Remocon() {
         @Override
         public void up() {
            System.out.println("올려요");
         }
         
         @Override
         public void down() {
            System.out.println("내려요");
         }
      });
   }
   
   public static void useRemocon(Remocon r) {
      r.up();
      r.down();
      //ArrayList<E>
   }
}



