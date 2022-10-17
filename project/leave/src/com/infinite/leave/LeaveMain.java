package com.infinite.leave;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


public class LeaveMain {
	static Scanner sc = new Scanner(System.in);
	static LeaveBAL  bal = new LeaveBAL();

			
		
		}
		public static void main(String [] args) throws ParseException{
		
		int  choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("-------");
			System.out.println("1. Add Leave");
			System.out.println("2. show Leave");
			System.out.println("3. search Leave");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				try {
				addLeaveMain();
			}catch (LeaveException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
				break;
			case 2:
				showLeaveMain();
				break;
			case 3:
				searchLeaveMain();
				break;
			}
		}while(choice!=4);
	}

			
				
			
				
				
				
	public static void searchLeaveMain() {
		int leaveId;
		System.out.println("Enter Leave Id");
		leaveId = sc.nextInt();
		Leave leaveFound = bal.searchLeaveBal(leaveId);
		if (leaveFound!=null){
			System.out.println(leaveFound);
		}else{
			System.out.println("*******Record not Found****");
		}
		
	}
	public static void showLeaveMain(){
		List<Leave> leaveDetailsList = bal.showLeaveBal();
		for (Leave leave : leave) {
		}
	}

	public static void addLeaveMain() throws LeaveException, ParseException{
		Leave leave = new Leave();
		System.out.println("Enter EmpId");
		leave.setEmpId(sc.nextInt());
		System.out.println("Enter leaveId");
		leave.setLeaveId(sc.nextInt());
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd");
		System.out.println("Enter leave start date(yy-mm-dd)");
		String startDate = sc.next();
		System.out.println("Enter leave end date(yy-mm-dd");
		String enddate = sc.next();
		leave.setLeaveEndDate(sdf.parse(enddate));
		System.out.println("Enter the no of days");
		leave.setNoOfDays(sc.nextInt());
		System.out.println("Enter the leave reason");
		leave.setLeaveReason(sc.next());
		System.out.println("Enter the Leave type (El,Ml,PL)");
		String leavetype = sc.next();
		if(leave.toUpperCase().equals("EL")){
			leave.setLeaveType(LeaveType.EL);
		}
		if(leave.toUpperCase().equals("ML")){
			leave.setLeaveType(LeaveType.ML);
		}
		if(leave.toUpperCase().equals("PL")){
			leave.setLeaveType(Leavetype.PL);
		}
		System.out.println(bal.addLeaveBal(leave));
	}		
		
	}
		
		
	
	
	
	
			
			
