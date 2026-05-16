package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Polimorfismo:
        // A lista é do tipo genérico Employee, mas pode armazenar tanto Employee quanto OutsourcedEmployee.
        // Isso permite que o método payment() seja chamado de forma diferente dependendo do objeto real.
        List<Employee> list = new ArrayList<>();
        
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                // Polimorfismo:
                // Aqui adicionamos um OutsourcedEmployee na lista de Employee.
                // O método payment() será chamado de acordo com o tipo real do objeto.
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else {
                // Polimorfismo:
                // Também adicionamos um Employee comum na mesma lista genérica.
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            // Polimorfismo:
            // O método payment() chamado aqui pode ser o da classe Employee ou o sobrescrito em OutsourcedEmployee.
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        
        sc.close();
    }
}
