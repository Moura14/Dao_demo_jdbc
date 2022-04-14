package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n==== TEST 1 : insert department ====");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		
		System.out.println("\n==== TEST 2: findById department ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		/*
		System.out.println("\n==== TEST 3: delete department ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete!");
		*/
		System.out.println("\n ==== TEST 4: findAll department ====");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n === TEST 5 : update depertment ====");
		Department dep = departmentDao.findById(3);
		dep.setName("Tv");
		departmentDao.update(dep);
		System.out.println("Update complete!");
		
		

	}

}
