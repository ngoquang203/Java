
public class Bai_tap_1 {
	private String tenSp;
	private double donGia;
	private int giamGia;

	public void nhap(String ten, double gia, int giamGia) {
		this.tenSp = ten;
		this.donGia = gia;
		this.giamGia = giamGia;
	}

	public void nhap(String ten, double gia) {
		this.tenSp = ten;
		this.donGia = gia;
		this.giamGia = 0;
	}
    
	
	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}

	public double getThuenhapkhau() {
		return this.donGia * 0.1;
	}

	public void xuat() {
		System.out.println("Ten : " + this.tenSp);
		System.out.println("Don gia : " + this.donGia + " vnd");
		System.out.println("Giam gia : " + this.giamGia + "%");
		System.out.println("Thue nhap khau : " + getThuenhapkhau() + " vnd");
	}

	public static void main(String[] args) {
		Bai_tap_1 a = new Bai_tap_1();
		a.nhap("banh bao", 100, 20);
		a.xuat();
		System.out.println("-------------------------");
		Bai_tap_1 b = new Bai_tap_1();
		b.nhap("banh gio", 120);
		b.xuat();
	}
}
