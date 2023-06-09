package com.rakuten.dao;


	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;

	import org.springframework.jdbc.core.BeanPropertyRowMapper;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.RowMapper;

	import com.rakuten.beans.Publisher;



	public class PublisherDao {

		JdbcTemplate template;

		public void setTemplate(JdbcTemplate template) {
			this.template=template;
		}

		public int savePublisher(Publisher pub) {

			String insertQuery="Insert into Publisher (publishername) VALUES"
					+ "('"+pub.getPublisherrname()+"')";
			return template.update(insertQuery);
		}
		
		

		public int updatePublisher(Publisher pub) {
			String updateQuery="Update Publisher set publishername='"+pub.getPublisherid()+"'"
					+"where publisherid="+pub.getPublisherrname()+"";
			return template.update(updateQuery);
		}

		public int deletePublisher(Publisher pub) {
			String deleteQuery="Delete from Publisher where publisherid="+pub+"";
			return template.update(deleteQuery);

		}

		public Publisher getPublisherById(int publisherid) {
			String fetchSingleRecord="Select * from publisher where publisherid=?";
			return template.queryForObject(fetchSingleRecord, new Object[] {publisherid},
					new BeanPropertyRowMapper<Publisher>(Publisher.class));
		}

		public List<Publisher> getAllPublisher(){
			return template.query("Select * from publisher",new RowMapper<Publisher>() {

				@Override
				public Publisher mapRow(ResultSet rs,int rowNum) throws SQLException{
					Publisher A= new Publisher();
					A.setPublisherid(rs.getInt(1));
					A.setPublisherrname(rs.getString(2));
					return A;
				}
			});

		}
	}

		


