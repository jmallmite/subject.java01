public class ForSample {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) { // 1~10까지반복
			sum += i;
			System.out.print(i); // 더하는수출력
			if (i <= 9) // 1~9까지는'+' 출력
				System.out.print("+");
			else { // i가10인경우
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈결과출력
			}
		}
	}
}