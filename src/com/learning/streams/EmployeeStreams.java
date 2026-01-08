package com.learning.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Abi",120000,25,1);
        Employee employee2 = new Employee("Aishu",150000,23,2);
        Employee employee3 = new Employee("Abilash",1500000,30,3);
        Employee employee4 = new Employee("Aishwarya",99000,21,4);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);


        List<String> empNames = employeeList.stream().filter(e->e.getAge()>=25)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(empNames);

    }
}

class Employee{
    private String Name;
    private float Salary;
    private int Age;
    private int id;

    public Employee(String name, float salary, int age, int id) {
        Name = name;
        Salary = salary;
        Age = age;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
