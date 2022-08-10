package Bai1;
import java.util.Scanner;
public class QuanLy {
	private String maQL;
	private String hoTen;
	public static Scanner sc=new Scanner(System.in);
	public String getMaQL() {
		return maQL;
	}
	public void setMaQL(String maQL) {
		this.maQL = maQL;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void input() {
		System.out.println("Nhap ma quan ly:");
		maQL=sc.nextLine();
		System.out.println("Nhap ho ten:");
		hoTen=sc.nextLine();
	}
	public void output() {
		System.out.printf("%-15s%-15s ",maQL,hoTen);
	}
}

