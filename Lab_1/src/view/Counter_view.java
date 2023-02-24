package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.controller_listener;
import model.Counter_model;

public class Counter_view extends JFrame{
	
	private Counter_model counter_model;
	private JLabel j_label;
	public Counter_view() {
		this.counter_model = new Counter_model();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("UP or DOWN");
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new controller_listener(this);
		
		JButton j_up = new JButton("UP");
		j_up.addActionListener(ac);
		
		JButton j_down = new JButton("DOWN");
		j_down.addActionListener(ac);
		
		j_label = new JLabel(this.counter_model.getVale_model()+"",JLabel.CENTER);
		
		JPanel j_panell = new JPanel();
		j_panell.setLayout(new BorderLayout());
		j_panell.add(j_up,BorderLayout.WEST);
		j_panell.add(j_label,BorderLayout.CENTER);
		j_panell.add(j_down,BorderLayout.EAST);
		
	    this.add(j_panell,BorderLayout.CENTER);
		
	}
	public void increment() {
		this.counter_model.increment();
		this.j_label.setText(this.counter_model.getVale_model()+"");
	}
	public void decrement() {
		this.counter_model.decrement();
		this.j_label.setText(this.counter_model.getVale_model()+"");
	}

}
