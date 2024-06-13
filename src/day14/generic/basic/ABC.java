package day14.generic.basic;

public class ABC<T> { //제네릭 - interface/class <타입>

	private T t; //타입 미정, 생성할 때 지정

	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
}