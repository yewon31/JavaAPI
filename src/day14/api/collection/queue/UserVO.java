package day14.api.collection.queue;

public class UserVO implements Comparable<UserVO> { //비교할 대상

	private String name;
	private int age;

	public UserVO() {
	}

	public UserVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this. name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(UserVO o) {
		//내꺼랑, 매개변수(다음)랑 비교해서 정렬
		//이름으로 대소비교
		//return this.name.compareTo( o.getName() ) ; //이름 오름차순 ㄱㄴㄷ
		//return o.getName().compareTo(this.name); //이름 내림차순 ㄷㄴㄱ
		
		//나이로 대소비교
		//return Integer.compare(this.age, o.getAge()); //양수, 숫자 오름차순 123
		return Integer.compare(o.getAge(), this.age); //음수, 숫자 내림차순 321
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}
	
	
}
