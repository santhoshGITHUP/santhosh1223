package com.same;

public class Company {    // public--acccess spcifier,   class-- class, 
   private void CompanyName() {       // <-----   method creation 
	   System.out.println("CTTI");
   }
	private void companyId() {
		System.out.println("ctsp006");
	}
	private void companyPhone() {
		System.out.println("9942978431");
	}
	public void copy() {
		System.out.println("this value is copy done");
	}
	
	public static void main(String[] args) {    // <-- object creation
		Company c= new Company();
		c.CompanyName();
		c.companyId();
		c.companyPhone();
		
	}
	
}

