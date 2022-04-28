package test.mypac;
// 숫자 두개를 인자로 전달받아서, 숫자를 (자기 마음대로)계산해서 결과값을 리턴해주는 메소드 
@FunctionalInterface
public interface Calc {
    public double exec(double num1, double num2);
}
