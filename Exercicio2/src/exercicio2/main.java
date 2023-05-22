
package exercicio2;
import java.util.*;
public class main {

public static void main (String[] args){    
    
Scanner input = new Scanner(System.in);
double num1;
double num2;

Calculadora calc = new Calculadora();


System.out.println("Escolha uma opção:\n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5-Finalizar");
int opt = input.nextInt();

while (opt != 5){
    switch (opt){

        case 1:
            System.out.print("Digite o primeiro valor: ");
            num1 = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            num2 = input.nextDouble();
            System.out.print("O resultado é: " + calc.soma(num1, num2));
            System.out.println("\nEscolha uma opção:\n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5-Finalizar");
            opt = input.nextInt();
            break;
        
        case 2:
            System.out.print("Digite o primeiro valor: ");
            num1 = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            num2 = input.nextDouble();
            System.out.print("O resultado é: " + calc.subtracao(num1, num2));
            System.out.println("\nEscolha uma opção:\n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5-Finalizar");
            opt = input.nextInt();
            break;
        case 3:
            System.out.print("Digite o primeiro valor: ");
            num1 = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            num2 = input.nextDouble();
            System.out.print("O resultado é: " + calc.multiplicacao(num1, num2));
            System.out.println("\nEscolha uma opção:\n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5-Finalizar");
            opt = input.nextInt();
            break;
        case 4:
            System.out.print("Digite o primeiro valor: ");
            num1 = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            num2 = input.nextDouble();
            System.out.print("O resultado é: " + calc.divisao(num1, num2));
            System.out.println("\nEscolha uma opção:\n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5-Finalizar");
            opt = input.nextInt();
            break;
        default:
            System.out.println("\nVocê digitou um numero invalido, tente novamente!");
            System.out.println("\nEscolha uma opção:\n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5-Finalizar");
            opt = input.nextInt();
            break;
}
}
}
}
