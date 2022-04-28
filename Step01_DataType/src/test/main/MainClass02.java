package test.main;

public class MainClass02 {
    public static void main(String[] args) {
	    System.out.println("main 메소드가 시작 되었습니다");
	    //국어점수;
	    int kor=95;
	    //영어점수
	    int eng=100;
	   
	    //국어 점수와 영어 점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해 보세요.
	   
	    double ave=(kor+eng)/2d;
	    System.out.println("평균:"+ave);
	    /*
	     * 정수+정수=정수
	     * 정수/정수=정수
	     * Java에서는 정수끼리 연산을 하면 결과는 정수밖에 안나옴.
	     * 소수점이 짤릴 우려가 있음.
	     * 연산을 하는 어느 하나라도 실수가 되야함. 
	     * 실수를 만들어주는 방법 2.0; or 2d; 2f;
	     */
   }
}
