package DAO;

import java.sql.Date;

import javax.xml.crypto.Data;

public class SinhVien {
	private String MaSV;
	private String HoTenSV;
	private String NgaySinh;
	private String GioiTinh;
	private String DiaChi;
	private String SDT;
	private String MaLop;
	
	public SinhVien() {
		
	}
	
	public String getMaLop() {
		return MaLop;
	}

	public void setMaLop(String maLop) {
		MaLop = maLop;
	}

	

	public SinhVien(String MaSV, String HoTenSV, String NgaySinh, String GioiTinh, String DiaChi, String SDT,
			String MaLop) {
		this.MaSV = MaSV;
		this.HoTenSV = HoTenSV;
		this.NgaySinh = NgaySinh;
		this.GioiTinh = GioiTinh;
		this.DiaChi = DiaChi;
		this.SDT = SDT;
		this.MaLop = MaLop;

	}

	public String getMaSV() {
		return MaSV;
	}
	public void setMaSV(String MaSV) {
		this.MaSV = MaSV;
	}
	public String getHoTen() {
		return HoTenSV;
	}
	public void setHoTen(String HoTenSV) {
		this.HoTenSV = HoTenSV;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String NgaySinh) {
		this.NgaySinh = NgaySinh;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String GioiTinh) {
		this.GioiTinh = GioiTinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String DiaChi) {
		this.DiaChi = DiaChi;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String SDT) {
		this.SDT = SDT;
	};
	
}
