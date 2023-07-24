package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능을 제공하는 클래스
public class AbstractionService {

	
	public void ex1() {
		// 국민 객체 만들기
		People p1 = new People();
		//People p1: People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People() : 새로운 People 객체를 Heap 영역에 생성
		
		//** 클래스 이름이 자료형처럼 사용된다
		//== 그래서 클래스를 "사용자 정의 자료형"이라고도 한다**
		
		//p1.name = "홍길동";
		p1.setName("홍길동");
		//p1.setAge =25;
		p1.setAge(25);
		//p1.gender = '남';
		//p1.phone = "010-1234-1234";
		//p1.pNo = "2000";
		//p1.address = "서울시";
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		People p2 = new People();
		p2.setAge(30);
		System.out.println(p2.getAge());
	}
	
}
