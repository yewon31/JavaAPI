package day14.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random ran = new Random();

		double d = ran.nextDouble(); //0.0이상 1.0미만의 실수 랜덤수
		System.out.println(d);

		int i = ran.nextInt(); //정수범위의 랜덤수
		System.out.println(i);

		int j = ran.nextInt(10); //0~10 미만 랜덤수
		System.out.println(j);
	}
}


		
		