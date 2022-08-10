package Bai2;
import java.util.Scanner;
public class Address {
	private String id;
	private String district;
	private String province;
	public static Scanner sc=new Scanner(System.in);
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public void intput () {
		System.out.println("Nhap id:");
		id=sc.nextLine();
		System.out.println("Nhap district:");
		district=sc.nextLine();
		System.out.println("Nhap province:");
		province=sc.nextLine();
	}
	public void output() {
		System.out.printf("%-15s%-15s%s",id,district,province);
	}
}
