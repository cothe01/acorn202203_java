package test.main;
/*
 *  3. �񱳿����� �׽�Ʈ
 *     �񱳿����� ����� boolean type �� �������ش�.
 *     
 *  ==, != , > , >= , < , <=   
 * 
 */
public class MainClass03 {
    public static void main(String[] args) {
		boolean result1 = 10 == 10; //true
		boolean result2 = 10 != 10; //false
		boolean result3 = 10 > 10; //false
		boolean result4 = 10 >= 10; //true
		boolean result5 = 10 < 10; //true
		boolean result6 = 10 <= 10; //true
		
		// String type ���� name �� null �����ϱ�
		// null �� ���������� Ÿ���� ��� �� �ִ� �� ����(in java)
		String name=null; 
		
		// null ���� �ƴ��� �񱳿����ڷ� �񱳰� �����ϴ� (�� java ���� null ���� �񱳰� ����)
		boolean result7 = name == null; //true
		boolean result8 = name != null; //false
		if(name != null) {
			int size=name.length();
		}
		//int size=name.length();
		//NullPointer Exception ��Ʈ���� �������� . �� ����µ�, name �̶� ������ �������� �ȵ�� ����.)
	}
}
