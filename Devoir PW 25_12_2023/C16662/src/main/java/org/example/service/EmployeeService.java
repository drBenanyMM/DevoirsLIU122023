package org.example.service;

import jakarta.jws.WebService;
import org.example.models.Employee;

@WebService
interface EmployeeService {
    void createEmployee(Employee employee);
    Employee readEmployee(int employeeId);
    void updateEmployee(Employee employee);
    void deleteEmployee(int employeeId);
}
