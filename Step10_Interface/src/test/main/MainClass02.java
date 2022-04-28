package test.main;

import test.mypac.Remocon;
import test.mypac.Control;

public class MainClass02 {
    public static void main(String[] args) {
		//직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드를 여기서 호출해 보세요.
    	 Remocon r1=new Control();
         useRemocon(r1);
    }
    // 위가 만들어지기도 전에 아래가 먼저 만들어졌다!!! interface type으로 받아쓸 것 이기 때문에!
    public static void useRemocon(Remocon r) {
        r.up();
        r.down();
	}
}
