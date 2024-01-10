package org.example;

import org.example.service.EmployeeServiceImpl;


import jakarta.xml.ws.Endpoint;

import java.util.logging.ConsoleHandler;

public class PublishEmployeeService {
    public static void main(String[] args) {
        String url = "http://localhost:8080/employeeservice";
        ConsoleHandler Endpoint;
        Endpoint.publish(url, new EmployeeServiceImpl());
        System.out.println("EmployeeService publié à : " + url);
    }
}
