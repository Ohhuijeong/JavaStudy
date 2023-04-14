package t20230414;
//읽은 2개의 실숫값 중에서 큰 쪽을 표시(방법2: 조건 연산자)
import java.util.Scanner;

public class Train02 {

class Max2A {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수 a:"); double a = stdIn.nextDouble();
		System.out.println("실수 b:"); double b = stdIn.nextDouble();
		
		double max = a > b ? a : b;
		System.out.println("큰 쪽의 값은 " + max + "입니다.");
	}

}
}