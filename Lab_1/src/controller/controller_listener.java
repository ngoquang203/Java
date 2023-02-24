package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Counter_view;

public class controller_listener implements ActionListener{
	private Counter_view ctv;
    
	public controller_listener(Counter_view ctv) {
		this.ctv = ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("UP")) {
			this.ctv.increment();
		}
		else if(src.equals("DOWN")) {
			this.ctv.decrement();
		}
		
	}
	

}
