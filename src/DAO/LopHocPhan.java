package DAO;

public class LopHocPhan {
	public String getTenMonHoc() {
		return TenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		TenMonHoc = tenMonHoc;
	}

	/**
	 * @param maLopHp
	 * @param tenMonHoc
	 * @param khoa
	 * @param siSo
	 */
	public LopHocPhan(String maLopHp, String tenMonHoc, String khoa, int siSo) {
		super();
		MaLopHp = maLopHp;
		TenMonHoc = tenMonHoc;
		Khoa = khoa;
		SiSo = siSo;
	}
	private String MaLopHp;
	private String TenMonHoc;
	private String Khoa;
	private int SiSo;
	/**
	 * @param maLopHp
	 * @param khoa
	 * @param siSo
	 */
	public LopHocPhan() {
		
	}
	
	public String getMaLopHp() {
		return MaLopHp;
	}
	public void setMaLopHp(String maLopHp) {
		MaLopHp = maLopHp;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public int getSiSo() {
		return SiSo;
	}
	public void setSiSo(int siSo) {
		SiSo = siSo;
	}
	
}
