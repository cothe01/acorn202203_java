package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
    public static void main(String[] args) {
		//Student s1=new Student();
    	//s1.study();
    	/* ��ü�� �����ؼ� �ѹ��� ����ҰŶ��?
    	   ��ȸ������ ����ϰ� �ʹٸ�?
    	   ���������� ����°� ����
    	*/
    	new Student().study();
    	new Student().goSchool();
		// Student Ŭ������ �⺻(default) ������(constructor)�� ȣ���ؼ� ��ü�� �����Ѵٴ� �ǹ�
		// �����ڴ� return type �� ����, class ��� �����ϴ�.
		Member m1=new Member(1, "�豸��", "�뷮��");
		Member m2=new Member(2, "�ذ�", "��ŵ�");
		
		Member m3=new Member();
		
	    //�ϳ� �� ���� �ϰ� ������ Ŭ�������� �ϳ� �� �����ϸ� ��
		//new Scanner
	}
}
