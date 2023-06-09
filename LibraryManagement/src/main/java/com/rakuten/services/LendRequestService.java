package com.rakuten.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rakuten.beans.Lendlist;
import com.rakuten.dao.LendRequestDao;

public class LendRequestService {
	
		
	    @Autowired
	    private LendRequestDao dao;
	    
	    public List<Lendlist> getLentRecords() {
	        return dao.getLentRecords();
	    }


		public int lendRequestApproveAction(Lendlist lend) {
			
			return dao.lendRequestApproveAction(lend);
		}

		public int lendRequestRejectAction(Lendlist lend) {
			
			return dao.lendRequestRejectAction(lend);
		}
		public Lendlist getLendRequestById(int lendid) {
			return dao.getLendRequestById(lendid);
		}

	}


