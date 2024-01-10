package org.example.service;

import jakarta.jws.WebService;
import org.example.DatabaseConfig;
import org.example.models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebService(endpointInterface = "com.exemple.service.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

    public void createEmployee(Employee employee) {
        try (Connection connection = DatabaseConfig.getConnection()) {
            String query = "INSERT INTO employees (employeeId, firstName, lastName) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, employee.getEmployeeId());
                statement.setString(2, employee.getFirstName());
                statement.setString(3, employee.getLastName());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee readEmployee(int employeeId) {
        Employee employee = new Employee();
        try (Connection connection = DatabaseConfig.getConnection()) {
            String query = "SELECT * FROM employees WHERE employeeId=?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, employeeId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        employee.setEmployeeId(resultSet.getInt("employeeId"));
                        employee.setFirstName(resultSet.getString("firstName"));
                        employee.setLastName(resultSet.getString("lastName"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public void updateEmployee(Employee employee) {
        try (Connection connection = DatabaseConfig.getConnection()) {
            String query = "UPDATE employees SET firstName=?, lastName=? WHERE employeeId=?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, employee.getFirstName());
                statement.setString(2, employee.getLastName());
                statement.setInt(3, employee.getEmployeeId());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int employeeId) {
        try (Connection connection = DatabaseConfig.getConnection()) {
            String query = "DELETE FROM employees WHERE employeeId=?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, employeeId);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
