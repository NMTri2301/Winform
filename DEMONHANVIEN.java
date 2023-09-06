package NguyenMinhHung_2180608688;

import java.util.ArrayList;
import java.util.Scanner;

public class DEMONHANVIEN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon, loainv;
		String loainnnnv;
		ArrayList<NHANVIEN> dsnv = new ArrayList<>();
		NHANVIEN nv = null;
		do {
			
			main();
			System.out.print("Moi chon menu: ");
			chon = sc.nextInt();
			switch(chon) {
				case 1:
					System.out.println("=======================================");
					System.out.println("|1. Nhap nhan vien quan ly.           |");
					System.out.println("|2. Nhap nhan vien nghien cuu.        |");
					System.out.println("|3. Nhap nhan vien phuc vu.           |");
					System.out.println("=======================================");
					System.out.print("Moi chon: ");
					loainv = sc.nextInt();
					if(loainv == 1) {
						nv = new NVQL();
						dsnv.add(nv);
					}else if(loainv == 2) {
						nv = new NVNC();
						dsnv.add(nv);
					}else if(loainv == 3) {
						nv = new NVPV();
						dsnv.add(nv);
					}
					break;
				case 2:
					System.out.println("=======================================");
					System.out.println("|nvql. Xuat nhan vien quan ly.        |");
					System.out.println("|nvnc. Xuat nhan vien nghien cuu.     |");
					System.out.println("|nvpv. Xuat nhan vien phuc vu.        |");
					System.out.println("|all. Xuat tat ca nv                  |");
					System.out.println("=======================================");
					System.out.print("Moi chon: ");
					loainnnnv = sc.nextLine();
					if(loainnnnv.equals("nvql")) {
						for(NHANVIEN nvv : dsnv) {
							if(nvv instanceof NVQL)
								nvv.output();
						}
					}
					if(loainnnnv.equals("nvnc")) {
						for(NHANVIEN nvv : dsnv) {
							if(nvv instanceof NVNC)
								nvv.output();
						}
					}
					if(loainnnnv.equals("nvpv")) {
						for(NHANVIEN nvv : dsnv) {
							if(nvv instanceof NVPV)
								nvv.output();
						}
					}
					if(loainnnnv.equals("all")) {
						for(NHANVIEN nvv : dsnv) {
							nvv.output();
						}
					}
				case 3:
					break;
				case 4:
					break;
				default:
					chon = 0;
					break;
					
			}
		}while(chon != 0);
	}
	public static void main() {
		System.out.println("=======================================");
		System.out.println("|1. Nhap nhan vien.                   |");
		System.out.println("|2. Xuat nhan vien.                   |");
		System.out.println("|3. Xuat luong nhan vien              |");
		System.out.println("|4. Tong luong phai tra cho nhan vien.|");
		System.out.println("|0. Thoat.                            |");
		System.out.println("=======================================");
	}
}
