package test.main;
import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
    public static void main(String[] args) {
		//Remocon r1=null; import �ذ����� Remocon type�� ���������� ����->Interface�� ������ type ������ �Ҽ� �ִ�.
    	//null �� ��� �Է��� �ϸ� Remocon type �� �������� ���� �ִ���
		//Remocon r1=new Remocon(); (Interface�� �����ڰ� ��� �ܵ����� new ����/�߻�Ŭ������ �����ڴ� ������ new�� ����)
    	
    	//Remocon �������̽��� ����(implements) �� Ŭ������ �̿��ؼ� Remocon type �� ������ ����
    	Remocon r1=new MyRemocon();
    	r1.up();
    	r1.down();
    	
    	//�������̽��� �ʵ� ���� ( static final )
    	String result=Remocon.COMPANY;
	}
}
