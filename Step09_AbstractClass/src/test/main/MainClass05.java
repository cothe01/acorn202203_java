package test.main;

import test.mypac.Weapon;

public class MainClass05 {
   /* �ʵ� */
   //Weapon type�� �������� ����!!!
	
   //static String str="kim"; static �ʵ� ����
   //static String str=new String("kim"); �ʵ忡���� ���Կ����� �������� new�� �����ؼ� ���� ���� ������ ����
   
   //Weapon w1; non-static �ʵ�, ���� �ϸ� null �� �������
   
	//static �޼ҵ�ȿ����� static �ڿ��� ���� �ִ�.
   static Weapon w1=new Weapon() {
   //�߻�Ŭ������ �ܵ����� ��ü ������ �Ұ����ϴ�.(�������̵�)  
      @Override
      public void attack() {
         System.out.println("���� �𸣰����� ��������!");
      } /*�޼ҵ�*/
      
   };/*Ŭ����*/
   //�͸�Class(Ŭ������ �̸��� ����)
   //�̸��� ������, new �ڿ��ִ� Ŭ������ (Weapon �̶�� Ŭ����) �ڵ����� ��ӹްԵ�
   //new ������ ��� �ް� ���� Ŭ�������� ������ ��
   // class ? extends Weapon{ }
   //Ŭ������ ���� �ȸ���� Weapon type�� �������� �� �� �ִ�.
   
   public static void main(String[] args) {
	  //���⼭ useWeapon �޼ҵ带 ȣ���ؼ� ����Ϸ���!
	  //useWeapon �޼ҵ带 ȣ���ϸ鼭 field �� �ִ� ���� ����ϰ� ����
      useWeapon(w1);
      //�޼ҵ� �ȿ��� Ŭ���� �ۼ��Ҽ� �ִ�.
      //Weapon type �� �������� ���� ���� w2�� ��Ƶδ� ���
      Weapon w2=new Weapon() {
         @Override
         public void attack() {
            System.out.println("����? �̰͵� �����ϳ�?");
         }
      };
      //������ ��� �ѹ��� ���� ���
      useWeapon(w2);
      //������ ���� �ʰ� �����ϴ� ���(�޼ҵ� ȣ���ϸ鼭, ��ü�� ���� new �ؼ� ���� ���� ������, ���� (�̾ȿ���) ���� ������� ����)      
      //�߻�Ŭ���� type�� �������� �Ｎ���� ������ �ִ�.
      useWeapon(new Weapon() {
         @Override
         public void attack() {
            System.out.println("����? �̰͵� �����ϳ�?");
         }
      });
      
   }
   //Weapon type �� ������ �������!!   
   public static void useWeapon(Weapon w) {
      w.prepare();
      w.attack();
   }
}









