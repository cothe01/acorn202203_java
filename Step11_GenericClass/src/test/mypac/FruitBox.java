package test.mypac;
/*
 *  T 는 type 파라미터 이다.
 *  
 *  저기에 전달된 클래스를 포괄 클래스(Generic 클래스)라고 한다.
 */
public class FruitBox<T> {
    //필드
	private T item;
    //필드에 값을 넣는 메소드
	public void setItem(T item) {
		this.item=item;
	}
	
	//필드에 저장된 값을 리턴하는 메소드
    public T getItem() {
    	return item;
    }
}

//new FruitBox(new Apple()); new FruitBox를 호출하면서
/*값을 고정시키는게 아니고, 여기에 뭘 담을지 용도에 따라서 의사결정을 할수 있게 하는게 좋겠다 해서 
클래스명뒤에다가 <T> 이런 기호만들면 문법이 성립
*/