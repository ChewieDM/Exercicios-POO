/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;


public class Data {

    public Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    public void displayData(){
        System.out.println("A data é " + dia + "/" + mes + "/" + ano);
       
    }
    
    String dia;
    String mes;
    String ano;
}
