package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

//Este classe fará o acesso ao banco de dados e os retornará para o controller
public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll(){
		return dao.findAll();
		
		
		//MOCK DOS DADOS(são dados criado temporariamente para testes)
		/*List<Department> list = new ArrayList<>();		
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Eletronics"));
		return list;*/
	}
	
	public void saveOrUpdate(Department obj) {
		if( obj.getId() == null ) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}
	
}
