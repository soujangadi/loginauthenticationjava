package com.rakuten.beans;

import java.util.Date;

public class Lendlist {
	 int lendid;      
	Date requestdate;      
	Date defaultrequestdate; 
	Date actaualreturncedate;      
	int userid ;     
	int bookid ;     
	String status; 
	int fineamount;
	public int getLendid() {
		return lendid;
	}
	public void setLendid(int lendid) {
		this.lendid = lendid;
	}
	public Date getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}
	public Date getDefaultrequestdate() {
		return defaultrequestdate;
	}
	public void setDefaultrequestdate(Date defaultrequestdate) {
		this.defaultrequestdate = defaultrequestdate;
	}
	public Date getActaualreturncedate() {
		return actaualreturncedate;
	}
	public void setActaualreturncedate(Date actaualreturncedate) {
		this.actaualreturncedate = actaualreturncedate;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getFineamount() {
		return fineamount;
	}
	public void setFineamount(int fineamount) {
		this.fineamount = fineamount;
	}

}
