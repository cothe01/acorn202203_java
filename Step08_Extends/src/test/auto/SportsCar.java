package test.auto;


public class SportsCar extends Car {

	public SportsCar(Engine engine) {
		super(engine);
	}
	@Override
	public void drive() {
		/*
		 *  ������(�������̵�) �� �θ� �޼ҵ带 ȣ���ؾ� ���� ������
		 *  ��Ȳ�� ���� �ٸ���.
		 *  � ��쿡�� �θ��� �޼ҵ带 ȣ���� ���� ������ ��ü��
		 *  ����� ������ ���ϴ� ��찡 �ִ�.
		 *  �׷� ��쿡�� �θ��� �޼ҵ带 �ݵ�� ȣ���� �־�� �Ѵ�.
		 */
		super.drive();//�θ� �޼ҵ带 ȣ������ ������ ���⼭ �����ؾ� �Ѵ�.
		System.out.println("���� �� ������ �ٿ��� ��û ������ �޷���");
	}
    
}
    