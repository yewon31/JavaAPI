package day14.generic.basic;

public class MainClass {

	public static void main(String[] args) {

		//ABC abc= new ABC();
		
		/*** 문자열 ***/
		ABC<String> abc = new ABC<String>();
		abc.setT("홍길동"); //저장
		String name = abc.getT(); //꺼냄
		
		/*** Person ***/
		ABC<Person> abc2 = new ABC<>(); //뒤 <> 생략 가능
		abc2.setT(new Person()); //저장
		Person p = abc2.getT(); //꺼냄
		
		//<>는 객체타입만 사용가능
		ABC<Integer> abc3 = new ABC<>(); //wrapper
		
		//멀티제네릭 객체 생성
		DEF<Integer, String> def= new DEF<>();

		def.put(1, "홍길동"); //1번 홍길동
		String n = def.get(1); //1번 값을 받음
		
	}
}