package com.saha.faizhesaplama;

public class BasitFaiz {

	private double faizTutari = 0;
	private int birimSure;
	private double sonPara;
	private double anaPara;
	private int faizTuru;
	private final double gunlukFaizOrani = 0.10;
	private final double aylikFaizOrani = 0.12;
	private final double yillikFaizOrani = 0.15;

	public double getFaizTutari() {
		return faizTutari;
	}

	public void setFaizTutari(double faizTutari) {
		this.faizTutari = faizTutari;
	}

	public int getBirimSure() {
		return birimSure;
	}

	public void setBirimSure(int birimSure) {
		this.birimSure = birimSure;
	}

	public double getSonPara() {
		return sonPara;
	}

	public void setSonPara(double sonPara) {
		this.sonPara = sonPara;
	}

	public double getAnaPara() {
		return anaPara;
	}

	public void setAnaPara(double anaPara) {
		this.anaPara = anaPara;
	}

	public int getFaizTuru() {
		return faizTuru;
	}

	public void setFaizTuru(int faizTuru) {
		this.faizTuru = faizTuru;
	}

	public double getGunlukFaizOrani() {
		return gunlukFaizOrani;
	}

	public double getAylikFaizOrani() {
		return aylikFaizOrani;
	}

	public double getYillikFaizOrani() {
		return yillikFaizOrani;
	}

	public double gunlukFaizHesabi(BasitFaiz basitfaiz) {
		basitfaiz.setFaizTutari(
				basitfaiz.getAnaPara() * basitfaiz.getBirimSure() / 365 * basitfaiz.getGunlukFaizOrani());
		return basitfaiz.getFaizTutari();
	}

	public double aylikFaizHesabi(BasitFaiz basitfaiz) {
		basitfaiz.setFaizTutari(basitfaiz.getAnaPara() * basitfaiz.getBirimSure() / 12 * basitfaiz.getAylikFaizOrani());
		return basitfaiz.getFaizTutari();
	}

	public double yillikFaizHesabi(BasitFaiz basitfaiz) {
		basitfaiz.setFaizTutari(basitfaiz.getAnaPara() * basitfaiz.getBirimSure() * basitfaiz.getYillikFaizOrani());
		return basitfaiz.getFaizTutari();
	}

	public double gunlukToplamParaHesabi(BasitFaiz basitfaiz) {
		basitfaiz.setSonPara(basitfaiz.getAnaPara() + basitfaiz.gunlukFaizHesabi(basitfaiz));
		return basitfaiz.getSonPara();
	}

	public double aylikToplamParaHesabi(BasitFaiz basitfaiz) {
		basitfaiz.setSonPara(basitfaiz.getAnaPara() + basitfaiz.aylikFaizHesabi(basitfaiz));
		return basitfaiz.getSonPara();
	}

	public double yillikToplamParaHesabi(BasitFaiz basitfaiz) {
		basitfaiz.setSonPara(basitfaiz.getAnaPara() + basitfaiz.yillikFaizHesabi(basitfaiz));
		return basitfaiz.getSonPara();
	}

	@Override
	public String toString() {
		return "FaizTutari= " + faizTutari + "\t" + "BirimSüre=" + birimSure + "\t" + "Anapara=" + anaPara + "\t"
				+ "SonPara=" + sonPara;
	}

}
