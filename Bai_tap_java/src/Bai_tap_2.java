import java.util.ArrayList;
import java.util.Scanner;

public class Bai_tap_2 {
	public String tenSv;
	public double diemSv;

	public void nhap(String ten, double diem) {
		this.tenSv = ten;
		this.diemSv = diem;
	}

	public double getdiem(Bai_tap_2 x) {
		return this.diemSv;
	}
	
	public String getTenSv() {
		return tenSv;
	}

	public void setTenSv(String tenSv) {
		this.tenSv = tenSv;
	}

	@Override
	public String toString() {
		return "Bai_tap_2 : tenSv=" + tenSv + ", diemSv=" + diemSv;
	}

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);

		ArrayList<Bai_tap_2> SvFBU = new ArrayList<Bai_tap_2>();
		for (int i = 0; i < 5; i++) {
			String ten = cs.nextLine();
			double diem = Double.parseDouble(cs.nextLine());
			Bai_tap_2 Svtam = new Bai_tap_2();
			Svtam.nhap(ten, diem);
			SvFBU.add(Svtam);
		}
		for (Bai_tap_2 bai_tap_2 : SvFBU) {
			System.out.println(bai_tap_2);
		}
		double khoangd = cs.nextDouble();
		double khoangk = Double.parseDouble(cs.nextLine());
		for (Bai_tap_2 bai_tap_2 : SvFBU) {
			if (bai_tap_2.getdiem(bai_tap_2) >= khoangd && bai_tap_2.getdiem(bai_tap_2) <= khoangk) {
				System.out.println(bai_tap_2);
			}
		}
		String timHoten = cs.nextLine();
		for (Bai_tap_2 bai_tap_2 : SvFBU) {
			if(bai_tap_2.getTenSv().equals(timHoten)) {
				System.out.println(bai_tap_2);
			}
            
		}
		System.out.println(timHoten.getBytes());

	}
}
