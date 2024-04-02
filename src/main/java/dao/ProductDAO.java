package dao;

import java.util.List;
import java.util.Set;

import model.Product;
import model.User;

public interface ProductDAO {

	List<Product> getProductByCategory(String category);

	Product insert(String img, String name, double price, String category);

	Set<String> getAllCategories(); 

	Product delete(int id);

	Product findById(int id);

	User getUserById(int id);
	
	public List<User> getAllUser(String username);

	User signup(String email, String username, String password);

	User signin(String username, String password);

	void updateOTP(String email, int otp);

	void newPass(String username, String newPassword);
}