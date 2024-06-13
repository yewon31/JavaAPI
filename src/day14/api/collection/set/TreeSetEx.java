package day14.api.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//set특징 + 정렬
		//사용하는 방법은 동일합니다.
		Set<String> set = new TreeSet<>();
		
		//문자열 같은경우 사전등재 순으로 정렬
		//숫자 경우, 오름차순 정렬
		set.add("망아지");
		set.add("강아지");
		set.add("송아지");
		set.add("강아지");
		set.add("하마");
		
		System.out.println(set.toString());
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
