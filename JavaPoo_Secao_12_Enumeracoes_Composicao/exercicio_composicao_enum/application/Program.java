package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

    // Método principal da aplicação
    public static void main(String[] args) {

        // Configurações iniciais
        Locale.setDefault(Locale.US); // Define o padrão de localização para US (ponto como separador decimal)
        Scanner sc = new Scanner(System.in); // Scanner para entrada de dados
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data

        // Entrada de dados do departamento
        System.out.print("Entre o nome do departamento: ");
        String departmentName = sc.nextLine();
        Department dept = new Department(departmentName); // Cria objeto Department

        // Entrada de dados do trabalhador
        System.out.println("Entre os dados do trabalhador:");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Nivel: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine()); // Converte string para Enum
        System.out.print("Salario base: ");
        double baseSalary = sc.nextDouble();

        // Criação do objeto Worker (trabalhador)
        Worker worker = new Worker(workerName, baseSalary, workerLevel, dept);

        // Entrada de dados dos contratos
        System.out.print("Quantos contratos esse trabalhador tem? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt); // Converte string para LocalDate
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duracao (horas): ");
            int hours = sc.nextInt();

            // Cria contrato e adiciona ao trabalhador
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        // Entrada de dados para cálculo de renda
        System.out.println();
        System.out.print("Entre o ano e mes para calcular o ganho (MM/YYYY): ");
        String monthAndYear = sc.next();

        // Extrai mês e ano da string informada
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        // Saída de resultados
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Ganho para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        // Fecha o Scanner
        sc.close();
    }
}
