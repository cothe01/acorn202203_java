package test.main;

import test.mypac.Remocon;
import test.mypac.Control;

public class MainClass02 {
    public static void main(String[] args) {
		//���� Ŭ������ test.mypac ��Ű���� ���Ϸ� ���� useRemocon() �޼ҵ带 ���⼭ ȣ���� ������.
    	 Remocon r1=new Control();
         useRemocon(r1);
    }
    // ���� ��������⵵ ���� �Ʒ��� ���� ���������!!! interface type���� �޾ƾ� �� �̱� ������!
    public static void useRemocon(Remocon r) {
        r.up();
        r.down();
	}
}
