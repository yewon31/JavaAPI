package day13.api.lang.object;

//Cloneable 인터페이스 : clone() 가능성 명시
public class Person implements Cloneable {
	
	private String name;

	//alt + shift + s
	
	/*** Generate Constructor using Fileds ***/
	public Person(String name) {
		this.name = name;
	}

	/*** Generate getters and setters ***/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*** Overide/Implement Methods ***/
	@Override
	public boolean equals(Object obj) {
		//obj가 가지고 있는 이름이 같으면, true반환
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if( p.getName().equals(this.name) ) {
				return true;
			}
		}
		return false;
	}

	/*** Overide/Implement Methods(Generate toString) ***/
	//멤버변수의 값을 한눈에 확인할수 있도록 overriding
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	/*** Overide/Implement Methods ***/
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		//객체 소멸 시기는 정확히 알 수 없음
		super.finalize();
		System.out.println("객체 소멸");
	}
}
