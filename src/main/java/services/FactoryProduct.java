package services;

import dao.ProductDAO;
import dao.ProductDAOlmpl;

public class FactoryProduct {

	private static FactoryProduct instance = new FactoryProduct();

	public static FactoryProduct getInstance() {
		return instance; 
	}

	public ProductDAO getProductDAO() {
		return (ProductDAO) new ProductDAOlmpl();
	}
}