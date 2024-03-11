package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

//Este classe fará o acesso ao banco de dados e os retornará para o controller
public class SellerService {
	
	private SellerDao dao = DaoFactory.createSellerDao();

	public List<Seller> findAll(){
		return dao.findAll();
		
		
		//MOCK DOS DADOS(são dados criado temporariamente para testes)
		/*List<Seller> list = new ArrayList<>();		
		list.add(new Seller(1, "Books"));
		list.add(new Seller(2, "Computers"));
		list.add(new Seller(3, "Eletronics"));
		return list;*/
	}
	
	public void saveOrUpdate(Seller obj) {
		if( obj.getId() == null ) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
	
}
