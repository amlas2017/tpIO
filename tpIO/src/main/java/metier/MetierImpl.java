package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	private IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public Double calcul() {
		double nb = dao.getValue();		
		return nb*6;
	}

}
