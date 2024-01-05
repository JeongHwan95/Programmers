package 프로그래머스레벨1;

import java.util.Scanner;

public class Main01 {
	/*
	 * 백종원 제육볶음 레시피
	 * 4.5
	 * 재료는 먹기 좋은 크기로 썰어서 준비해주세요
	 * 고추장 2스푼, 간장 2스푼, 고춧가루 2스푼, 다진마늘 1스푼, 굴소스 1스푼, 올리고당 1스푼 넣어서 양념장을 이렇게 만들어주세요.
	 * 고기가 익어갈 때 설탕을 넣고 더 구워주세요
	 * 동물성 단백질로 구성된 식재료는 설탕부터 사용해야 단맛을 제대로 낼 수 있다고 해요
	 * 소금부터 넣거나 다른 것부터 간을 해버리면 설탕입자는 들어가지 않아서 고기에 단맛이 안베니깐 꼭 설탕부터 2스푼 넣습니다
	 * 기호에 따라 가감합니다.
	 * 손질해둔 야채와 양념잠을 넣고 볶아주세요
	 * 모든 재료가 다 익으면 재육볶음 끝
	 * 재료를 예쁘게 접시에 덜어 놓습니다
	 * 맛있게 먹습니다.
끝
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String title = sc.nextLine();
		float rank = sc.nextFloat();
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String input3 = sc.nextLine();
		String input4 = sc.nextLine();
		String input5 = sc.nextLine();
		String input6 = sc.nextLine();
		String input7 = sc.nextLine();
		String input8 = sc.nextLine();
		String input9 = sc.nextLine();
		String input10 = sc.nextLine();
		System.out.println();
		
		System.out.println("[ " + title + " ]");
		int intRate = (int)rank;
		System.out.println(intRate);
		double percentageRate = intRate * 100 / 5.0;
		System.out.println(percentageRate);
		System.out.println("1. " + input1);
		System.out.println("2. " + input2);
		System.out.println("3. " + input3);
		System.out.println("4. " + input4);
		System.out.println("5. " + input5);
		System.out.println("6. " + input6);
		System.out.println("7. " + input7);
		System.out.println("8. " + input8);
		System.out.println("9. " + input9);
		System.out.println("10. " + input10);
	}
}
