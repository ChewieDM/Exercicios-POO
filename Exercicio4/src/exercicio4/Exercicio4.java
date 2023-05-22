/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author Alunos
 */
public class Exercicio4 {

    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Joao");
        p1.setData(1989);
        p1.setAltura(159);
        int idade = p1.calcularidade();
        
        System.out.println("A idade é " + idade);
    }
}
