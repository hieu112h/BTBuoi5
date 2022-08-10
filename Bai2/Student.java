package Bai2;
import java.util.Scanner;
public class Student {
	private String idS;
	private String name;
	private int age;
	public static Scanner sc=new Scanner(System.in);
	private Address add=new Address();
	public String getIdS() {
		return idS;
	}
	public void setIdS(String idS) {
		this.idS = idS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public void input() {
		System.out.println("Nhap idS:");
		idS=sc.nextLine();
		System.out.println("Nhap name:");
		name=sc.nextLine();
		System.out.println("Nhap age:");
		age=sc.nextInt();
		sc.nextLine();
		add.intput();
	}
	public void output() {
		System.out.printf("%-10s%-10s%-10d",idS,name,age);
		add.output();
	}
	public static void main(String[] args) {
		Student[] s1=new Student[100];
		int n,temp;
		System.out.println("Nhap so sinh vien:");
		n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap sinh vien thu: "+(i+1));
			s1[i]=new Student();
			s1[i].input();
		}
		do {
			System.out.println("Nhap lua chon cua ban ");
			temp=sc.nextInt();
		}while(temp<0||temp>5);
		sc.nextLine();
		switch(temp) {
		case 1:
			System.out.printf("%-10s%-10s%-10s%-15s%-15s%s \n","idS","Name","Age","id","District","Province");
			for(int i=0;i<n;i++) {
				s1[i].output();
				System.out.println();
			}
			break;
		case 2:
			String kt;
			System.out.println("Nhap id sinh vien can tim kiem:");
			kt=sc.nextLine();
			System.out.printf("%-10s%-10s%-10s%-15s%-15s%s \n","idS","Name","Age","id","District","Province");
			for(int i=0;i<n;i++) {
				if(s1[i].idS.equals(kt)) s1[i].output();
			}
			break;
		case 3:
			System.out.println("Danh sach sinh vien sau khi sua:");
			System.out.printf("%-10s%-10s%-10s%-15s%-15s%s \n","idS","Name","Age","id","District","Province");
			for(int i=0;i<n;i++) {
				if(s1[i].add.getProvince().equals("thanh hoa")) {
					s1[i].add.setProvince("hai phong");
				}
			}
			for(int i=0;i<n;i++) {
				s1[i].output();
				System.out.println();
			}
			break;
		case 4:
			String temp2;
			System.out.println("Nhap id sinh vien muon xoa:");
			temp2=sc.nextLine();
			System.out.printf("%-10s%-10s%-10s%-15s%-15s%s \n","idS","Name","Age","id","District","Province");
			for(int i=0;i<n;i++) {
				if(s1[i].idS.equals(temp2)) {
					for(int j=i;j<n;j++) {
						s1[j]=s1[j+1];
					}
				n--;
				}
			}
			for(int i=0;i<n;i++) {
				s1[i].output();
				System.out.println();
			}
			break;
				
		}

	}
}
