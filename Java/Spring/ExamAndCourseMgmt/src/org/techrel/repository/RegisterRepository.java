package org.techrel.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.techrel.dto.RegisterBean;

@Repository
public class RegisterRepository {
	String query="";
	@Autowired
	private JdbcTemplate template;
	
	public int registerUser(RegisterBean bean){
		int count=0;
		query="insert into register values(register_seq.nextval,?,?,?,?,?)";
		Object data[]={bean.getName(),bean.getEmail(),bean.getContact(),bean.getGender(),bean.getPassword()};
		count=template.update(query,data);
		return count;
	}
	
}
