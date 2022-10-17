package com.infinite.leave;

import java.util.ArrayList;
import java.util.List;

public class LeaveDao {
	static List<Leave> LeaveList;
	static {
		LeaveList = new ArrayList<Leave>();
	}
	public String updateLeaveDao(Leave LeaveNew) {
		
		
		
	}
	public  List<Leave> showLeaveDao() {
		return LeaveList;
	}
	public String addLeaveDao (Leave leave) {
		LeaveList.add(leave);
		return "Leave Record Inserted..";
	}
}
	
		
	
	
	
	
