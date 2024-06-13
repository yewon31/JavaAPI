package day13.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		//배열관련 클래스 Arrays
		int[] arr = {3, 4, 5, 1, 2, 6, 7, 9, 10 };

		//배열 정렬
		Arrays.sort(arr);
		//Arrays.sort(ar, Collections.reverseOrder() );

		//문자열로 출력
		System.out.println( Arrays.toString(arr) );
		Arrays.sort(arr);
		//내림차순은 wrapper클래스만 가능
		//Arrays.sort(arr, Collections.reverseOrder() ); 

		//문자열로 출력
		System.out.println( Arrays.toString(arr) );

		//요소 검색 binarySearch (선행조건 - 정렬)
		int index = Arrays.binarySearch(arr, 3);//배열, 찾을값
		System.out.println("3이있는 위치:" + index);

		//배열복사
		int[] newArr = Arrays.copyOf(arr, arr.length * 2); //배열, 복사할길이
		System.out.println( Arrays.toString(newArr));
		int[] newArr2 = Arrays.copyOfRange(arr, 3, 5);//3~5미만 인덱스 까지 복사
		System.out.println( Arrays.toString(newArr2) );
		
		//배열 비교 equals(배열1, 배열2)
		int[] scores = {75, 47, 23, 56, 89};
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		if(Arrays.equals(scores, scores2)) {
			System.out.println("배열의 각 항목이 모두 일치함.");
		}else {
			System.out.println("배열의 각 항목이 일치하지 않음.");
		}
	}
}


		
		