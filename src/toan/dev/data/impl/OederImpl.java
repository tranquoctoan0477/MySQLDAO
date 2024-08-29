package toan.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import toan.dev.data.dao.OrderDao;
import toan.dev.data.model.Order;
import toan.dev.data.driver.MySQLDriver;
import java.util.logging.Logger;
import java.util.logging.Level;

public class OederImpl implements OrderDao {
	
	Connection con = MySQLDriver.getInstance().getConnection();
	
}
