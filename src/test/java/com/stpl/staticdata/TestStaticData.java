package com.stpl.staticdata;

import com.stpl.vo.Student;

public class TestStaticData {
	
	public static Student getData(){
		Student testStudent = new Student();
		testStudent.setFn("Nisargs");
		testStudent.setLn("Desai");
//		testStudent.setId(150);
		
		return testStudent;
	}
	
}
