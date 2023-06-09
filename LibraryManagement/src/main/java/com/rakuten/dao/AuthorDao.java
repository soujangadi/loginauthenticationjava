package com.rakuten.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.rakuten.beans.author;



public class AuthorDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}

	public int saveAuthors(author auth) {

		String insertQuery="Insert into author (authorname) VALUES"
				+ "('"+auth.getAuthorname()+"')";
		return template.update(insertQuery);
	}
	
	

	public int updateAuthor(author auth) {
		String updateQuery="Update author set authorname='"+auth.getAuthorid()+"'"
				+"where authorid="+auth.getAuthorname()+"";
		return template.update(updateQuery);
	}

	public int deleteAuthor(author auth) {
		String deleteQuery="Delete from author where authorid="+auth+"";
		return template.update(deleteQuery);

	}

	public author getAuthorById(int authorid) {
		String fetchSingleRecord="Select * from author where authorid=?";
		return template.queryForObject(fetchSingleRecord, new Object[]{authorid},
				new BeanPropertyRowMapper<author>(author.class));
	}

	public List<author> getAllAuthor(){
		return template.query("Select * from author",new RowMapper<author>() {

			@Override
			public author mapRow(ResultSet rs,int rowNum) throws SQLException{
				author A= new author();
				A.setAuthorid(rs.getInt(1));
				A.setAuthorname(rs.getString(2));
				return A;
			}
		});

	}
}

	