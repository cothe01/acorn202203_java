package test.mypac;
//Interface는 다중구현이 가능하다. (Class는 안됨)
public class MultiObject implements Remocon, Drill{

	@Override
	public void up() {
		System.out.println("올려요");
		
	}

	@Override
	public void down() {
		System.out.println("내려요");
		
	}

	@Override
	public void hole() {
		System.out.println("구멍을 뚫어요");
		
	}

}
/*
 type m = new MultiObject();
 Object
 MultiObject
 Remocon
 Drill
 
 객체를 생성했는데 용도에 맞게 받는 경우도 있다.
 
*/