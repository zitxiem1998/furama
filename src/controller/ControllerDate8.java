package controller;

import service.EmployeesService;
import service.impl.EmployeesServiceImpl;

public class ControllerDate8 {
    public static void main(String[] args) {
        EmployeesService employeesService=new EmployeesServiceImpl();
        employeesService.display();
    }
}
