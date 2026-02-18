package udemy.cursoUdemyJava.POO;

public class progamaPrincipal {
    public static void main(String[] args) {
        
        // Instanciar a pessoa (new)
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao");
        pessoa1.setIdade(33);
        pessoa1.setPeso(88.34);
        pessoa1.setAltura(1.7);

        System.out.println("A pessoa " + pessoa1.getNome()
         + " possui "+ pessoa1.getIdade()+
         " anos, e está pesando "+ pessoa1.getPeso()+" Kg");

        Pessoa pessoa2 = new Pessoa("Pedro", 48, 92.5, 1.90);
        System.out.println(pessoa2.apresentar());
        System.out.println(pessoa2.calcularIMC());
        System.out.println(pessoa2.classificarIMC());
    }
}
