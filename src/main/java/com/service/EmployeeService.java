package com.service;

import com.model.Employee;
import com.repo.EmployeeRepo;
import com.repo.HardCodeEmployeeRepo;

import java.util.List;

public class EmployeeService {
    public Employee getEmployee(String id) {
        EmployeeRepo repo = new HardCodeEmployeeRepo();

        List<Employee> employees = repo.getEmployees();
        return findEmployeeInList(employees,id);
    }

    private Employee findEmployeeInList(List<Employee> employees, String id) {

           // return employees.stream().filter(e -> e.getId() == Integer.parseInt(id)).findFirst().orElse(null);

            for(Employee e: employees) {
                if(Integer.parseInt(id)== e.getId()){
                    return e;
                }
            }


        return null;
    }
}
