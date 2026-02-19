package udemy.cursoUdemyJava.lojaLambo;

public class loja {
    public static void main(String[] args){
        carro carro1 = new carro("Urus", 2026, 800, "PLA-8090",1500000);
        System.out.println(carro1.getModelo());
        System.out.println(carro1.apresentar());
        carro1.setValor(1300000);
        System.out.println(carro1.apresentar());

        carro carro2 = new carro("Aventador SVJ", 2025, 780,"PBP-5432",3600000);
        System.out.println(carro2.apresentar());
        carro2.setValor(500);
        
    }
}