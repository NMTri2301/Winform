package NguyenMinhHung_2180608688;

import java.util.Scanner;

public abstract class NHANVIEN {
	protected String maNV, tenNV, trinhDo;
	protected double luongCB;
	abstract double TinhLuong();
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	public double getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}
	public NHANVIEN(String maNV, String tenNV, String trinhDo, double luongCB) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.trinhDo = trinhDo;
		this.luongCB = luongCB;
	}
	public NHANVIEN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma nhan vien: ");
		maNV = sc.nextLine();
		System.out.print("Nhap ten nhan vien: ");
		tenNV = sc.nextLine();
		System.out.print("Nhap trinh do: ");
		trinhDo = sc.nextLine();
		System.out.print("Nhap luong co ban: ");
		luongCB = sc.nextDouble();
	}
	public void output() {
		System.out.println("NHANVIEN [maNV=" + maNV + ", tenNV=" + tenNV + ", trinhDo=" + trinhDo + ", luongCB=" + luongCB + "]");
	}
	
	
}
