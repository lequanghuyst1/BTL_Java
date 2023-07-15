package DAO;

public class Diem {
	private String MaSv;
	private	String HotenSV;
	/**
	 * @param maSv
	 * @param hotenSV
	 * @param maLopHoc
	 * @param diemTX1
	 * @param diemTX2
	 * @param diemHocKy
	 */
	private String MaLopHoc;
	private float DiemTX1;
	private float DiemTX2;
	private float DiemHocKy;
	
	public Diem(String maSv, String hotenSV, float diemTX1, float diemTX2, float diemHocKy) {
		MaSv = maSv;
		HotenSV = hotenSV;
		DiemTX1 = diemTX1;
		DiemTX2 = diemTX2;
		DiemHocKy = diemHocKy;
	}

	public String getMaSv() {
		return MaSv;
	}

	public void setMaSv(String maSv) {
		MaSv = maSv;
	}

	public String getHotenSV() {
		return HotenSV;
	}

	public void setHotenSV(String hotenSV) {
		HotenSV = hotenSV;
	}

	public String getMaLopHoc() {
		return MaLopHoc;
	}

	public void setMaLopHoc(String maLopHoc) {
		MaLopHoc = maLopHoc;
	}

	public float getDiemTX1() {
		return DiemTX1;
	}

	public void setDiemTX1(float diemTX1) {
		DiemTX1 = diemTX1;
	}

	public float getDiemTX2() {
		return DiemTX2;
	}

	public void setDiemTX2(float diemTX2) {
		DiemTX2 = diemTX2;
	}

	public float getDiemHocKy() {
		return DiemHocKy;
	}

	public void setDiemHocKy(float diemHocKy) {
		DiemHocKy = diemHocKy;
	}
	public float DiemTK() {
		return (float) ((this.DiemTX1+this.DiemTX2)*0.3/2+this.DiemHocKy*0.7);
	}
}
