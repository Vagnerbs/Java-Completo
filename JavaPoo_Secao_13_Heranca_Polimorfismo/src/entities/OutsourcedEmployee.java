package entities;

public class OutsourcedEmployee extends Employee {
    
    // Herança:
    // OutsourcedEmployee herda atributos e métodos da classe Employee,
    // mas adiciona comportamento específico (additionalCharge).
    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }
    
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        // Herança:
        // Chamamos o construtor da classe mãe (Employee) para reaproveitar código.
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    // Polimorfismo:
    // Sobrescrevemos o método payment() da classe Employee.
    // Agora, para terceirizados, o cálculo inclui o adicional.
    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
