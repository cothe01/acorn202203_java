package test.mypac;
/*
 *  [ interface ]
 * 
 *  -�����ڰ� ���� (�ܵ� ��ü ���� �Ұ�)
 *  -{}������ �޼ҵ�� ������ ���� (()�߻� �޼ҵ常 ������ �ִ�)
 *   �߻�Ŭ������ ������ �͵� ������ �ְ�, �������� ���� �͵� ���� �� �ִ�.
 *   ����, abstract ��� ������ �ٿ��� �ʿ䰡 ����.
 *  -�ʵ�� static final ����� ������ �ִ�.
 *  -data type �� ������ �� �� �ִ�.
 *  -interface type �� �������� �ʿ��ϸ� ����(implements) Ŭ������ ����
 *   ��ü�� �����ؾ� �Ѵ�.
 *  -Ŭ���� ����� ���� ���������, �������̽��� ���� ������ �����ϴ�.
 */

public interface Remocon {
	//�ʵ�� static final �ʵ常 ���� �� �ִ�.
	public static final String COMPANY="LG"; //final�� ���� ���� ����Ű�� ���ȭ��Ű�°�(����� �̸��� �빮��)
	//public static final double PI=3.14159;// �����ϰ� ������ Remocon.PI Remocon.COMPANY
    
	//�޼ҵ�� �߻� �޼ҵ常 ������ �� �ִ�.
	public void up();
	public void down();
    
}
