package Bai_Thuc_Hanh_1;

import java.util.*;

public class b19 {
	public static void main(String[] srgn) {
		Scanner sc = new Scanner(System.in);
		System.out.println("In n so Fibonaci dau tien!!");
		System.out.print("Nhap so: ");
		int n=sc.nextInt();
		long[] f= new long[n];
		f[0]=f[1]=1;
		System.out.print( f[0] +" " + f[1]);
		
		for(int i=2; i<n;i++) {
			f[i]=f[i-1]+f[i-2];
			System.out.print(" " + f[i]);
		}
		sc.close();
		
	}
}
