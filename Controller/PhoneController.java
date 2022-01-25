package Controller;

import java.util.Scanner;

import DAO.SmartPhoneDAO;

public class PhoneController {

	public static void main(String[] args) {
		SmartPhoneDAO dao=new SmartPhoneDAO();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		while(true) {
			menu();
			choice=sc.nextInt();
			if(choice==1) {
				dao.Search();//모두조회
			}
		}
	}
	public static void menu() {
		System.out.println("1.스마트폰 정보 모두 조회");
		System.out.println("2.스마트폰 정보 조건 조회");
		System.out.println("3.스마트폰 정보 추가");
		System.out.println("4.스마트폰 정보 수정");
		System.out.println("5.스마트폰 정보 삭제");
		System.out.println("6.종료");
	}
}
