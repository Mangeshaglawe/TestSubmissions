package com.learnings.assignment;


public class Employee {
	
		private static  String firstname;
		private static String lastname;
		private static String dept;
		
		Employee () {
			
		}
		
		Employee (String firstname, String lastname){
			Employee.firstname = firstname;
			Employee.lastname = lastname;
			 
		}
		
		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			Employee.dept = dept;
		}
		
		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			Employee.lastname = lastname;
		}
		
		 void Setfirstname(String firstname) {
			Employee.firstname = firstname;		
		}
		 
		 String getfirstname() {
				return firstname;		
			}
}
