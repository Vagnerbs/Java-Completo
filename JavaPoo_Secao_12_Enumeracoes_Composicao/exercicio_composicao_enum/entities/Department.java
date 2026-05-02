package entities;

public class Department {
    
    // Atributo principal do departamento
    // Representa o nome do departamento (ex.: "Vendas", "TI", "Recursos Humanos")
    private String name;

    // Construtor padrão (sem parâmetros)
    // Permite criar um objeto Department sem inicializar o nome
    public Department() {
    }

    // Construtor com parâmetro
    // Permite criar um objeto Department já informando o nome
    public Department(String name) {
        this.name = name;
    }

    // Getter
    // Retorna o nome do departamento
    public String getName() {
        return name;
    }

    // Setter
    // Permite alterar o nome do departamento
    public void setName(String name) {
        this.name = name;
    }
}
