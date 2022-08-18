package odev19;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	/**
	 * 
	 * --1jg customer_id sına göre toplam quantity i veren sorgu select
	 * customers.customer_id, sum(order_details.unit_price) as sumOfQuantity from
	 * customers inner join orders on customers.customer_id = orders.customer_id
	 * inner join order_details on order_details.order_id = orders.order_id group by
	 * customers.customer_id
	 * 
	 * 
	 * 
	 * 
	 * --2g supplier_id sına göre unit_in_stock daki miktarı en fazla ilk 10
	 * supplier_id veren sorgu
	 * 
	 * select supplier_id, sum(units_in_stock) as stok_miktarı from products group
	 * by supplier_id order by sum(units_in_stock) desc limit 10
	 * 
	 * 
	 * 
	 * 
	 * --3g customer ları sehirlere göre saysını veren sorgu
	 * 
	 * select city, count(customer_id) from customers group by city order by
	 * count(customer_id) desc
	 * 
	 * 
	 * 
	 * 
	 * 
	 * --4jg regiona göre territory sayısını veren sorgu
	 * 
	 * select region.region_description, count(territories.territory_id) from region
	 * inner join territories on region.region_id = territories.region_id group by
	 * region.region_description
	 * 
	 * 
	 * 
	 * 
	 * --5g ship_city şere göre order_id sayilarını veren sorgu
	 * 
	 * select ship_city, count(order_id) from orders group by ship_city
	 * 
	 * 
	 * 
	 * 
	 * --6jg ship_country göre urun miktarını veren sorgu
	 * 
	 * select o.ship_country, sum(od.quantity) from orders as o inner join
	 * order_details as od on o.order_id = od.order_id group by o.ship_country
	 * 
	 * 
	 * 
	 * 
	 * --7jg category_name göre urun_price ortalamasını veren sorgu
	 * 
	 * select categories.category_name, avg(products.unit_price) as avg_price from
	 * categories inner join products on categories.category_id =
	 * products.category_id group by categories.category_name
	 * 
	 * 
	 * 
	 */

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
