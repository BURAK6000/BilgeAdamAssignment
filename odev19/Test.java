package odev19;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws Exception {

		Driver.class.forName("org.postgresql.Driver");

		DatabaseConnection databaseConnection = new DatabaseConnection();

		getSupplierIdUnitStock(databaseConnection.getConnection("northwind"), 20);

		getCustomerIdTotalQuantity(databaseConnection.getConnection("northwind"));

		databaseConnection.getConnection("northwind").close();

		System.out.println("ıslem Bitti");

	}

	/**
	 * -- supplier_id sına göre unit_in_stock daki miktarı en fazla ilk 10
	 * supplier_id veren sorgu
	 * 
	 * @param connection
	 * @param limitSayisi
	 * @throws SQLException
	 */

	public static void getSupplierIdUnitStock(Connection connection, int limitSayisi) throws SQLException {

		String sqlString = "select supplier_id, sum(units_in_stock) as stok_miktarı from products group  by supplier_id order by sum(units_in_stock) desc limit '"
				+ limitSayisi + "'";

		PreparedStatement pStatement = connection.prepareStatement(sqlString);

		ResultSet rSet = pStatement.executeQuery();

		System.out.println("supplier_id - stok_miktarı");

		while (rSet.next()) {
			System.out.print(rSet.getInt(1) + "     -      ");
			System.out.println(rSet.getLong(2));

		}

	}

	/**
	 * -- customer_id sına göre toplam quantity i veren sorgu
	 * 
	 * @param connection
	 * @param limitSayisi
	 * @throws SQLException
	 */

	public static void getCustomerIdTotalQuantity(Connection connection) throws SQLException {

		String sqlString = "select customers.customer_id, sum(order_details.unit_price) as sumOfQuantity from customers inner join orders on customers.customer_id = orders.customer_id inner join order_details on order_details.order_id = orders.order_id\r\n"
				+ "group by customers.customer_id";

		PreparedStatement pStatement = connection.prepareStatement(sqlString);

		ResultSet rSet = pStatement.executeQuery();

		System.out.println("customer_id - sumOfQuantity");

		while (rSet.next()) {
			System.out.print(rSet.getString(1) + "     -      ");
			System.out.println(rSet.getLong(2));

		}

	}

}
