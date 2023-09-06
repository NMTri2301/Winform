package NguyenMinhHung_2180608688;

import java.util.Scanner;

public class NVQL extends NHANVIEN{
	private String chuyenMon;
	private double phuCapCV;
	@Override
	double TinhLuong() {
		// TODO Auto-generated method stub
		return luongCB + phuCapCV;
	}
	public String getChuyenMon() {
		return chuyenMon;
	}
	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	public double getPhuCapCV() {
		return phuCapCV;
	}
	public void setPhuCapCV(double phuCapCV) {
		this.phuCapCV = phuCapCV;
	}
	public NVQL(String maNV, String tenNV, String trinhDo, double luongCB, String chuyenMon, double phuCapCV) {
		super(maNV, tenNV, trinhDo, luongCB);
		this.chuyenMon = chuyenMon;
		this.phuCapCV = phuCapCV;
	}
	public NVQL() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NVQL(String maNV, String tenNV, String trinhDo, double luongCB) {
		super(maNV, tenNV, trinhDo, luongCB);
		// TODO Auto-generated constructor stub
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuyen mon: ");
		chuyenMon = sc.nextLine();
		System.out.print("Nhap phu cao cong viec: ");
		phuCapCV = sc.nextDouble();
	}
	public void output() {
		System.out.println("NVQL [chuyenMon=" + chuyenMon + ", phuCapCV=" + phuCapCV + "]");
	}
	
	
	

}
