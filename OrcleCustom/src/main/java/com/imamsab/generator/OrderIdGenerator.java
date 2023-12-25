package com.imamsab.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

@Override
public Serializable generate(SharedSessionContractImplementor session, Object object) {
	// TODO Auto-generated method stub
	String prefix="OD";
	String suffix="";
	try
	{
		JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
		Connection con = jdbcConnectionAccess.obtainConnection();
		String sql="select Order_Id_seq.nextval from dual";
		Statement st = con.createStatement();
		ResultSet query = st.executeQuery(sql);
		if(query.next()) {
			int in = query.getInt(1);
			suffix=String.valueOf(in);
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return prefix + suffix ;
}
}
