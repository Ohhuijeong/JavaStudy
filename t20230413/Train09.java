package t20230413;

// 읽은 정숫값이 양수이면 10의 배수인지 판정해서 표시
import java.util.Scanner; // Scanner 클래스를 사용하기 위한 코드

class Multiple0f10 {
public class Train09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값:");
		int n = stdIn.nextInt();
		
		if (n > 0)
			if (n % 10 == 0)
				System.out.println("이 값은 10의 배수입니다.");
			else
				System.out.println("이 값은 10의 배수가 아닙니다.");
		else
			System.out.println("음의 정숫값을 입력했습니다.");

	}

}
}