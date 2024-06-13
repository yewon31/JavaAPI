package day14.api.collection.list;

import java.util.Stack;

public class StrackEx {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		//스택 값 추가
		stack.push(1);
		stack.push(2);
		stack.push(3); //마지막에 들어감

		//스택의 들어있는 값을 문자열로 확인
		System.out.println( "stack.toString() : " + stack.toString() );
		System.out.println();

		//스택 값 삭제
		System.out.println("pop : " + stack.pop());
		System.out.println( "stack.toString() : " + stack.toString() );
		System.out.println();

		//스택의 크기
		System.out.println("스택 크기 : " + stack.size() );
		System.out.println();
		
		//스택에서 값을 얻음. peek()
		System.out.println("peek : " + stack.peek());
		System.out.println( "stack.toString() : " + stack.toString() );
		System.out.println();
		
		//스택이 비어있는지 확인
		System.out.println( stack.isEmpty() ); //스택이 비엇다면 true
	}
}