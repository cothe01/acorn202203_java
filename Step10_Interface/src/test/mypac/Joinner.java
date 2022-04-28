package test.mypac;
//두 문자열을 연결해서 리턴해주는 메소드
@FunctionalInterface
public interface Joinner {
    public String join(String one, String two);
}
