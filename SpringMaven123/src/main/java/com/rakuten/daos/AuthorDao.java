package com.rakuten.daos;


	

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;
	import org.springframework.jdbc.core.BeanPropertyRowMapper;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.core.RowMapper;
	import com.rakuten.beans.authors;


	public class AuthorDao {

		JdbcTemplate template;

		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
		
		public int saveAuthors(authors auth) {
			String insertQuery= "Insert into authors(author_name)values('"
					+auth.getAuthor_name()+"')";
			return template.update(insertQuery);
		}
		
		public int updateAuthors(authors auth) {
			String updateQuery = "Update authors set author_name='"+auth.getAuthor_name()+"'"
					+"where author_id="+auth.getAuthor_id()+"";
			return template.update(updateQuery);
		}
		
		
		public authors getauthorsById(int author_id) {
			String fetchSingleRecord = "Select * from authors where author_id=?";
			return template.queryForObject(fetchSingleRecord,
					new Object[] {author_id},
					new BeanPropertyRowMapper<authors>(authors.class));

		}
		

		public List<authors> getAllauthors() {
			return template.query("Select * from authors",new RowMapper<authors>(){

				@Override
				public authors mapRow(ResultSet rs, int rowNum) throws SQLException {
					authors a = new authors();
					a.setAuthor_id(rs.getInt(1));
					a.setAuthor_name(rs.getString(2));
					return a;
				}

			});

		}

	}


