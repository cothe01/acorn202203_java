package test.mypac;
//Interface�� ���߱����� �����ϴ�. (Class�� �ȵ�)
public class MultiObject implements Remocon, Drill{

	@Override
	public void up() {
		System.out.println("�÷���");
		
	}

	@Override
	public void down() {
		System.out.println("������");
		
	}

	@Override
	public void hole() {
		System.out.println("������ �վ��");
		
	}

}
/*
 type m = new MultiObject();
 Object
 MultiObject
 Remocon
 Drill
 
 ��ü�� �����ߴµ� �뵵�� �°� �޴� ��쵵 �ִ�.
 
*/