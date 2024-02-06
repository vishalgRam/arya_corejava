package com.arya.customexception;

//import java.util.Scanner;

import com.arya.customexception.entites.Student;
import com.arya.customexception.except.InvalidException;
import com.arya.customexception.exceptions.RecordNotFoundException;

public class CustomExceptionDemo {

	public static void main(String[] args) {
//		int[] arrId = {1,2,3,4,5}; //new int[5];
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("Enter id ");
//		int id = scanner.nextInt();
//		System.out.println(arrId[id]);
		Student[] studentArray=new Student[3];
		studentArray[0]=new Student(1,"xyz",20);
//		
//		
	String name=studentArray[0].getName();
	System.out.println(name);
		
		try {
			printRecord(1,studentArray);
		}catch(RecordNotFoundException e) {
			e.printStackTrace();
		}
		getRecordWithId(0,studentArray);
		
	}
	private static void getRecordWithId(int i, Student[] studentArray) {
		// TODO Auto-generated method stub
		
	}
	static void printRecord(int index, Student[] students) throws RecordNotFoundException {
		try {
			System.out.println(students[index].getName());
		
		}catch(NullPointerException e){
			throw new RecordNotFoundException("Record with index:"+index+"not found",e);
			
		}
		
	}	
	static void getRecordWith(int id) {
		if(id<-1)
			throw new InvalidException();
		else
			System.out.println(id);
	}

}
