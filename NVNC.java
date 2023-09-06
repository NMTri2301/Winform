package NguyenMinhHung_2180608688;

import java.util.Scanner;

public class NVNC extends NHANVIEN{
	private String chuyenMon;
	private double phuCapDH;
	@Override
	double TinhLuong() {
		// TODO Auto-generated method stub
		return luongCB + phuCapDH;
	}
	public String getChuyenMon() {
		return chuyenMon;
	}
	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	public double getPhuCapDH() {
		return phuCapDH;
	}
	public void setPhuCapDH(double phuCapDH) {
		this.phuCapDH = phuCapDH;
	}
	public NVNC(String maNV, String tenNV, String trinhDo, double luongCB, String chuyenMon, double phuCapDH) {
		super(maNV, tenNV, trinhDo, luongCB);
		this.chuyenMon = chuyenMon;
		this.phuCapDH = phuCapDH;
	}
	public NVNC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NVNC(String maNV, String tenNV, String trinhDo, double luongCB) {
		super(maNV, tenNV, trinhDo, luongCB);
		// TODO Auto-generated constructor stub
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuyen mon: ");
		chuyenMon = sc.nextLine();
		System.out.print("Nhap phu cao cong viec: ");
		phuCapDH = sc.nextDouble();
	}
	public void output() {
		System.out.println("NVNC [chuyenMon=" + chuyenMon + ", phuCapDH=" + phuCapDH + "]");
	}
	

}
