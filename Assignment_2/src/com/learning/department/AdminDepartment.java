package com.learning.department;

public class AdminDepartment extends SuperDepartment {

					
	 
	private static String department_name = "Admin Department";
	private static String today_work = "Complete your documents Submission";
	private static String work_deadline = "Complete by EOD";
	
	
	/**
	 * @return the department_name
	 */
	public String getDepartment_name() {
		return department_name;
	}
	
	/**
	 * @return the today_work
	 */
	public  String getToday_work() {
		return today_work;
	}

	/**
	 * @return the work_deadline
	 */
	public  String getWork_deadline() {
		return work_deadline;
	}

		
	public AdminDepartment() {
		
		// TODO Auto-generated constructor stub
		//System.out.println("Inside Admin Department...");
		
	}
	
	
}
