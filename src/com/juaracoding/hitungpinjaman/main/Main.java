package com.juaracoding.hitungpinjaman.main;

import java.lang.Math;
import java.util.Scanner;

public class Main {
	
	 static Scanner scan = new Scanner(System.in);
	
	 public static void main(String[] args) {
		
		//input tanggal
		System.out.println("Masukan tanggal = ");
		int tanggal = scan.nextInt();
		System.out.println("Masukan bulan = ");
		int bulan = scan.nextInt();
		System.out.println("Masukan tahun = ");
		int tahun = scan.nextInt();
		
		//input data
		
		
		System.out.println("Masukan jumlah pinjaman = ");
		long platfon = scan.nextLong();
		System.out.println("Masukan jumlah bunga = ");
		float bunga = scan.nextFloat();
		System.out.println("Masukan lama pinjaman = ");
		int lama = scan.nextInt();
		
		//perhitungan
		/*
			float totalAngsuran = (float) (bunga*platfon*(Math.pow(((1+bunga)),lama))/(Math.pow(((1+bunga)),lama)-1));
			float angsuranBunga = bunga/360*30*sisaPinjaman;
			float angsuranPokok = totalAngsuran - angsuranBunga;
			float sisaPinjaman = platfon - angsuranPokok;
		*/
		
		for(int angsuranKe = 1 ;angsuranKe <= lama ; angsuranKe++) {
			
			float v = (1 + (bunga / 12));
	        float t = (-(lama / 12) * 12);
	        float totalAngsuran = (float) ((platfon * (bunga / 12)) / (1 - Math.pow(v, t)));
	        float angsuranBunga =bunga/100*lama*totalAngsuran;
	        float angsuranPokok = totalAngsuran - angsuranBunga;
			float sisaPinjaman = (platfon - angsuranPokok);
	        
		//menampilkan data
		System.out.println("=========================");
		System.out.println("Tanggal = " + tanggal + "-" + bulan + "-" + tahun);
		System.out.println("Jumlah pinjaman = "+ platfon);
		System.out.println("Jumlah bunga = "+ bunga);
		System.out.println("Jumlah lama = "+ lama);
		System.out.println("=========================");
		System.out.println("Angsuran ke = " + angsuranKe);
		System.out.println("Total angsuran = " + totalAngsuran);
		System.out.println("Total angsuran bunga = " + angsuranBunga);
		System.out.println("Total angsuran pokok = " + angsuranPokok);
		System.out.println("Total sisa pinjaman =" + sisaPinjaman);
		System.out.println("=========================");
		System.out.println("");
		
		//ganti bulan
		bulan++;
		if (bulan > 12) {
			bulan = 1;
			tahun++;
		}
		}
		
	 }
}
