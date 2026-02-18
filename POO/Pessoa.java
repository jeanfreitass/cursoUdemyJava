package udemy.cursoUdemyJava.POO;

public class Pessoa {
    // 1 - Argumentos
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    // FUnção construtora 
    public Pessoa(){
        this.nome= "Sem nome";
        this.idade= 0;
        this.peso= 0.0;
        this.altura= 0.0;
    }

    // Função construtora com argumentos
    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome= nome;
        this.idade= idade;
        this.peso= peso;
        this.altura= altura;
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

    public String apresentar(){
        return 
         "A pessoa " + nome
         + " possui "+ idade +
         " anos, e está pesando "+ peso +" Kg";
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public String classificarIMC(){
        double imc = calcularIMC();
        if (imc <= 18.5) return "Abaixo do peso";
        if (imc <= 25) return "Peso normal";
        if (imc <= 30) return "Acima do peso";
        return "Obesidade";
    }
}

