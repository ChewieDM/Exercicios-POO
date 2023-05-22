package exercicio5;

public class Elevador {

    public Elevador(int capacidade, int andares, int pessoas, int andar) {
        this.capacidade = capacidade;
        this.andares = andares;
        this.pessoas = pessoas;
        this.andar = andar;
    }
    
    

    public Elevador() {
    }
    
    public void inicializa() {
        this.andares = andares;
        this.capacidade = capacidade;
        System.out.println(andares);
        System.out.println(capacidade);
    }
    
    public void entra (){
        if (pessoas < capacidade){
        pessoas++;
        }   
    }
    
        
    public void sai (){
        if (pessoas > 0){
        pessoas--;
        }
    }
    
    public void sobe (){
    if (andar <= andares)
    andar++;
    }
    
    public void desce (){
    if (andar > 0)
    andar--;
    }
    
    public void status (){
        System.out.print("O elevador tem a capacidade de: " + capacidade);
        System.out.print("\nO numero de andares é: " + andares);
        System.out.print("\nHá no momento " + pessoas + " pessoas no elevador");
        System.out.print("\nO elevador se encontra no andar " + andar);
    }
    
    int capacidade;
    int andares;
    int pessoas;
    int andar;
}
