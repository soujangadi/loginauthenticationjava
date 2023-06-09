package com.rakuten.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.rakuten.beans.Books;

public class BookDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int saveBooks(Books bk) {
		
	String insertQuery=	"Insert into Books(booktitle,noofcopies,category,imageurl)values('"
				+bk.getBooktitle()+"','"+bk.getNoofcopies()+"','"+bk.getCategory()+"','"+bk.getImageurl()+"')";
		return template.update(insertQuery);
	}
	
	public int updateBooks(Books bk) {
		String updateQuery = "Update Books set booktitle='"+bk.getBooktitle()+"'"+"Update books set noofcopies='"+bk.getNoofcopies()+"'"
				+"Update User set category='"+bk.getCategory()+"'"+"Update books set imageurl='"+bk. getImageurl()+"'"+"where userid="+bk.getBookid()+"";
		return template.update(updateQuery);
	}
	
	public int deleteBooks(int id) {
		String deleteQuery = "Delete from Books where id = "+id;
		return template.update(deleteQuery);
	}
	
	
	public Books getBooksById(int Bookid) {
		String fetchSingleRecord = "Select * from Books where bookid=?";
		return template.queryForObject(fetchSingleRecord,
				new Object[] {Bookid},
				new BeanPropertyRowMapper<Books>(Books.class));

	}
	

	public List<Books> getAllBooks() {
		return template.query("Select * from books", new RowMapper<Books>(){

			@Override
			public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
				Books a = new Books();
				a.setBookid(rs.getInt(1));
				a.setAuthorid(rs.getInt(2));
				a.setPublisherid(rs.getInt(3));
				a.setBooktitle(rs.getString(4));
			    a.setNoofcopies(rs.getInt(5));
			    a.setCategory(rs.getString(6));
			    a.setImageurl(rs.getString(7));
				return a;
			}

		
			
			
		});
	}

}
