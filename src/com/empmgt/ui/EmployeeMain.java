package com.empmgt.ui;

import com.empmgt.entities.*;


public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeMain project=new EmployeeMain();
		project.start();


	}
	
	
	public void start() {
		
		Employee employees[]= new Employee[4];
		Department department1=new Department("d101","IT");
		Department department2=new Department("d102","CSE");
		Department department3=new Department("d103","IT");
		Department department4 =new Department("d104","CSE");
		
		
		Developer developer1= new Developer(001,"Rashi Gandhi",department1, "java" );
		Developer developer2= new Developer(002,"Shivi Gandhi",department2, "python" );
		
		
		Tester tester1=new Tester(003,"Suriya",department3 ,"abcd");
		Tester tester2=new Tester(003,"Jhalak",department4 ,"efgh");
		
		
		employees[0]=developer1;
		employees[1]=developer2;
		employees[2]=tester1;
		employees[3]=tester2;
		
		for(int i=0; i<employees.length;i++) {
			
		Employee iteratedValue=employees[i];
		
		if (iteratedValue instanceof Developer) {
			Developer developer=(Developer)iteratedValue;
			DisplayDeveloper(developer);
				
		}
		
		else if (iteratedValue instanceof Tester) {
			
			Tester tester =(Tester) iteratedValue;
			DisplayTester(tester);
		}
			
		}	
		}
		
		public void DisplayCompeleteDetails( Employee employee){
			
			int id = employee.getId();
			String name = employee.getName();
			Department department = employee.getDepartment();
			String deptId = department.getDeptId();
			String deptName = department.getDeptName();
			
			
			System.out.println( "Employee id is : " + id+"\n Name is : "+ name+ " \nDepartment Id and Department name is  :  "+ deptId+ "  "+deptName );
			
		}
		
		public void DisplayDeveloper(Developer developer) {
			  DisplayCompeleteDetails(developer);
			  String language = developer.getLanguage();
			  
			  System.out.println("Language known by developer is :" +  language);
			  
		}
		
		public void DisplayTester(Tester tester) {
			
			DisplayCompeleteDetails(tester);
			String tool=tester.getTools();
			
			System.out.println("Tool used by tester is : "+ tool);
		}
	
		
	
}










