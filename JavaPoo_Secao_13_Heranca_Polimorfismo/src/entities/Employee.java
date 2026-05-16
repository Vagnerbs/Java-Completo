package entities;

public class Employee {

    // Encapsulamento:
    // Os atributos são privados, protegendo os dados contra acesso direto.
    private String name;
    private Integer hours;
    private Double valuePerHour;
    
    // Abstração:
    // A classe Employee representa um funcionário de forma genérica,
    // destacando apenas características essenciais (nome, horas e valor por hora).
    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    // Encapsulamento:
    // Getters e setters permitem acessar e modificar os atributos de forma controlada.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    
    // Abstração:
    // O método payment() define o comportamento essencial de um funcionário:
    // calcular o pagamento com base em horas e valor por hora.
    public double payment() {
        return hours * valuePerHour;
    }
}
