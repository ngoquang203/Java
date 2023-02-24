package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.controller_action;
import model.counter_model_2;
import model.main_model;

public class counter_view extends JFrame{
	
	private main_model m_model;
	private JTextField j_text;
	private controller_action ac;
	private double value;
	public counter_view() {
		this.value = 0;
		
		this.ac = new controller_action(this);
		this.m_model = new main_model();
		init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("MY_CALCULATOR");
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		Font font = new Font("Arial", Font.PLAIN, 20);
		Font font_text = new Font("Arial", Font.PLAIN, 26);
		j_text = new JTextField("");
		j_text.setHorizontalAlignment(JTextField.RIGHT);
		j_text.setFont(font_text);
		j_text.setBackground(Color.GRAY);
		j_text.setForeground(Color.WHITE);
		j_text.setOpaque(true);
		JPanel j_panel_1 = new JPanel();
		j_panel_1.setLayout(new BorderLayout());
		j_panel_1.add(j_text,BorderLayout.CENTER);
		
		JButton j_but1 = new JButton("1");
		j_but1.addActionListener(ac);
		j_but1.setBackground(Color.WHITE);
		j_but1.setFont(font);
		
		JButton j_but2 = new JButton("2");
		j_but2.addActionListener(ac);
		j_but2.setBackground(Color.WHITE);
		j_but2.setFont(font);
		
		JButton j_but3 = new JButton("3");
		j_but3.addActionListener(ac);
		j_but3.setBackground(Color.WHITE);
		j_but3.setFont(font);
		
		JButton j_but4 = new JButton("AC");
		j_but4.addActionListener(ac);
		j_but4.setBackground(Color.WHITE);
		j_but4.setFont(font);
		
		JButton j_but5 = new JButton("4");
		j_but5.addActionListener(ac);
		j_but5.setBackground(Color.WHITE);
		j_but5.setFont(font);
		
		JButton j_but6 = new JButton("5");
		j_but6.addActionListener(ac);
		j_but6.setBackground(Color.WHITE);
		j_but6.setFont(font);
		
		JButton j_but7 = new JButton("6");
		j_but7.addActionListener(ac);
		j_but7.setBackground(Color.WHITE);
		j_but7.setFont(font);
		
		JButton j_but8 = new JButton("+");
		j_but8.addActionListener(ac);
		j_but8.setBackground(Color.WHITE);
		j_but8.setFont(font);
		
		JButton j_but9 = new JButton("7");
		j_but9.addActionListener(ac);
		j_but9.setBackground(Color.WHITE);
		j_but9.setFont(font);
		
		JButton j_but10 = new JButton("8");
		j_but10.addActionListener(ac);
		j_but10.setBackground(Color.WHITE);
		j_but10.setFont(font);
		
		JButton j_but11 = new JButton("9");
		j_but11.addActionListener(ac);
		j_but11.setBackground(Color.WHITE);
		j_but11.setFont(font);
		
		JButton j_but12 = new JButton("-");
		j_but12.addActionListener(ac);
		j_but12.setBackground(Color.WHITE);
		j_but12.setFont(font);
		
		JButton j_but13 = new JButton("0");
		j_but13.addActionListener(ac);
		j_but13.setBackground(Color.WHITE);
		j_but13.setFont(font);
		
		JButton j_but14 = new JButton("*");
		j_but14.addActionListener(ac);
		j_but14.setBackground(Color.WHITE);
		j_but14.setFont(font);
		
		JButton j_but15 = new JButton("/");
		j_but15.addActionListener(ac);
		j_but15.setBackground(Color.WHITE);
		j_but15.setFont(font);
		
		JButton j_but16 = new JButton("=");
		j_but16.addActionListener(ac);
		j_but16.setBackground(Color.WHITE);
		j_but16.setFont(font);
		
		JPanel j_panel_2 = new JPanel();
		j_panel_2.setLayout(new GridLayout(4,4,2,2));
		j_panel_2.add(j_but1);
		j_panel_2.add(j_but2);
		j_panel_2.add(j_but3);
		j_panel_2.add(j_but4);
		j_panel_2.add(j_but5);
		j_panel_2.add(j_but6);
		j_panel_2.add(j_but7);
		j_panel_2.add(j_but8);
		j_panel_2.add(j_but9);
		j_panel_2.add(j_but10);
		j_panel_2.add(j_but11);
		j_panel_2.add(j_but12);
		j_panel_2.add(j_but13);
		j_panel_2.add(j_but14);
		j_panel_2.add(j_but15);
		j_panel_2.add(j_but16);
		
		this.setLayout(new BorderLayout());
		this.add(j_panel_1,BorderLayout.NORTH);
		this.add(j_panel_2,BorderLayout.CENTER);
		
		
		
	}
	public void clear_calculator() {
		this.value = 0;
		this.j_text.setText("");
	}
	public void screen_calculator() {
		String s = ac.text_action();
		int temp = Integer.parseInt(s);
        this.value = (this.value * 10) + temp;
        temp = 0;  
        String t = String.valueOf(this.value);
		j_text.setText(t);
		
	}
	
	public void set_value1() {
		this.m_model.setValue_1(value);
	}
	public void set_value2() {
		this.m_model.setValue_2(value);
	}
	public void set_value() {
		this.m_model.setValue_1(this.m_model.getMain_value());
	}
	public void cong() {
		String s = String.valueOf(this.m_model.cong());
		j_text.setText(s);
	}
	public void tru() {
		String s = String.valueOf(this.m_model.tru());
		j_text.setText(s);
	}
	public void nhan() {
		String s = String.valueOf(this.m_model.nhan());
		j_text.setText(s);
	}
	public void chia() {
		String s = String.valueOf(this.m_model.chia());
		j_text.setText(s);
	}
	
	
	
	

}
