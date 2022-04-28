package test.main;

import test.mypac.Drill;

public class MainClass06 {
    public static void main(String[] args) {
	// �͸�Ŭ���� Ȱ���ؼ� Drill �������̽��� ����(�޼ҵ带 ���ϸ鼭 �޼ҵ带 �����ϴ� ����)
    // class ? implements Drill {} 	
    
    // �ڹٿ����� �޼ҵ尡 class, ��ü �ȿ� ���� �־�� �Ѵ�.
    // (heap ���� new Drill �� ��ü �ȿ� ���� �ִ�. static ������ class �ȿ� �����Ҽ� �ִ�.)
    
    	
    	useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("�ٴڿ��� ������ �վ��!");
				}
		});
    	
    	// �޼ҵ尡 �ϳ��� ��쿡�� ����
    	useDrill(()->{
    		System.out.println("õ�忡 ������ �վ��!");
    	});
	}
    
    //1���� �߻�޼ҵ�� �����Ǿ� �ִ� Drill ��ü�� ���ڷ� ���޹޴� �޼ҵ�
    public static void useDrill(Drill d) {
    	d.hole();
    }
}



/* �ڹٽ�ũ��Ʈ������ �Լ��� ��ü
   �Լ� ȣ���ϸ鼭 �Լ������ϴ°� ����(������ ���� �� �ִ�.)
 
   let f = function(){}
  
 */