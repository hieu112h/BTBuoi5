package Bai1;
import java.util.Scanner;
public class PhongMay {
	private String maPhong;
	private String tenPhong;
	private int dienTich;
	private QuanLy x=new QuanLy();
	private May y=new May();
	public static Scanner sc=new Scanner(System.in);
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(int dienTich) {
		this.dienTich = dienTich;
	}
	public void input() {
		System.out.println("Nhap ma phong:");
		maPhong=sc.nextLine();
		System.out.println("Nhap ten phong:");
		tenPhong=sc.nextLine();
		System.out.println("Nhap dien tich:");
		dienTich=sc.nextInt();
		sc.nextLine();
		x.input();
		y.input();
	}
	public void output() {
		System.out.printf("%-15s%-15s%-15d",maPhong,tenPhong,dienTich);
		x.output();
		y.output();
	}
	public static void main(String[] args) {
		PhongMay PM1=new PhongMay();
		PM1.input();
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s \n","Ma Phong","Ten Phong","Dien Tich","Ma Quan Ly","Ho Ten","Ma May","Kieu May","Tinh Trang");
		PM1.output();
	}
}
