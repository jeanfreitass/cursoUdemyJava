package udemy.cursoUdemyJava.calculator;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //exibir opçoes ao usuario
        int opcao;
        do {
            System.out.println("Calculadora Java");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            System.out.println("Opção escolhida: "+ opcao);

            if (opcao >=1 && opcao <=4){
                //capta valores
                System.out.println("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.println("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;
                System.out.println("Numeros escolhidos: "+num1+" e "+num2);

                // Switch para add e sub
                switch (opcao){
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if (num2 == 0){
                            System.out.println("Não é possível dividir por 0!");
                            operacaoValida = false;
                        }
                        else {
                            resultado = num1 / num2;
                        }
                        break;
                    default:
                        operacaoValida= false;
                        break;
                }
                if (operacaoValida) {
                    System.out.println("O resultado é: " + resultado);
                }

            } else if (opcao < 0 || opcao > 4) {
                System.out.println("Opção inválida!");
            }

        }while(opcao !=0);
        System.out.println("Calculadora encerrada!");
        scanner.close();
    }
}
