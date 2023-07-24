package edu.kh.oop.cls.model.vo;

class TestVO {

// 접근 제한자(default) : 같은 패키지 내에서만 import가 가능함을 나타냄	
	
	public void ex() {
		Student std = new Student();
		System.out.println(std.v1);
		//Student와 같은 패키지에 있기 때문에
		// 
	}
	
}
