package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

//Este classe fará o acesso ao banco de dados e os retornará para o controller
public class DepartmentService {

	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Eletronics"));
		return list;
	}
	
}
