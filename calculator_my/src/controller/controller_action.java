package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.counter_view;

public class controller_action implements ActionListener{
	private counter_view ctv;
    private String src;
    private int tam;
    private int tam1;
	public controller_action(counter_view ctv) {
		this.tam = 0;
		this.tam1= 0;
		this.ctv = ctv;
	}
	public String text_action() {
		return this.src;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.src = e.getActionCommand();
		if(src.equals("AC")) {
			this.tam1 = 0;
			this.ctv.clear_calculator();
		}
		else if(src.equals("1")||src.equals("0")||src.equals("2")||src.equals("3")||src.equals("4")||
				src.equals("5")||src.equals("6")||src.equals("7")||src.equals("8")||src.equals("9")) {
			this.ctv.screen_calculator();
		}
		else if(src.equals("+")&&this.tam1==0) {
			this.ctv.set_value1();
			this.ctv.clear_calculator();
			this.tam = 1;
			this.tam1 = 1;
		}
		else if(src.equals("-")&&this.tam1==0) {
			this.ctv.set_value1();
			this.ctv.clear_calculator();	
			this.tam = 2;
			this.tam1 = 1;
		}
		else if(src.equals("*")&&this.tam1==0) {	
			this.ctv.set_value1();
			this.ctv.clear_calculator();	
			this.tam = 3;
			this.tam1 = 1;
		}
		else if(src.equals("/")&&this.tam1==0) {
			this.ctv.set_value1();
			this.ctv.clear_calculator();
			this.tam = 4;
			this.tam1 = 1;
		}
		
		else if(src.equals("=") && this.tam == 1) {
			this.ctv.set_value2();
			this.ctv.clear_calculator();
			this.ctv.cong();
		}
		else if(src.equals("=") && this.tam == 2) {
			this.ctv.set_value2();
			this.ctv.clear_calculator();
			this.ctv.tru();
		}
		else if(src.equals("=") && this.tam == 3) {
			this.ctv.set_value2();
			this.ctv.clear_calculator();
			this.ctv.nhan();
		}
		else if(src.equals("=") && this.tam == 4) {
			this.ctv.set_value2();
			this.ctv.clear_calculator();
			this.ctv.chia();
		}
		
		else if(src.equals("+") && this.tam1 == 1) {
			this.ctv.set_value();
			this.ctv.clear_calculator();
			this.tam = 1;
		}
		else if(src.equals("-") && this.tam1 == 1) {
			this.ctv.set_value();
			this.ctv.clear_calculator();
			this.tam = 2;
		}
		else if(src.equals("*") && this.tam1 == 1) {
			this.ctv.set_value();
			this.ctv.clear_calculator();
			this.tam = 3;
		}
		else if(src.equals("/") && this.tam1 == 1) {
			this.ctv.set_value();
			this.ctv.clear_calculator();
			this.tam = 4;
		}
	}
	
	

}
