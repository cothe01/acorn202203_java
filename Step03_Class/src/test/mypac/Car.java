package test.mypac;
/*
 *   class 의 역활
 *  
 *   1. 객체의 설계도 역활
 *   
 *   2. data type 역활
 *   
 *   3. static 필드와 메소드를 포함하는 역활
 */
public class Car {
	//저장소(field)
	public String name;
	
    //달리는 기능(method)
    public void drive() {
    	System.out.println(this.name+" 이(가) 달려요!");
    }
    //멈추는 기능(method)
    public void stop() {
        System.out.println("멈춰요!");
    }
}
