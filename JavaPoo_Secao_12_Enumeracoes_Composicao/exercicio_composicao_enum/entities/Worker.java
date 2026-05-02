package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    
    // Atributos principais do trabalhador
    private String name;
    private Double baseSalary;
    // Enum que representa o nível do trabalhador
    private WorkerLevel level;
    
    // Associações:
    // Um trabalhador pertence a um departamento
    private Department department;
    // Um trabalhador possui vários contratos
    // A lista de contratos deve ser inicializada vazia na instância
    // e manipulada apenas pelos métodos add/remove, nunca substituída por outra lista
    private List<HourContract> contracts = new ArrayList<>(); 
    
    // Construtores
    public Worker() {
    }
    // Não incluímos a lista de contratos no construtor,
    // pois ela deve ser inicializada vazia e manipulada apenas pelos métodos add/remove.
    public Worker(String name, Double baseSalary, WorkerLevel level, Department department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
    }
    
    // Métodos
    // Adiciona um contrato à lista
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }
    // Remove um contrato da lista
    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }
    // Calcula a renda do trabalhador em determinado mês/ano:
    // salário base + valor dos contratos desse período
    public double income(int year, int month) {
        
        double sum = baseSalary;
        
        // Percorre todos os contratos do trabalhador
        for(HourContract c : contracts) {
            
            // Obtemos a data do contrato diretamente como LocalDate
            LocalDate contractDate = c.getDate();
            int c_year = contractDate.getYear();   // pega o ano da data
            int c_month = contractDate.getMonthValue(); // pega o mês da data (já começa em 1, não precisa +1)
            
            // Se o contrato pertence ao mês/ano informado, soma ao total
            if(year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
    
    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    /*
     * Nesse ponto, é preciso remover essa ação, porque não devemos permitir que
     * a lista de contratos seja trocada por outra. Apenas podemos adicionar e remover contratos.
     * Vou deixar comentado apenas por questão didática.
     * 
     * public void setDepartment(Department department) { 
     *     this.department = department; 
     * }
     */
    
    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }
    
}
