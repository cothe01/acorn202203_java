package test.main;

public class MainClass08 {
    public static void main(String[] args) {
		String str="adcde12345";
		int result=str.length();
		char result2=str.charAt(1);
		
	    /*
	     *String ��ü�� �޼ҵ带 Ȱ���ؼ�  
	     *str ���� �ȿ� �ִ� ���ڸ� ��� �빮��(UpperCase)�� ��ȯ�ؼ�
	     *str2 ��� �̸��� ������ ��� ������.
	     */
	    String st2=str.toUpperCase();
	    
	 
	    String greet="Hello! mimi, Bye mimi";
	    //���� ���ڿ����� mimi ��� ���ڿ��� mama ��� ���ڿ��� ��ü�ؼ� ����� greet2�� ��� ������.
		//String ��ü�� �޼ҵ带 Ȱ���ؼ�   
	    String greet2=greet.replace("mimi", "mama");
	    
	    String message="My name is Kimgura";
	    /*
	     * 1.���� ���ڿ��� My��� ���ڿ��� �����ϴ��� ����(true or false)�� isStart��� ������ ��� ������.
	     * 
	     * 2.���� ���ڿ����� i�� ���ڿ��� ���° �ε����� ��ġ�ϰ� �ִ����� index��� ������ ��� ������. 
	     */
	    boolean isStart=message.startsWith("My");
	    int index=message.indexOf("i");
	}
}
