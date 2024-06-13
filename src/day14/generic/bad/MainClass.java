package day14.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//저장을 문자열
		ABC abc= new ABC();
		abc.setObj("홍길동");
		String str= (String)abc.getObj();
		
		//저장을 Person
		abc.setObj( new Person() );
		Person p = (Person)abc.getObj();
	}
}