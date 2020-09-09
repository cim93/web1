package edu.java.contact01;

// 데이터 클래스(이름, 연락처, 이메일)
public class Contact {
	// 멤버 변수(필드, 프로퍼티)
	private String name;
	private String phone;
	private String email;
	
	// 기본 생성자
	public Contact() {}

	public Contact(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	// getter/setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void displayInfo() {
		System.out.println("--- 연락처 정보 ---");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	} // end displayInfo()
	
	
	
} // end Contact







