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
				dao.Search();//�����ȸ
			}
		}
	}
	public static void menu() {
		System.out.println("1.����Ʈ�� ���� ��� ��ȸ");
		System.out.println("2.����Ʈ�� ���� ���� ��ȸ");
		System.out.println("3.����Ʈ�� ���� �߰�");
		System.out.println("4.����Ʈ�� ���� ����");
		System.out.println("5.����Ʈ�� ���� ����");
		System.out.println("6.����");
	}
}
