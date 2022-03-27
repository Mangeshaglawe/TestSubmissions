package com.learning.department;

public class HRDepartment extends SuperDepartment {

					
	private static String department_name = "HR Department";
	private static String today_work = "Fill today’s worksheet and mark your attendance";
	private static String work_deadline = "Complete by EOD";
	private static String doActivity = "Team Lunch";
	
	/**
	 * @return the department_name
	 */
	public  String getDepartment_name() {
		return department_name;
	}
	
	/**
	 * @return the today_work
	 */
	public String getToday_work() {
		return today_work;
	}

	/**
	 * @return the work_deadline
	 */
	public  String getWork_deadline() {
		return work_deadline;
	}

	/**
	 * @return the isTodayHoliday
	 */
	public   String getDoActivity() {
		return doActivity;
	}

	
	public HRDepartment() {
		
		// TODO Auto-generated constructor stub
		//System.out.println("Inside HR Department...");
		
	}
	
	
}
