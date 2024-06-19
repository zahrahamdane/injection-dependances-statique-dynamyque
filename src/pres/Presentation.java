package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) {
		
		/*
		 * Injection des dependance par 
		 * instanciation statique => new
		 * en utilisant un setter ou via le constructeur
		 */
		
		MetierImpl metier = new MetierImpl();
		DaoImpl dao = new DaoImpl();
		metier.setDao(dao);
		
		System.out.println("Le resultat est : " + metier.calculer());

	}

}
