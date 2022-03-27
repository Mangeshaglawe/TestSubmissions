package com.learning.department;

public class TechDepartment extends SuperDepartment {

	private static String department_name = "Tech Department";
	private static String today_work = "Complete coding of module 1";
	private static String work_deadline = "Complete by EOD";
	private static String techStackInformation = "core Java";

	/**
	 * @return the department_name
	 */
	public String getDepartment_name() {
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
	public String getWork_deadline() {
		return work_deadline;
	}

	/**
	 * @return the isTodayHoliday
	 */
	public String getTechStackInformation() {
		return techStackInformation;
	}

	public TechDepartment() {

		// TODO Auto-generated constructor stub
		// System.out.println("Inside Tech Department...");

	}

}
