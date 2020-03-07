package com.hrms.testbase;

import com.hrms.pages.AddCandidatePageWebElements;
import com.hrms.pages.AddEmployeePageWebElements;
import com.hrms.pages.CandidatesPageWebElements;
import com.hrms.pages.DashboardPageWebElements;
import com.hrms.pages.LeaveListPageWebElements;
import com.hrms.pages.LoginPageWebElements;
import com.hrms.pages.PersonalDetailsWebElements;
import com.hrms.pages.ReportsPageWebElements;


public class PageInitializer extends BaseClass{
	

	public static AddCandidatePageWebElements addCandidate;
	public static AddEmployeePageWebElements addEmp;
	public static CandidatesPageWebElements candidate;
	public static DashboardPageWebElements dashboard;
	
	public static LeaveListPageWebElements leaveList;
	public static LoginPageWebElements login;
	public static PersonalDetailsWebElements perDetails;
	public static ReportsPageWebElements report;
	
	public static void initializeAllPages() {
		
		addCandidate=new AddCandidatePageWebElements();
		addEmp=new AddEmployeePageWebElements();
		candidate=new CandidatesPageWebElements();
		dashboard=new DashboardPageWebElements();
		
		leaveList=new LeaveListPageWebElements();
		login=new LoginPageWebElements();
		perDetails=new PersonalDetailsWebElements();
		report=new ReportsPageWebElements();		
	}
}
