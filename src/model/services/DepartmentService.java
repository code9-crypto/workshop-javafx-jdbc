package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

//Este classe fará o acesso ao banco de dados e os retornará para o controller
public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		//MOCK DOS DADOS(são dados criado temporariamente para testes)
		/*list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Eletronics"));
		return list;*/
		return dao.findAll();
	}
	
}
