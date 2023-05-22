package exercicio6;

import java.util.Scanner;

public class Televisao {
    Scanner input = new Scanner(System.in);

    public Televisao(int canal, int volume, boolean power) {
        this.canal = canal;
        this.volume = volume;
        this.power = power;
    }
    
  
    
    public void trocaCanalCima(){
    if (canal >= 0)
        canal++;
    }
    
    public void trocaCanalBaixo(){
    if (canal >= 0)
        canal++;
    }
    
    public void setCanal(){
        System.out.println("Insira o canal: ");
        canal = input.nextInt();
        System.out.println("\nSeu canal é: " + canal);
    }
    
    public void aumentarVolume(){
    if (volume >+ 0)
        volume++;
    }
    
    public void diminuirVolume(){
    if (volume > 0)
        volume--;
    }
    
    public void powerBotao () {
        power = power ? false : true;
    }
    
    public void status () {
        if (power){
        System.out.println("A televisão está ligada\nSe encontra no canal " + canal + " e seu atual volume é " + volume);    
        }else {
        System.out.println("\nA Televisão está desligada");
    }
    }
    int canal;
    int volume;
    boolean power;
}