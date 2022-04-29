package test.main;

public class MainClass02 {
    public static void main(String[] args) {
		// 0으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums 에 담기
    	int[] nums= { 0 , 0 , 0 };
    	nums[0]=10;
    	nums[1]=20;
    	nums[2]=30;
        // 0으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums2 에 담기
    	int[] nums2=new int[3];
    	nums2[0]=100;
    	nums2[1]=200;
    	nums2[2]=300;
    	//nums2[3]=400; // ??? 없는 방번호를 참조 하면 Exception 이 발생한다.
    	
    	System.out.println("마무리 작업을 하고 app 을 종료합니다.");
	}
}

/*
 *배열의 초기값
 *int i = new int[3];
 *이와같이 배열을 만들어 사용할 땐, 따로 값을 지정해주지 않는 이상 default값이 들어가게되는데
  int의 경우는 0
  char의 경우는 '0'
  String의 경우는 null
  boolean의 경우는 false
  double의 경우는 0.0
  유저가 만든 클래스의 객체 = null
 *이 들어갑니다.
 */
