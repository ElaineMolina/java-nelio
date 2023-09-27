package com.molina.memoria_arrays_listas;

import com.molina.entities.Employee_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exerc_list {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee_list> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1 + ":"));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee_list emp = new Employee_list(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Employee_list emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employess: ");
        for (Employee_list e : list) {
            System.out.println(e);
        }

        sc.close();

    }

    public static Integer position(List<Employee_list> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee_list> list, int id) {
        Employee_list emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
