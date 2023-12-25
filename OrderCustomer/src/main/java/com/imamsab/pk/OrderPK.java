package com.imamsab.pk;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderPK implements IdentifierGenerator{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String prefix="OD-";
	int suffix;
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

        try {
			Connection jd = session.getJdbcConnectionAccess().obtainConnection();
			Statement cs = jd.createStatement();
			ResultSet rs = cs.executeQuery("select order_entity1.nextval from dual");
			if (rs.next())
			{
				suffix=rs.getInt(1);
			}
			else
			{
				suffix=1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prefix + suffix;
	}

}
