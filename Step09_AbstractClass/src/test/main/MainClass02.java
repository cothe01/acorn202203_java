package test.main;

import test.mypac.*;
public class MainClass02 {
    public static void main(String[] args) {
		//�������� ���� Ŭ������ ����� ��ü ������ �ؼ� �Ʒ��� useWeapon() �޼ҵ带 ȣ���� ������.
    	//Weapon w=new Going();
    	//useWeapon(w);
    	
    	Weapon w1=new Gun();
    	MainClass02.useWeapon(w1);
	}
    
    //�� �޼ҵ�� ���� ������ ������ �ϴ� �޼ҵ��� ��������(��� Ʋ)    
    public static void useWeapon(Weapon w) {
    	w.prepare();
    	w.attack();
    	
    }
}
/* java�� Ʋ�� ���� ���α׷����� �ϴ� ��찡 ����.(type�� �߻�Ŭ����)
 * MainClass02�� Weapon �߻�Ŭ������
 * �����е��� ���б� ������ �̹� ������� �־���.
 */

