package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		//O programa conhece apenas a interface - Inje��o de dependencia sem explicitar a implementa��o
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller findById =====");
		Seller seller = sellerDao.findById(1);					
		System.out.println(seller);		
		
		System.out.println("\n=== TESTE 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartmentId(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: seller findByAll =====");		
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 4: seller insert =====");
		Seller newSeller = new Seller(null, "Tiago", "tiago@gmail.com", new Date(), 1000.0, department);
		sellerDao.insert(newSeller);
		
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		
		System.out.println("\n=== TESTE 5: seller update =====");
		seller = sellerDao.findById(1);		
		seller.setName("Pamela Souza");
		sellerDao.update(seller);
		
		System.out.println("Update completed");
		
		System.out.println("\n=== TESTE 6: seller update =====");
		System.out.println("Enter with Id");		
		sellerDao.deleteById(sc.nextInt());
		
		System.out.println("Delete completed");
		

		
	}

}
