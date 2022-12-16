package spring_bean_life_cycle;

import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDAO stsDAO = new StudentDAO();
		stsDAO.selectAllRows();
	}

}
