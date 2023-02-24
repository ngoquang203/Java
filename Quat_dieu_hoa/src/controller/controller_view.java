package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.counter_view;

public class controller_view implements ActionListener{
	private counter_view ctv;
	public controller_view(counter_view ctv) {
		this.ctv = ctv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("ON")) {
			this.ctv.off_button();
			this.ctv.screen_on();
		}
		else if(src.equals("OFF")) {
			this.ctv.on_button();
			this.ctv.screen_off();
		}
		else if(src.equals("+")) {
			this.ctv.increment();
		}
		else if(src.equals("-")) {
			this.ctv.decrement();
		}
		
		
	}

}
