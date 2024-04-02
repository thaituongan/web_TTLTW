package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Product;
import model.User;
import services.DatabaseConnect;

public class ProductDAOlmpl implements ProductDAO {

	@Override
	public List<Product> getProductByCategory(String category) {
		List<Product> resultList = new ArrayList<>();
		try (Connection conn = DatabaseConnect.getConnection();
				PreparedStatement stmt = conn
						.prepareStatement("SELECT id, name, img, price FROM product WHERE category = ?;")) {
			stmt.setString(1, category);
			System.out.println("Executing SQL query: " + stmt);
			try (ResultSet result = stmt.executeQuery()) {
				while (result.next()) {
					int id = result.getInt("id");
					String img = result.getString("img");
					String name = result.getString("name");
					double price = result.getDouble("price");
					Product product = new Product(id, name, img, price, category);
					resultList.add(product);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultList != null) {
				System.out.println("Number of products retrieved for category " + category + ": " + resultList.size());
			} else {
				System.out.println("Result list is null for category " + category);
			}
		}
		return resultList;
	}

	@Override
	public Set<String> getAllCategories() {
		Set<String> categories = new HashSet<>();
		try (Connection conn = DatabaseConnect.getConnection();
				PreparedStatement stmt = conn.prepareStatement("SELECT DISTINCT category FROM product")) {
			try (ResultSet result = stmt.executeQuery()) {
				while (result.next()) {
					categories.add(result.getString("category"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return categories;
	}

	@Override
	public Product delete(int id) {
		Product product = null;
		try (Connection conn = DatabaseConnect.getConnection();
				PreparedStatement preStatement = conn.prepareStatement("DELETE FROM product WHERE id = ?")) {
			preStatement.setInt(1, id);
			int rows = preStatement.executeUpdate();
			if (rows > 0) {
				product = new Product(id, product.getImg(), product.getName(), product.getPrice(),
						product.getCategory());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	/*
	 * @Override public List<User> getAllUser(String username) { List<User> newUser
	 * = new ArrayList<User>(); try (Connection conn =
	 * DatabaseConnect.getConnection(); PreparedStatement preparedStatement =
	 * conn.prepareStatement("SELECT * FROM users WHERE username = ?")) {
	 * preparedStatement.setString(1, username); try (ResultSet result =
	 * preparedStatement.executeQuery()) { if (result.next()) { User user = new
	 * User(username); newUser.add(user); } } } catch (SQLException e) {
	 * e.printStackTrace(); } return newUser; }
	 */
	@Override
	public Product insert(String img, String name, double price, String category) {
		Product newProduct = null;
		try (Connection conn = DatabaseConnect.getConnection();
				PreparedStatement preStatement = conn
						.prepareStatement("INSERT INTO product(img, name, price, category) VALUES( ?, ?, ?, ?)")) {
			System.out.println("SQL Statement: " + preStatement.toString());
			preStatement.setString(1, img);
			preStatement.setString(2, name);
			preStatement.setDouble(3, price);
			preStatement.setString(4, category);
			int rows = preStatement.executeUpdate();
			if (rows > 0) {
				newProduct = new Product(img, name, price, category);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return newProduct;
	}

	@Override
	public Product findById(int id) {
		Product product = null;
		try (Connection conn = DatabaseConnect.getConnection();
				PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM product WHERE id = ?")) {
			preparedStatement.setInt(1, id);
			try (ResultSet result = preparedStatement.executeQuery()) {
				if (result.next()) {
					String img = result.getString("img");
					String name = result.getString("name");
					double price = result.getDouble("price");
					int quantity = result.getInt("quantity");
					product = new Product(id, img, name, price, quantity);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	/*
	 * @Override public User getUserById(int id) { User user = null; try (Connection
	 * conn = DatabaseConnect.getConnection(); PreparedStatement preparedStatement =
	 * conn.prepareStatement("SELECT * FROM users WHERE id = ?")) {
	 * preparedStatement.setInt(1, id); try (ResultSet result =
	 * preparedStatement.executeQuery()) { if (result.next()) { String username =
	 * result.getString("username"); user = new User(id, username); } } } catch
	 * (SQLException e) { e.printStackTrace(); } return user; }
	 * 
	 * @Override public User signup(String email, String username, String password)
	 * { User newUser = null; try (Connection conn =
	 * DatabaseConnect.getConnection(); PreparedStatement preparedStatement = conn
	 * .prepareStatement("INSERT INTO users(email, username, password) VALUES(?, ?, ?)"
	 * )) { preparedStatement.setString(1, email); preparedStatement.setString(2,
	 * username); preparedStatement.setString(3, password); int rows =
	 * preparedStatement.executeUpdate(); if (rows > 0) { newUser = new User(email,
	 * username, password); } } catch (SQLException e) { e.printStackTrace(); }
	 * return newUser; }
	 * 
	 * @Override public User signin(String username, String password) { User user =
	 * null; try (Connection conn = DatabaseConnect.getConnection();
	 * PreparedStatement preparedStatement = conn.prepareStatement(
	 * "SELECT id, username, password FROM users WHERE username = ? AND password = ?"
	 * )) { preparedStatement.setString(1, username); preparedStatement.setString(2,
	 * password); try (ResultSet result = preparedStatement.executeQuery()) { if
	 * (result.next()) { int id = result.getInt("id"); user = new User(id, username,
	 * password); } } } catch (SQLException e) { e.printStackTrace(); } return user;
	 * }
	 */
	@Override
	public void updateOTP(String email, int otp) {
		try (Connection conn = DatabaseConnect.getConnection();
				PreparedStatement preparedStatement = conn
						.prepareStatement("UPDATE users SET otp = ? WHERE email = ?")) {
			preparedStatement.setInt(1, otp);
			preparedStatement.setString(2, email);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void newPass(String username, String newPassword) {
		try (Connection conn = DatabaseConnect.getConnection();
				PreparedStatement updateStatement = conn
						.prepareStatement("UPDATE users SET password=? WHERE username=?")) {
			updateStatement.setString(1, newPassword);
			updateStatement.setString(2, username);
			int rows = updateStatement.executeUpdate();
			if (rows > 0) {
				System.out.println("Password updated successfully.");
			} else {
				System.out.println("User not found or no changes were made.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signup(String email, String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}