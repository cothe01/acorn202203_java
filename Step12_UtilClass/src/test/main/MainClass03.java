package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
    /*
     *  Scanner ��ü�� �̿��ؼ� �ݺ��� ���鼭 ģ�� �̸��� 3�� �Է� �޾Ƽ� 
     *  �Է¹��� �̸��� ArrayList ��ü�� ������� ������ �ϴ� ���α׷����� �� ������.
     * 
     *  -hint
     *  Scanner scan=new Scanner(System.in);
     */
	 public static void main(String[] args) {
		 
		 //Ű����� ���� �Է� ���� ��ü
		 Scanner scan=new Scanner(System.in);
		 //�Է¹��� ���ڿ��� ������ ��ü
	     ArrayList <String> names= new ArrayList<>();
	      
	     for(int i=0; i<3; i++) {
	        System.out.print("ģ���� �̸��� �Է��ϼ���:");
	        String sn=scan.nextLine();
	        names.add(sn);
	     }
	     
	     //����� ������ �ݺ��� ���鼭 ������� ����ϱ�
	     for(int i=0; i<names.size(); i++) {
	         //i��° item
	    	 // .get() �޼ҵ尡 �������ִ� type �� String �� ������? ArrayList<String> �̱� �����̴�.
	    	 String tmp=names.get(i);
	    	 System.out.println(tmp);
	     }
	     
	     System.out.println("---------");
	     
	     //Ȯ�� for �� (�ݺ��� ���鼭 �޾ƿ� ���׸� type �� �� ������ ��)
         for(String tmp:names) {
        	 System.out.println(tmp);
	     }
	 }
	 
}
