package test.mypac;

//�̿ϼ��� �߻�޼ҵ带 ����� ������ �ִ� Ŭ������ abstract ���� �ٿ��� ���� �ؾ� �Ѵ�.
public abstract class Weapon {
   
	// ���� �۵��� �غ��ϴ� �޼ҵ�
	public void prepare() {
		System.out.println("���� �۵��� �غ� �մϴ�.");
	}
	
	//������ �ϴ� �޼ҵ��� ��縸 �����ϰ� ���� ������ ���� �ʱ�
	//�̿ϼ��� �߻�޼ҵ带 ���鶧�� abstract ���� �ʿ��ϴ�
   	public abstract void attack();
}

/* �� �� �� �� Ŭ����
 
   �ϼ� Ŭ������ new Weapon() �� �� �ִ°��̰�, �� �������� w1�� ���� �� �ִ°��ε�
   Weapon w1= new Weapon(); 
   w1.prepare(); ���� ��
   w1.attack(); ���� �ȵ�
   ����� �����ؼ� data type ������ ��������� �޼ҵ尡 �����ִ�.
*/