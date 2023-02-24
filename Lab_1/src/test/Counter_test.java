package test;

import model.Counter_model;
import view.Counter_view;

public class Counter_test {
	public static void main(String[] args) {
		Counter_model cm = new Counter_model();
		cm.increment();
		cm.increment();
		cm.increment();
		Counter_view cv = new Counter_view();

	}

}
