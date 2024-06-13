package day13.api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Object클래스의 메서드들
		 * 1. equals() : 동일객체인지 확인
		 * 2. toString() : 객체주소를 문자열로 반환 - 오버라이딩해서 많이사용함.
		 * 3. hashCode() : 객체의 (거의)고유한 숫자값 반환
		 * 4. clone() : 객체를 복사, protected이므로 lang package에서만 사용 가능, super로 접근 가능
		 * 5. finallize() : 객체가 소멸되기 전에 실행, Deprecated
		 * 		- Deprecated는 컴퓨터 소프트웨어 개발에서 더 이상 사용하지 않고 앞으로 사라질 예정인 기능을 의미
		 * 		- @Deprecated(since="9") //9버전부터는 동작이 안될 수 있으니 사용하지마세요.
		 */
		
		Person a = new Person("홍길동");
		Person b = new Person("홍길동");
		
		/*** equals() ***/
		//오버라이딩
		boolean result = a.equals(b);
		System.out.println("같은객체?:" + result); //오버라이딩x : false / 오버라이딩o : true

		/*** toString() ***/
		//오버라이딩 - Generate toString(많이 사용)
		System.out.println(a.toString() );
		
		/*** hashCode() ***/
		System.out.println("중복이 없는 고유한 숫자값 : " + a.hashCode() );
		System.out.println("중복이 없는 고유한 숫자값 : " + b.hashCode() );

		/*** clone() ***/
		try {
			Person clone = (Person)a.clone();
			System.out.println("복제인간 : " + clone.toString() );
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		/*** finallize() ***/
		//가비지컬렉터가 순서를 보장하지 않기 때문에 권장하지않음
		a = null;
		b = null;
		System.gc(); //가비지컬렉터 호출
		
		
		
	}
}
