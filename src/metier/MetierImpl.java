package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

	// couplage faible;
	private IDao dao;
	
	@Override
	public double calculer() {
		double data = dao.getData();
		double res = data * 223 * Math.cos(data);
		return res;
	}

	/*
	 * pour injecter dans la variable dao un objet 
	 * d'une classe qui implement l'interface IDao
	 */
	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	

}
