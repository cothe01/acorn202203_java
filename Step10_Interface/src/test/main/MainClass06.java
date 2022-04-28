package test.main;

import test.mypac.Drill;

public class MainClass06 {
    public static void main(String[] args) {
	// 익명클래스 활용해서 Drill 인터페이스를 구현(메소드를 콜하면서 메소드를 전달하는 느낌)
    // class ? implements Drill {} 	
    
    // 자바에서는 메소드가 class, 객체 안에 속해 있어야 한다.
    // (heap 영역 new Drill 한 객체 안에 속해 있다. static 영역의 class 안에 존재할수 있다.)
    
    	
    	useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에서 구멍을 뚫어요!");
				}
		});
    	
    	// 메소드가 하나인 경우에만 가능
    	useDrill(()->{
    		System.out.println("천장에 구멍을 뚫어요!");
    	});
	}
    
    //1개의 추상메소드로 구성되어 있는 Drill 객체를 인자로 전달받는 메소드
    public static void useDrill(Drill d) {
    	d.hole();
    }
}



/* 자바스크립트에서는 함수가 객체
   함수 호출하면서 함수전달하는게 가능(변수에 담을 수 있다.)
 
   let f = function(){}
  
 */