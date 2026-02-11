package udemy.cursoUdemyJava;

public class sintaxe {
    public static void main(String[] args) {
        // Explicação de variaveis = https://miro.medium.com/v2/resize:fit:720/format:webp/1*dIv1WM9_EvE1hGs01v4cag.jpeg
        // Tipos primitivos
        System.out.println("Variáveis primitivas");
        
        int idade = 99;
        double  altura = 1.70;
        boolean fuma = false;
        char letraApenas = 'm'; //aspas simples, apenas uma letra

        // Varias variaveis declaradas ao mesmo tempo
        int casa = 44, telefone = 99999, rua = 2;

        System.out.println("A idade é: " + idade);
        System.out.println("Altura de: " + altura + "m");
        System.out.println("A pessoa fuma? " + fuma);


        int a = 5, b = 4;
        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b)); // resultado arredondado

        //    5 / 4 = 1.25 -> resultado é double

        double c = 5, d = 4;
        System.out.println("C / D = " + (c / d));

        // Incremento
        int contador = 0;
        contador ++;
        System.out.println("Valor do contador = " + contador);

        //Decremento
        contador --;
        System.out.println("Valor do contador = " + contador);

        // operação composta
        // a = 5

        // a = a + 6    - ambos atribuem um novo valor ao A
        // a += 6
        // Agora a = 11
        
        System.out.println("Op Composta soma = " + (a += 6));
        System.out.println("Op Composta subtracao = " + (a -= 6));
        System.out.println("Op Composta multiplicacão = " + (a *= 2));
        System.out.println("Op Composta divisão = " + (a /= 6));
    }
}
