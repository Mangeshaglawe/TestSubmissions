package com.learning.driver;
import java.util.Scanner;

import com.learning.department.*;

public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperDepartment admin_dept  = new AdminDepartment();
		
		System.out.println("===============================");
		System.out.println("Welcome to " + admin_dept.getDepartment_name());
		System.out.println(admin_dept.getToday_work());
		System.out.println(admin_dept.getWork_deadline());
		System.out.println(admin_dept.isTodayHoliday());
		
		HRDepartment hr_dept  = new HRDepartment();
		
		System.out.println("===============================");
		System.out.println("Welcome to " + hr_dept.getDepartment_name());
		System.out.println(hr_dept.getDoActivity());
		System.out.println(hr_dept.getToday_work());
		System.out.println(hr_dept.getWork_deadline());
		System.out.println(hr_dept.isTodayHoliday());
		
		TechDepartment tech_dept  = new TechDepartment();
		
		System.out.println("===============================");
		System.out.println("Welcome to " + tech_dept.getDepartment_name());
		System.out.println(tech_dept.getToday_work());
		System.out.println(tech_dept.getWork_deadline());
		System.out.println(tech_dept.getTechStackInformation());
		System.out.println(tech_dept.isTodayHoliday());
		
		
		
		/*
		 	try (Scanner in = new Scanner(System.in)) {
			System.out.println("Please Enter Dept ID TECH  ID : 0");
			System.out.println("Please Enter Dept ID Admin ID : 1");
			System.out.println("Please Enter Dept ID HR    ID : 2");
			

			int id = in.nextInt();

			switch (id) {
			case 0:
				System.out.println("You've selected Tech Dept.");
				TechDepartment tech_dept  = new TechDepartment();
				
				System.out.println("===============================");
				System.out.println("Welcome to " + tech_dept.getDepartment_name());
				System.out.println(tech_dept.getToday_work());
				System.out.println(tech_dept.getWork_deadline());
				System.out.println(tech_dept.getTechStackInformation());
				System.out.println(tech_dept.isTodayHoliday());
				
				break;
			case 1:
				System.out.println("You've selected Admin Dept.");
				SuperDepartment admin_dept  = new AdminDepartment();
				
				System.out.println("===============================");
				System.out.println("Welcome to " + admin_dept.getDepartment_name());
				System.out.println(admin_dept.getToday_work());
				System.out.println(admin_dept.getWork_deadline());
				System.out.println(admin_dept.isTodayHoliday());
				
				break;
			case 2:
				System.out.println("You've selected HR Dept.");
				HRDepartment hr_dept  = new HRDepartment();
				
				System.out.println("===============================");
				System.out.println("Welcome to " + hr_dept.getDepartment_name());
				System.out.println(hr_dept.getDoActivity());
				System.out.println(hr_dept.getToday_work());
				System.out.println(hr_dept.getWork_deadline());
				System.out.println(hr_dept.isTodayHoliday());
				
				break;
			default:
				System.out.println("You've selected Invalid Dept");
			}
			
		}
		*/
		
		
	}

}
