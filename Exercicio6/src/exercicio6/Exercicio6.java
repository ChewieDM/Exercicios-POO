package exercicio6;

import java.util.*;

public class Exercicio6 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Televisao tele = new Televisao (0, 30, true);
    
    System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
    int opt = input.nextInt();

while (opt != 8){
    switch (opt){

        case 1:
            tele.aumentarVolume();
            System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
            opt = input.nextInt();
            break;
        
        case 2:
            tele.diminuirVolume();
            System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
            opt = input.nextInt();
            break;
        case 3:
            tele.trocaCanalCima();
            System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
            opt = input.nextInt();
            break;
        case 4:
            tele.trocaCanalBaixo();
            System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
            opt = input.nextInt();
            break;
        case 5:
            tele.setCanal();
            System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
            opt = input.nextInt();
            break;
        case 6:
            tele.powerBotao();
            System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
            opt = input.nextInt();
            break;
        case 7:
           tele.status();
           System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
           opt = input.nextInt();
           break;
        default:
            System.out.println("Controle remoto:\n1- Volume Cima\n2-Volume Baixo\n3-Canal Cima\n4-Canal Baixo\n5-Pular para canal: \n6-Ligar/Desligar\n7-Status\n\n8-Finalizar\n");
            opt = input.nextInt();
            break;
}
}  
}
}