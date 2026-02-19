package udemy.cursoUdemyJava.lojaLambo;

public class carro {
    private String modelo;
    private int ano;
    private int cavalos;
    private String placa;
    private double valor;

    public carro(String modelo, int ano, int cavalos, String placa, double valor){
        this.modelo = modelo;
        this.ano = ano;
        this.cavalos = cavalos;
        this.placa = placa;
        this.valor = valor;
    }

    //get & set
    //modelo
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    //ano
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    //cavalos
    public  int getCavalos(){
        return cavalos;
    }
    public void setCavalos(int cavalos){
        this.cavalos = cavalos;
    }

    //placa
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    //valor
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        if (valor < 700000){
            System.out.println("O valor de R$:"+valor+" está muito abaixo da média! Revise o valor antes de alterar.");
        } else {
            this.valor = valor;
        }
    }


    // apresentar o carro
    public String apresentar(){
        return  "O " + modelo + " possui incríveis "+ cavalos + " cavalos de potência,"+
                " sendo um carro de "+ano+" está por um ótimo valor de R$:"+valor;
    }


}
