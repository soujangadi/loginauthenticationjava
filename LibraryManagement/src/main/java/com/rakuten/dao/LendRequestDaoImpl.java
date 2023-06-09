package com.rakuten.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.rakuten.beans.Lendlist;

public class LendRequestDaoImpl implements LendRequestDao{
		

		@Autowired
		public JdbcTemplate jdbcTemplate;

		@Override
	    public List<Lendlist> getLentRecords() {
			return jdbcTemplate.query("SELECT * FROM lendrequest where status='Requested' ", new RowMapper<Lendlist>() {

				@Override
				public Lendlist mapRow(ResultSet rs, int rowNum) throws SQLException {
					Lendlist lend = new Lendlist();
					lend.setLendid(rs.getInt("lendid"));
					lend.setUserid(rs.getInt("userid"));
					lend.setBookid(rs.getInt("bookid"));
					return lend;
				}

			});
				/*@Override
				public Lendlist mapRow(ResultSet rs, int rowNum) throws SQLException {
					Lendlist lend = new Lendlist();
					lend.setLendid(rs.getInt("lendid"));
					lend.setUserid(rs.getInt("userid"));
					lend.setBookid(rs.getInt("bookid"));
					return lend;
				}

			});*/
	    }

		@Override
		public int lendRequestApproveAction(Lendlist lend) {
			LocalDate requestdate = LocalDate.now();
			LocalDate defaultrequestdate = requestdate.plusDays(7);
			String actaualreturncedate = defaultrequestdate.toString();
			String status = "Approved";
			String approvequery = "Update lendrequest set status = ? , defaultrequestdate = ?  where lendid = " +lend.getLendid()+"";
			return jdbcTemplate.update(approvequery,status,actaualreturncedate);
		}

		@Override
		public int lendRequestRejectAction(Lendlist lend) {
			LocalDate requestdate  = LocalDate.now();
			LocalDate defaultrequestdate       = null;
			LocalDate actaualreturncedate  = null;
			String status = "Rejected";
			String rejectquery = "Update lendrequest set requeststatus = ? , defaultrequestdate = ?, actualreturndate = ? where lendid = " +lend.getLendid()+"";
			return jdbcTemplate.update(rejectquery,status, defaultrequestdate, actaualreturncedate);
		}
		@Override
		public Lendlist getLendRequestById(int id) {
			String fetchSingleRecord = "Select * from lendrequest where lendid=?";
			return jdbcTemplate.queryForObject(fetchSingleRecord,
				new Object[] {id},
				new BeanPropertyRowMapper<Lendlist>(Lendlist.class));
		}
	    
	}


