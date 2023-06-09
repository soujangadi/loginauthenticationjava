package com.rakuten.libman;

import java.util.Iterator;
import java.util.List;

public class Department {
	 private int deptid;
	 private String deptname;
	 private List<String> list;
	 
	
		 
	
	public Department(int deptid, String deptname, List<String>list) {
		this.setDeptid(deptid);
		this.setDeptname(deptname);
		this.list = list;
	}
	void displayRecords()
	{
		System.out.println("deptid\t\t|deptname\t");
		
				
			Iterator<String> itr =list.iterator();
			while(itr.hasNext()) {
				System.out.println("\t"+itr.next());
	}

	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
	

}
