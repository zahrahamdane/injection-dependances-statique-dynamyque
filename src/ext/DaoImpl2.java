package ext;

import dao.IDao;

public class DaoImpl2 implements IDao{

	@Override
	public double getData() {
		System.out.println("Version base de capteur...");
		double data = 77;
		return data;
	}
	
}
