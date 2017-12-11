package com.saha.faizhesaplama;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMethods {
	BasitFaiz basitfaiz = new BasitFaiz();

	@Test
	public void gunlukFaizHesabiTesti() {
		basitfaiz.setAnaPara(1000);
		basitfaiz.setBirimSure(730);
		double sonuc = basitfaiz.gunlukFaizHesabi(basitfaiz);
		assertEquals(200.0, sonuc, 0.0);
	}

	@Test
	public void aylikFaizHesabiTesti() {
		basitfaiz.setAnaPara(1000);
		basitfaiz.setBirimSure(6);
		double sonuc = basitfaiz.aylikFaizHesabi(basitfaiz);
		assertEquals(60.0, sonuc, 0.0);
	}

	@Test
	public void yillikFaizHesabiTesti() {
		basitfaiz.setAnaPara(1000);
		basitfaiz.setBirimSure(2);
		double sonuc = basitfaiz.yillikFaizHesabi(basitfaiz);
		assertEquals(300.0, sonuc, 0.0);
	}

	@Test
	public void gunlukfaizSonParaTesti() {
		basitfaiz.setAnaPara(1000);
		basitfaiz.setBirimSure(1095);
		double sonuc = basitfaiz.gunlukToplamParaHesabi(basitfaiz);
		assertEquals(1300.0, sonuc, 0.0);
	}

	@Test
	public void aylikfaizSonParaTesti() {
		basitfaiz.setAnaPara(1000);
		basitfaiz.setBirimSure(6);
		double sonuc = basitfaiz.aylikToplamParaHesabi(basitfaiz);
		assertEquals(1060.0, sonuc, 0.0);
	}

	@Test
	public void yillikfaizSonParaTesti() {
		basitfaiz.setAnaPara(1000);
		basitfaiz.setBirimSure(2);
		double sonuc = basitfaiz.yillikToplamParaHesabi(basitfaiz);
		assertEquals(1300.0, sonuc, 0.0);
	}
}
