package entities;

import java.time.LocalDate;

public class HourContract {
    
    // Atributos principais do contrato
    // Usamos LocalDate (API moderna de datas) em vez de Date (API antiga)
    private LocalDate date; 
    private Double valuePerHour; // valor pago por hora
    private Integer hours;       // quantidade de horas trabalhadas
    
    // Construtor padrão (sem parâmetros)
    public HourContract() {
    }

    // Construtor com parâmetros
    // Recebe a data, o valor por hora e a quantidade de horas
    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    
    // Método para calcular o valor total do contrato
    // Fórmula: valor por hora * quantidade de horas
    public double totalValue() {
        return valuePerHour * hours;
    }

    // Getters e Setters
    // Permitem acessar e modificar os atributos de forma controlada
    
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
