package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
			
		//O programa conhece apenas a interface - Inje��o de dependencia sem explicitar a implementa��o
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(1);
		
		System.out.println(seller);

	}

}
