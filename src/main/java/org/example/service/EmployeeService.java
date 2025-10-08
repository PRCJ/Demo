package org.example.service;


import org.example.model.Employee;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "Poonam", "Tech"));
        employees.add(new Employee(2, "Tej", "Finance"));
    }

    public List<Employee> getAll() { return employees; }

    public Employee addEmployee(Employee e) {
        employees.add(e);
        return e;
    }

    public boolean deleteById(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }
}
