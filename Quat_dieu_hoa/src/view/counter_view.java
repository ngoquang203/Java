package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.controller_view;
import model.counter_model;

public class counter_view extends JFrame{
	private counter_model cm;
	private JPanel jpanel;
	private JButton j_but1;
	private JLabel j_label5;
	public counter_view() {
		this.cm = new counter_model();
		init();
	}
	public void init() {
		this.setSize(768,473);
		this.setTitle("Quat_dieu_hoa");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.PLAIN, 20);
		Font font_text = new Font("Arial", Font.PLAIN, 26);
		
		ActionListener ac = new controller_view(this);
		
		java.net.URL img_url = counter_view.class.getResource("img_1.png");
		Image img_dieuhoa = Toolkit.getDefaultToolkit().createImage(img_url);
		ImageIcon imgicon_dieuhoa = new ImageIcon("C:\\Users\\thoonghy\\eclipse-workspace\\Quat_dieu_hoa\\src\\view\\img_1.png","Lock");
		
		JLabel jlabel = new JLabel("",imgicon_dieuhoa,JLabel.CENTER);
		
		JLabel j_label6 = new JLabel("",JLabel.CENTER);
		JLabel j_label4 = new JLabel("Nhiệt độ :",JLabel.CENTER);
		j_label4.setFont(font);
		String value = String.valueOf(this.cm.getValue());
		j_label5 = new JLabel(value,JLabel.CENTER);
		j_label5.setFont(font);
		
		jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
		jpanel.add(jlabel,BorderLayout.NORTH);
		jpanel.add(j_label6);
		JPanel jpanel_con = new JPanel();
		jpanel_con.setLayout(new FlowLayout());
		
		jpanel_con.add(j_label4);
		jpanel_con.add(j_label5);
		
		jpanel.add(jpanel_con);
		jpanel.setVisible(false);
		
		
		j_but1 = new JButton("ON");
		j_but1.addActionListener(ac);
		j_but1.setBackground(Color.WHITE);
		j_but1.setFont(font);
		
		JButton j_but2 = new JButton("+");
		j_but2.addActionListener(ac);
		j_but2.setBackground(Color.WHITE);
		j_but2.setFont(font);
		
		JButton j_but3 = new JButton("-");
		j_but3.addActionListener(ac);
		j_but3.setBackground(Color.WHITE);
		j_but3.setFont(font);
		
		
		
		
		JPanel jpanel_1 = new JPanel();
		jpanel_1.setLayout(new GridLayout(1,3,5,10));
		jpanel_1.add(j_but1);
		jpanel_1.add(j_but2);
		jpanel_1.add(j_but3);
		
		JLabel j_label1 = new JLabel("Điều hòa 2 chiều",JLabel.CENTER);
		j_label1.setFont(font);
		JLabel j_label2 = new JLabel("Cảm nhận cái lạnh giữa mùa hè",JLabel.CENTER);
		j_label2.setFont(font);
		JLabel j_label3 = new JLabel("",JLabel.CENTER);
		j_label3.setFont(font);
		JPanel jpanel2 = new JPanel();
		jpanel2.setLayout(new GridLayout(3,1,20,10));
		jpanel2.add(j_label1);
		jpanel2.add(j_label2);
		jpanel2.add(j_label3);
		
		
		
		
		
		this.setIconImage(img_dieuhoa);
		this.setLayout(new BorderLayout());
		this.add(jpanel,BorderLayout.CENTER);
		this.add(jpanel_1,BorderLayout.SOUTH);
		this.add(jpanel2,BorderLayout.NORTH);
		
		
		this.setVisible(true);
	}
	public void on_button() {
		this.j_but1.setText("ON");
	}
	public void off_button() {
		this.j_but1.setText("OFF");
	}
    public void screen_on() {
    	this.jpanel.setVisible(true);
    }
    public void screen_off() {
    	this.jpanel.setVisible(false);
    }
    public void increment() {
		this.cm.increment();
		this.j_label5.setText(String.valueOf(this.cm.getValue()));
	}
	public void decrement() {
		this.cm.decrement();
		this.j_label5.setText(String.valueOf(this.cm.getValue()));
	}
}
