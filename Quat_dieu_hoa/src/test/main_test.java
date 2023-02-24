package test;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import view.counter_view;

public class main_test {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
        System.out.println("Nhap mssv: ");
        int mssv= sc.nextInt();
        System.out.println("Nhap diem trung binh: ");
        double dtb= sc.nextDouble();
        System.out.println("Nhap ho va ten: ");
        
        String hoVaTen = sc.nextLine();
        hoVaTen= sc.nextLine();
        System.out.println("------------");
        System.out.println("MSSV: "+mssv);
        System.out.println("Diem trung binh: "+ dtb);
        System.out.println("Ho va ten: "+hoVaTen);

	}

}
