package com.saha.faizhesaplama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		BasitFaiz basitfaiz = new BasitFaiz();

		System.out.println("Faiz Prorami");
		System.out.println(" ");

		System.out.println("1. Günlük Faiz");
		System.out.println("2. Aylik Faiz");
		System.out.println("3. Yillik Faiz");

		try {
			System.out.println("Faiz türünü seciniz:");
			int faizTuru = scn.nextInt();
			if (faizTuru == 1) {
				System.out.println("Anapara miktarini giriniz:");
				basitfaiz.setAnaPara(scn.nextInt());

				System.out.println("Faiz süresini giriniz:");
				basitfaiz.setBirimSure(scn.nextInt());

				basitfaiz.gunlukFaizHesabi(basitfaiz);
				basitfaiz.gunlukToplamParaHesabi(basitfaiz);

				System.out.println(basitfaiz.toString());

			} else if (faizTuru == 2) {
				System.out.println("Anapara miktarini giriniz:");
				basitfaiz.setAnaPara(scn.nextInt());

				System.out.println("Faiz süresini giriniz:");
				basitfaiz.setBirimSure(scn.nextInt());

				basitfaiz.aylikFaizHesabi(basitfaiz);
				basitfaiz.aylikToplamParaHesabi(basitfaiz);

				System.out.println(basitfaiz.toString());

			} else if (faizTuru == 3) {
				System.out.println("Anapara miktarini giriniz:");
				basitfaiz.setAnaPara(scn.nextInt());

				System.out.println("Faiz süresini giriniz:");
				basitfaiz.setBirimSure(scn.nextInt());

				basitfaiz.yillikFaizHesabi(basitfaiz);
				basitfaiz.yillikToplamParaHesabi(basitfaiz);

				System.out.println(basitfaiz.toString());
			} else {
				System.err.println("Dogru faiz türünü seciniz.");
			}

		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException - String bir ifade girmeyiniz.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
