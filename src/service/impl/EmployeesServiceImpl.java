package service.impl;
import model.Employees;
import service.EmployeesService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesServiceImpl implements EmployeesService {
    static Map<Integer,Employees> employees=new HashMap<>();
    static {
        employees.put(1, new Employees("Toan",20,"Giam doc"));
        employees.put(2, new Employees("Lam",20,"Giam doc"));
        employees.put(3, new Employees("Kien",20,"Giam doc"));
        employees.put(4, new Employees("Trung",20,"Giam doc"));
        employees.put(5, new Employees("Phuc",20,"Giam doc"));
        employees.put(6, new Employees("Dương",20,"Giam doc"));
        employees.put(7, new Employees("Hai",20,"Giam doc"));
        employees.put(8, new Employees("Quang",20,"Giam doc"));
        employees.put(9, new Employees("Tam",20,"Giam doc"));
        employees.put(10, new Employees("Toan",20,"Giam doc"));



    }
    @Override
    public void display() {
        for (Integer id : employees.keySet()) {
            Employees employee= employees.get(id);
            System.out.println(employee);
        }
    }
}
