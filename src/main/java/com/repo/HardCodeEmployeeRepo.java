package com.repo;

import com.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class HardCodeEmployeeRepo implements EmployeeRepo {
    @Override
    public List<Employee> getEmployees() {
        List<Employee> returnList = new ArrayList<>();
        Employee e1 = new Employee(1,"John","developer");
        Employee e2 = new Employee(2,"Jack","manager");
        Employee e3 = new Employee(3,"Mac","consultant");
        returnList.add(e1);
        returnList.add(e2);
        returnList.add(e3);
        return returnList;
    }
}
