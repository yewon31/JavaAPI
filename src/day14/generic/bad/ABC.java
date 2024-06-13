package day14.generic.bad;

public class ABC {

	//무엇이든 저장가능한 마법의상자
	private Object obj;

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}
}