package model;

public class counter_model {
	private int value;
	public counter_model() {
		this.value = 26;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void increment() {
		this.value++;
	}
	public void decrement() {
		this.value--;
	}

}
