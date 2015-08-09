package com.jlc;

import java.util.Comparator;
import java.util.logging.Logger;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private Logger LOG=Logger.getLogger(getClass().getName());
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//LOG.info(this.id+"==="+this.name);
		return this.id+"==="+this.name;
	}

	@Override
	public int compareTo(Student student) {
		//LOG.info(this.id+"==="+student.id);
		// TODO Auto-generated method stub
		//return this.id==student.id?0:(this.id>student.id?1:-1);
		return Integer.compare(this.id, student.id);
		//return this.id-student.id;
	}

	
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student st1, Student st2) {
			// TODO Auto-generated method stub
			return st1.name.compareTo(st2.name);
						 
		}

	}
	

}
