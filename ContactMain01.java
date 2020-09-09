package edu.java.contact01;

import java.util.Scanner;

public class ContactMain01 {
	public static final int MENU_QUIT = 0; // 종료
	public static final int MENU_INSERT = 1; // 등록
	public static final int MENU_SELECT_ALL = 2; // 전체 검색
	public static final int MENU_SELECT = 3; // 상세검색
	public static final int MENU_UPDATE = 4; // 수정
	
	// 연락처 최대 저장 개수 - 상수
	public static final int MAX = 100;
		
	public static Scanner sc = new Scanner(System.in);
	public static Contact[] contactList = new Contact[MAX]; // 연락처 저장 배열 
	public static int count = 0; // 배열에 접근할 인덱스
	
	public static void main(String[] args) {
		System.out.println("연락처 Version 0.1");
		int choice = 0;
		boolean run = true;
		while (run) { // 무한 루프
			showMainMenu();
			choice = sc.nextInt();
			sc.nextLine(); // 숫자 뒤에 엔터키를 제거
			
			// 선택된 번호에 따라 각 기능을 수행
			switch (choice) {
			case MENU_QUIT : 	// 프로그램 종료
				run = false;
				System.out.println("프로그램이 종료되었습니다.");
				break;
			case MENU_INSERT : // 등록
				insertContact();
				break;
			case MENU_SELECT_ALL : // 전체검색
				selectAllContact();
				break;
			case MENU_SELECT : // 상세검색
				selectContact();
				break;
			case MENU_UPDATE : // 수정
				updateContact();
				break;
			default :
				System.out.println("잘못된 번호 선택입니다. 0 ~ 4까지 선택해 주세요.");
			}
		}
	} // end main()
	
	// 메뉴 UI 보여주는 함수
	public static void showMainMenu() {
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("0.종료 | 1.등록 | 2.전체검색 | 3. 상세검색 | 4.수정");
		System.out.println("------------------------------------------------");
		System.out.println("선택>");
	} // end showMainMenu()
	
	// 연락처 등록 함수
	public static void insertContact() {
		System.out.println();
		System.out.println("연락처 등록 메뉴");
		System.out.println("------------------------------------------------");
		System.out.println("이름 입력>");
		String name = sc.nextLine();
		System.out.println("전화번호 입력>");
		String phone = sc.nextLine();
		System.out.println("이메일 입력>");
		String email = sc.nextLine();
		
		// Contact 인스턴스 생성
		Contact c = new Contact(name, phone, email);
		
		// 배열에 저장
		contactList[count] = c; // 0번부터 저장해서
		count++; // 하나씩 증가하면서 저장
		
		System.out.println("연락처 입력 완료!");
	} // end insertContact()
	
	// 연락처 전체 검색 함수
	public static void selectAllContact() {
		for (int i = 0; i < count; i++) {
			System.out.println();
			System.out.println("--- 연락처 " + i + " ---");
			contactList[i].displayInfo();
		}
	}
	
	// 연락처 상세검색 함수
	public static void selectContact() {
		System.out.println();
		System.out.println("검색할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (index >= 0 && index < count) {
			contactList[index].displayInfo(); // index로 접근하여 데이터 출력
		} else {
			System.out.println("해당 인덱스에 연락처가 없습니다!");
		}
	} // end selectContact()

	// 연락처 수정 함수
	public static void updateContact() {
		System.out.println();
		System.out.println("수정할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		if (index >= 0 && index < count) {
			System.out.println("수정할 이름 입력>");
			String name = sc.nextLine();
			System.out.println("수정할 전화번호 입력>");
			String phone = sc.nextLine();
			System.out.println("수정할 이메일 입력>");
			String email = sc.nextLine();
			
			contactList[index].setName(name);
			contactList[index].setPhone(phone);
			contactList[index].setEmail(email);
			System.out.println("연락처 수정 완료!");
		} else {
			System.out.println("해당 인덱스에 연락처가 없습니다!");
		}
	}
	
	
} // end ContactMain01














