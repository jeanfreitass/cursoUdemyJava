package udemy.cursoUdemyJava;

public class exemplosControle {
    public static void main(String[] args) {
        
        // 1 -Condicionais
        double nota = 10;

        // if
        if (nota < 5){
            System.out.println("Reprovado");
        }
        
        //if and else
        if (nota < 5) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }


        // else if
        if (nota < 5) {
            System.out.println("Reprovado");
        } else if (nota == 10){
            System.out.println("Aprovado com nota máxima!");
        } else {
            System.out.println("Aprovado");
        }

        
        boolean o = true;
        if (o) {
            System.out.println("a variavel existe");
        }


        // 2 - Operadores lógicos
        // &&   ||    !
        boolean temDinheiro = true;
        boolean temTempo = true;

        if (temTempo && temDinheiro) {
            System.out.println("Pode viajar");
        } else {
            System.out.println("Não pode viajar");                    
        }



        // 3 - Loops
        int contador = 1;

        while (contador >= 8) {
            System.out.println("Contador é menor que 1");
        }

        for (contador = 1; contador <= 5; contador++){
            System.out.println("Valor do contador: " + contador);
        }


        //exemplos

        // Pecorre e imprime cada numero
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i : numeros){
            System.out.println(i);
        }

        // Somar os numeros pares e impares
        int somaDosPares = 0;
        int somaDosImpares = 0;

        for(int i : numeros){
            if (i % 2 == 0) {
                somaDosPares += i;
            } else {
                somaDosImpares += i;
            }
        }

        System.out.println("Soma dos pares: " + somaDosPares);
        System.out.println("Soma dos Impares: " + somaDosImpares);

        // Break de loops
        for(int i = 1; i <= 200; i++){
            if (i < 5) {
                System.out.println(i);
                continue; // pula pra proximo loop
            } else {
                break;
            }
        }
    }
}
