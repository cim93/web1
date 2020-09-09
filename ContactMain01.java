package edu.java.contact01;

import java.util.Scanner;

public class ContactMain01 {
	public static final int MENU_QUIT = 0; // ����
	public static final int MENU_INSERT = 1; // ���
	public static final int MENU_SELECT_ALL = 2; // ��ü �˻�
	public static final int MENU_SELECT = 3; // �󼼰˻�
	public static final int MENU_UPDATE = 4; // ����
	
	// ����ó �ִ� ���� ���� - ���
	public static final int MAX = 100;
		
	public static Scanner sc = new Scanner(System.in);
	public static Contact[] contactList = new Contact[MAX]; // ����ó ���� �迭 
	public static int count = 0; // �迭�� ������ �ε���
	
	public static void main(String[] args) {
		System.out.println("����ó Version 0.1");
		int choice = 0;
		boolean run = true;
		while (run) { // ���� ����
			showMainMenu();
			choice = sc.nextInt();
			sc.nextLine(); // ���� �ڿ� ����Ű�� ����
			
			// ���õ� ��ȣ�� ���� �� ����� ����
			switch (choice) {
			case MENU_QUIT : 	// ���α׷� ����
				run = false;
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			case MENU_INSERT : // ���
				insertContact();
				break;
			case MENU_SELECT_ALL : // ��ü�˻�
				selectAllContact();
				break;
			case MENU_SELECT : // �󼼰˻�
				selectContact();
				break;
			case MENU_UPDATE : // ����
				updateContact();
				break;
			default :
				System.out.println("�߸��� ��ȣ �����Դϴ�. 0 ~ 4���� ������ �ּ���.");
			}
		}
	} // end main()
	
	// �޴� UI �����ִ� �Լ�
	public static void showMainMenu() {
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("0.���� | 1.��� | 2.��ü�˻� | 3. �󼼰˻� | 4.����");
		System.out.println("------------------------------------------------");
		System.out.println("����>");
	} // end showMainMenu()
	
	// ����ó ��� �Լ�
	public static void insertContact() {
		System.out.println();
		System.out.println("����ó ��� �޴�");
		System.out.println("------------------------------------------------");
		System.out.println("�̸� �Է�>");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ �Է�>");
		String phone = sc.nextLine();
		System.out.println("�̸��� �Է�>");
		String email = sc.nextLine();
		
		// Contact �ν��Ͻ� ����
		Contact c = new Contact(name, phone, email);
		
		// �迭�� ����
		contactList[count] = c; // 0������ �����ؼ�
		count++; // �ϳ��� �����ϸ鼭 ����
		
		System.out.println("����ó �Է� �Ϸ�!");
	} // end insertContact()
	
	// ����ó ��ü �˻� �Լ�
	public static void selectAllContact() {
		for (int i = 0; i < count; i++) {
			System.out.println();
			System.out.println("--- ����ó " + i + " ---");
			contactList[i].displayInfo();
		}
	}
	
	// ����ó �󼼰˻� �Լ�
	public static void selectContact() {
		System.out.println();
		System.out.println("�˻��� �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (index >= 0 && index < count) {
			contactList[index].displayInfo(); // index�� �����Ͽ� ������ ���
		} else {
			System.out.println("�ش� �ε����� ����ó�� �����ϴ�!");
		}
	} // end selectContact()

	// ����ó ���� �Լ�
	public static void updateContact() {
		System.out.println();
		System.out.println("������ �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (index >= 0 && index < count) {
			System.out.println("������ �̸� �Է�>");
			String name = sc.nextLine();
			System.out.println("������ ��ȭ��ȣ �Է�>");
			String phone = sc.nextLine();
			System.out.println("������ �̸��� �Է�>");
			String email = sc.nextLine();
			
			contactList[index].setName(name);
			contactList[index].setPhone(phone);
			contactList[index].setEmail(email);
			System.out.println("����ó ���� �Ϸ�!");
		} else {
			System.out.println("�ش� �ε����� ����ó�� �����ϴ�!");
		}
	}
	
	
} // end ContactMain01














