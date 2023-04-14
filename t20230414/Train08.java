package t20230414;
//3개의 정수 중 중앙값 구하기
import java.util.Scanner;

public class Train08 {

public class Med3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a:32"); int a = stdIn.nextInt();
		System.out.println("정수 b:55"); int b = stdIn.nextInt();
		System.out.println("정수 c:12"); int c = stdIn.nextInt();
		
		int med;
		if (a >= b)
			if (b >= c)
				med = b;
			else if (a <= c)
				med = a;
			else
				med = c;
		else if (a > c)
			med = a;
		else if (b > c)
			med = c;
		else
			med = b;
		
		System.out.println("중앙값은 " + med +"입니다.");
	}
}
}