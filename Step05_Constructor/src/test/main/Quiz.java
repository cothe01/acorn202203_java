package test.main;

import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
		/*
		 *  ������ ������ ���ڸ� ���� �ʹٸ�
		 *  Random ��ü�� Ȱ���ؾ� �Ѵ�.
		 *  ���� new Random() �ؼ� ��ü�� ������
		 *  ��ü�� �޼ҵ带 �̿��ؼ� ������ ���ڸ� �� ����
		 */
    	Random ran=new Random();
    	// 0~10 ������ ������ ���� �ϳ��� ���� ranNum �̶�� ���� ������ ��� ������.
    	int ranNum=ran.nextInt(11);
    	// 1~45 ������ ������ ���� �ϳ��� ���� ranNum2 �̶�� ���� ������ ��� ������.
    	int ranNum2=ran.nextInt(45)+1;
    	// true or false �߿� ������ boolean ���� ���� isRun �̶�� ���� ������ ��� ������.
    	boolean isRun=ran.nextBoolean();
	}
}
/*
 * �ʿ��� ��ü�� �����ϱ� ����
   �̹� java ���� �����Ǵ� Ŭ������ import �ؼ� 
   ��ü�� �����ϰ� �� ��ü�� non static �޼ҵ带 
   Ȱ���ؼ� �۾��� �ߴ�.
 * new�ؼ� �������� . �� ���
 * �� case�� �̷� ������� �����ذ�.
 * ran�� Random �� ���� ��뼳��.
*/