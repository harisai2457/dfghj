package com.infinite.leave;

import java.util.Date;
public class LeaveBAL {
	static StringBuilder sb = new StringBuilder() ;
	static LeaveDao dao = new LeaveDao();
	public Leave searchLeaveBal(int empId,int leaveid){
		return dao.searchLeaveDao(empId,leaveid);
	}
	
		
		
		
		
		
		
		
	}




	public String addLeaveBal (Leave leave) throws LeaveException {
		if (isValid(leave) == false) {
			throw new LeaveException(sb.toString());
		}
		return dao.addLeaveDao(leave);
	}
	public boolean isValid(Leave leave){
		boolean vaild = true;
		Date today = new Date();
		long ms = leave.getLeaveEndDate().getTime() - leave.getLeaveStartDate().getTime();
		long d = (ms/(1000*60*6024));
		int days = (int)d;
		days++;
		if(days<=0) {
			days++;
			if(days<=0){
				vaild=false;
				sb.append("Leave Start Date cannot be greater than leave end date\n");
			}
			ms= leave.getLeaveStartDate().getTime()- today.getTime();
			d = (ms/(1000*60*60*24));
			int Days = (int)d;
			days++;
			if(days <= 0){
				days++;
				if(days<=0){
					vaild=false;
					sb.append("Leave Start Date cannot be greater than leave end date\n");
				}
				ms= leave.getLeaveStartDate().getTime()- today.getTime();
				d = (ms/(1000*60*60*24));
				int Days1 = (int)d;
				days++;
				if(days <=0){
					vaild=false;
					sb.append("Leave End Date cannot be leassthan leave end date\n");
				}
			}
			
		}
		return vaild;
	}
}

				
	
