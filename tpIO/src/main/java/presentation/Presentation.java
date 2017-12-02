package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) {
	
//      DaoImpl dao = new DaoImpl();		
//		MetierImpl metier = new MetierImpl();
//		metier.setDao(dao);	
//	    System.out.print(metier.calcul());
		
		try {
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName = scanner.next();
			String metierClassName = scanner.next();
//			System.out.println(daoClassName);
//			System.out.println(metierClassName);
			
			Class cDao = Class.forName(daoClassName);
			IDao dao = (IDao) cDao.newInstance();
			
			Class cMetier = Class.forName(metierClassName);
			IMetier metier = (IMetier) cMetier.newInstance();
			
			Method m1 = cMetier.getMethod("setDao", new Class[]{IDao.class}); 
			m1.invoke(metier, new Object[]{dao});
			
			System.out.print(metier.calcul());
			
			
			
			
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
	

	}

}
