package zm.zmmm.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import zm.zmmm.ZmmmContext;

public class ConnectionUtil {
	private static ComboPooledDataSource ds = ZmmmContext.getBean("dataSource",ComboPooledDataSource.class);
	
	
	
	public static Connection getConn() throws SQLException {
		return ds.getConnection();
	}
	
	public static void Close(Connection conn) {
		if(conn == null) {
			return;
		}
		try {
			if(conn.isClosed()) {
				return;
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
