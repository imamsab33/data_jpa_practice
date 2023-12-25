package com.imamsab.entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomPkValueGenerator implements IdentifierGenerator {

	private static final long serialVersionUID = 1L;
	String prefix = "Od-";
	int sufix;

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

		try {
			Connection con = session.getJdbcConnectionAccess().obtainConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select ORDER_ID_SEQ.nextval from dual");
			if (rs.next()) {
				sufix = rs.getInt(1);
			}else {
				sufix=1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return prefix + sufix;
	}

}
