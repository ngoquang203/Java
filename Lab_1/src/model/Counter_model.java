package model;

public class Counter_model {
	private int vale_model;

	public Counter_model() {
		this.vale_model = 0;
	}

	public int getVale_model() {
		return vale_model;
	}

	public void setVale_model(int vale_model) {
		this.vale_model = vale_model;
	}
	
	public void increment() {
		this.vale_model++;
	}
	public void decrement() {
		this.vale_model--;
	}
	

}
