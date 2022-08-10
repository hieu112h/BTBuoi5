package Bai1;
import java.util.Scanner;
public class May {
	private String maMay;
	private String kieuMay;
	private String tinhTrang;
	public static Scanner sc=new Scanner(System.in);
	public String getMaMay() {
		return maMay;
	}
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}
	public String getKieuMay() {
		return kieuMay;
	}
	public void setKieuMay(String kieuMay) {
		this.kieuMay = kieuMay;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public void input() {
		System.out.println("Nhap ma may:");
		maMay=sc.nextLine();
		System.out.println("Nhap kieu may:");
		kieuMay=sc.nextLine();
		System.out.println("Nhap tinh trang:");
		tinhTrang=sc.nextLine();
	}
	public void output() {
		System.out.printf("%-15s%-15s%-15s",maMay,kieuMay,tinhTrang);
	}
}
