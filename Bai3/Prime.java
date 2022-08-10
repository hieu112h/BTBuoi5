package Bai3;
import java.util.Scanner;
public class Prime {
	public static boolean isPrime(int n) {
		if(n<2) return false;
		else if(n==2||n==3) return true;
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) return false;
			}
			return true;
		}
	}
	public static boolean isPrime(long n) {
		if(n<2) return false;
		else if(n==2||n==3) return true;
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) return false;
			}
			return true;
		}
	}
	public static boolean isPrime(float n) {
		if((int)n!=n) return false;
		else {
			if(n<2) return false;
			else if(n==2||n==3) return true;
			else {
				for(int i=2;i<n;i++) {
					if(n%i==0) return false;
				}
				return true;
			}
		}
	}
	public static boolean isPrime(double n) {
		if((int)n!=n) return false;
		else {
			if(n<2) return false;
			else if(n==2||n==3) return true;
			else {
				for(int i=2;i<n;i++) {
					if(n%i==0) return false;
				}
				return true;
			}
		}
	}
	public static void main(String[] args) {
		Prime kt=new Prime();
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Nhap a:");
		a=sc.nextInt();
		System.out.println(kt.isPrime(a));
		long b;
		System.out.println("Nhap b:");
		b=sc.nextLong();
		System.out.println(kt.isPrime(b));
		float c;
		System.out.println("Nhap c:");
		c=sc.nextFloat();
		System.out.println(kt.isPrime(c));
		double d;
		System.out.println("Nhap d:");
		d=sc.nextDouble();
		System.out.println(kt.isPrime(d));
	}
	
}
