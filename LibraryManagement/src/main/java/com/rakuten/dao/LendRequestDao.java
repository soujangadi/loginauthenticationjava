package com.rakuten.dao;

import java.util.List;

import com.rakuten.beans.Lendlist;

public interface LendRequestDao {
	 List<Lendlist> getLentRecords();
	 int lendRequestApproveAction(Lendlist lend);
	 int lendRequestRejectAction(Lendlist lend);
	 Lendlist getLendRequestById(int lendid);
	
	 
}

