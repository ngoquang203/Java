package model;

public class main_model {
	private double main_value;
	private double value_1;
	private double value_2;
	
	public main_model() {
		this.main_value = 0;
	}
	



	public double getMain_value() {
		return main_value;
	}


	public void setMain_value(double main_value) {
		this.main_value = main_value;
	}



	public double getValue_1() {
		return value_1;
	}



	public void setValue_1(double value_1) {
		this.value_1 = value_1;
	}



	public double getValue_2() {
		return value_2;
	}


	public void setValue_2(double value_2) {
		this.value_2 = value_2;
	}




	public double cong() {
		this.main_value = this.value_1 + this.value_2;
		return this.main_value;
		
	}
	public double tru() {
		this.main_value = this.value_1 - this.value_2;
		return this.main_value;
		
	}
	public double nhan() {
		this.main_value = this.value_1 * this.value_2;
		return this.main_value;
		
	}
	public double chia() {
		this.main_value = this.value_1/this.value_2;
		return this.main_value;
	}

}
