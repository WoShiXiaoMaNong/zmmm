import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import zm.zmmm.ZmmmContext;
import zm.zmmm.util.ConnectionUtil;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = ConnectionUtil.getConn();

		ConnectionUtil.Close(conn);
		conn = ConnectionUtil.getConn();

		PreparedStatement ps = conn.prepareStatement("select * From test");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("id"));
		}
	}

}
