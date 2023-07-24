package edu.kh.oop.cls.model.vo;

public class Student { // 클래스 선언부
	//[접근제한자] [예약어] class 클래스명
	// 접근제한자 public : 같은 프로젝트 내에서 
	// 어떤 클래스에서든 import 할 수 있음을 나타냄 
	
	
	// 1.필드(field) : 객체의 속성을 작성하는 클래스 내부 영역
	// == 멤부 변수 : 메서드 밖에 작성된 변수 
	
	// 인스턴스 변수 : 필드에 작성되는 일반 변수 
	// 클래스 변수( == static 변수) : 필드에 static 예약어가 작성된 변수 
	
	
	
	/* 필드 구성(대괄호는 생략가능)
	 * [접근 제한자]  [예약어] 			자료형 		 변수명 [=초기값;]
	 * + public			final			기본자료형		
	 * # protected		static			(참조형)		
	 * ~ (default)		final static	 배열	
	 * - private		static final	 클래스명
	 * 
	 * 
	 * 필드의 접근 제한자의 뜻 : 직접 접근 가능한 범위를 나타냄 
	 *
	 */
	
	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	private int v4 = 40;
	
	// 접근 제한자 예제
	public void ex() { 
		System.out.println(v1);
	}
	
	
	public static String schoolName = "kh 고등학교";
	 private String name;{
			name = "김길동";	 
	 }
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

		
	
	// getter/ stter
	
	
	
	// 2. 생성자 (constructor) : 
	
	/*  new 연산자를 통해서 객체를 생성활 때
	 *  생성된 객체의 필드 값 초기화 + 지정된 기능을 수행하는 역할
	 *  
	 *   생성자 작성 규칙
	 *  1) 생성장의 이름은 반드시 클래스명과 같아야 한다
	 *  2) 반환형이 존재하지 않는다 
	 * 
	 *  - 생성장 종류
	 *  1) 기본 생성사
	 *  2) 매개변수 생성자
	 * 
	 * 
	 * 
	 */
	// 기본 생성장
	// [접근제한자] 클래스명() {코드}
	public Student() {
		
		// 객체가 생성될 때 수행 할 코드
		System.out.println("기본 생성자");
	}
	
	
	
	// 3. 메서드 ( method) 
	
	

	
	
	
}