package udemy.cursoUdemyJava.POO;

public class Pessoa {
    // 1 - Argumentos
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(){
        this.nome= "Sem nome";
        this.idade= 0;
        this.peso= 0.0;
        this.altura= 0.0;
    }


    // 2 - Métodos
    // Setters and Getters


    //nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    //idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    // peso
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    //altura
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
}

