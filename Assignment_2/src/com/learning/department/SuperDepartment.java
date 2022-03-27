package com.learning.department;

public abstract class SuperDepartment {
	private static String department_name = "Super Department";
	private static String today_work = "No Work as of now";
	private static String work_deadline = "Nil";
	private static String isTodayHoliday = "Today is not a holiday";
	/**
	 * @return the department_name
	 */
	public String getDepartment_name() {
		return department_name;
	}
	/**
	 * @param department_name the department_name to set
	 */
	/*public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}*/
	/**
	 * @return the today_work
	 */
	public String getToday_work() {
		return today_work;
	}
	/**
	 * @param today_work the today_work to set
	 */
	/*public void setToday_work(String today_work) {
		this.today_work = today_work;
	}*/
	/**
	 * @return the work_deadline
	 */
	public  String getWork_deadline() {
		return work_deadline;
	}
	/**
	 * @param work_deadline the work_deadline to set
	 */
	/*public void setWork_deadline(String work_deadline) {
		this.work_deadline = work_deadline;
	}*/
	/**
	 * @return the isTodayHoliday
	 */
	public String isTodayHoliday() {
		return isTodayHoliday;
	}
	/**
	 * @param isTodayHoliday the isTodayHoliday to set
	 */
	/*public void setTodayHoliday(boolean isTodayHoliday) {
		this.isTodayHoliday = isTodayHoliday;
	}*/
	
	
	
	public SuperDepartment() {
		// TODO Auto-generated constructor stub
		//System.out.println("Inside SuperDepartment...");
	}
	
	
	

}
