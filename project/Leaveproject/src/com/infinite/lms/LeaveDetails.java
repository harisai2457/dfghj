package com.infinite.lms;

import java.util.Date;

public class LeaveDetails {

}
private int leaveId;
private int empId;
private Date leaveStartDate;
private Date leaveEndDate;
private int noOfDays;
private  String leaveReason;
private LeaveType leavetype;
public LeaveDetails(int leaveId, int empId, Date leaveStartDate,
		Date leaveEndDate, int noOfDays, String leaveReason,
		LeaveType leavetype) {
	
	this.leaveId = leaveId;
	this.empId = empId;
	this.leaveStartDate = leaveStartDate;
	this.leaveEndDate = leaveEndDate;
	this.noOfDays = noOfDays;
	this.leaveReason = leaveReason;
	this.leavetype = leavetype;
}
@Override
public String toString() {
	return "LeaveDetails [leaveId=" + leaveId + ", empId=" + empId
			+ ", leaveStartDate=" + leaveStartDate + ", leaveEndDate="
			+ leaveEndDate + ", noOfDays=" + noOfDays + ", leaveReason="
			+ leaveReason + ", leavetype=" + leavetype + "]";
}
public int getLeaveId() {
	return leaveId;
}
public void setLeaveId(int leaveId) {
	this.leaveId = leaveId;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public Date getLeaveStartDate() {
	return leaveStartDate;
}
public void setLeaveStartDate(Date leaveStartDate) {
	this.leaveStartDate = leaveStartDate;
}
public Date getLeaveEndDate() {
	return leaveEndDate;
}
public void setLeaveEndDate(Date leaveEndDate) {
	this.leaveEndDate = leaveEndDate;
}
public int getNoOfDays() {
	return noOfDays;
}
public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}
public String getLeaveReason() {
	return leaveReason;
}
public void setLeaveReason(String leaveReason) {
	this.leaveReason = leaveReason;
}
public LeaveType getLeavetype() {
	return leavetype;
}
public void setLeavetype(LeaveType leavetype) {
	this.leavetype = leavetype;
}
public LeaveDetails() {
	
	// TODO Auto-generated constructor stub
}
}

