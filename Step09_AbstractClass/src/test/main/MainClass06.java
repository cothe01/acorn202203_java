package test.main;

import test.mypac.Weapon;

public class MainClass06 {
    public static void main(String[] args) {
		//Weapon �߻�Ŭ���� type �� �������� �ʿ��ϴٸ�!
    	//Weapon �߻�Ŭ������ ��ӹ��� �͸�Ŭ����
    	Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				System.out.print("�����ؿ�!");
			}
		};
        //ȣ���ϸ鼭 �̾ȿ��� ���� new Weapon �Ҽ� ����	
		//Ư���޼ҵ�-�������̵带 ���� �͸�Ŭ����
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.print("�����ؿ�!");
			}
		});
    }
   
    public static void useWeapon(Weapon w) {
	   w.prepare();
	   w.attack();
    }
}