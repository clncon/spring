package cn.itcast.spring_03.p_jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDao {
	
	 
	  @Resource
	 private JdbcTemplate jdbcTemplate;
	 
	/**
	 * 保存用户信息
	 * @param user
	 */
	public void saveUser(User user){
		/*jdbcTemplate.execute(new ConnectionCallback<JdbcTemplate>(){
			public JdbcTemplate doInConnection(java.sql.Connection con) throws java.sql.SQLException ,org.springframework.dao.DataAccessException {
				String sql ="insert into user(name,age)values(?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,user.getName());
				ps.setInt(2,user.getAge());
				ps.execute();
				ps.close();
				return null;
				
			};
		});*/
		
		 String sql = "insert into user(name,age)values(?,?)";
		jdbcTemplate.update(sql, user.getName(),user.getAge());
		
		
	}
	 /**
	  * 根据id值来删除一条用户信息
	  * @param id
	  */
	public void deleteUser(int id){
		String sql = "delete from user where id=?";
		   jdbcTemplate.update(sql, id);
	}
	/**
	 * 更新用户信息
	 * @param user
	 */
	public void updateUser(User user){
		String sql = "update user set name=?,age=? where id=?";
		 jdbcTemplate.update(sql,user.getName(),user.getAge(),user.getId());
	}
	 /**
	  * 根据id值获取一个用户
	  * @param id
	  * @return
	  */
	@SuppressWarnings("unchecked")
	public User getUserById(int id){
		String sql ="select * from user where id=?";
		return  (User) jdbcTemplate.queryForObject(sql,new Object[]{id}, new RowMapper(){

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				return new User(id,name,age);
			}
			
		});
		
	}
	/**
	 * 查询所有的用户信息
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<User> findAll(){
		
		return jdbcTemplate.query("select * from user", new RowMapper(){

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				  int id = rs.getInt("id");
				  String name = rs.getString("name");
				  int age = rs.getInt("age");
				return new User(id,name,age);
			}
			
		});}
	
	    /**
	     * 查询总数量
	     */
	   @SuppressWarnings("deprecation")
	public int getCount(){
		   String sql="select count(*) from user";
		   return jdbcTemplate.queryForInt(sql);
	   }
	  /**
	   * 查询所有的用户信息(带分页的)
	   * @param firstResult
	   * @param maxResult
	   * @return
	   */
	@SuppressWarnings("unchecked")
	public QueryResult findAll(int firstResult,int maxResult){
		 int count = getCount();
		 
		 List<User> list  = (List) jdbcTemplate.query("select * from user limit ?,?"//
				, new Object[]{firstResult,maxResult}, new RowMapper(){

					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
					    int id = rs.getInt("id");
					    String name= rs.getString("name");
					    int age = rs.getInt("age");
					
						return new User(id,name,age);
					}});
		return new QueryResult(count, list);
	}

	
	@Transactional(isolation = Isolation.READ_COMMITTED)
	public void testGet(int id) {
		User user = getUserById(id);
		System.out.println(user);
		user = getUserById(id);
		System.out.println(user);
	}
}
