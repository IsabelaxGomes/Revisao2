public enum Especie {

        GATO ("Gato", 3, "20Km" , "Ratos"),
        CACHORRO("Cachorro", 5, "1Km", "Ração"),
        TARTUGA ("Tartaruga", 2 , "0,5Km", "Alga"),
        ESQUILO ("Alvin", 1, "10km", "Noz");




    //Atributos

    private String nome;
    private int tamanho_maximo;
    private String velocidade_maxima;
    private String dieta;

  

//////////Contrutor private 



    private Especie(String nome, int tamanho_maximo, String vel_maxima, String dieta){
        //Inicando os atributos
        this.nome = nome;
        this.tamanho_maximo = tamanho_maximo;
        this.velocidade_maxima = vel_maxima;
        this.dieta = dieta;  
    }


   
    public String getNome(){
        return this.nome;

    }
    public int getTamanho_maximo(){
        return this.tamanho_maximo;
    }
    public String getVel_maxima(){
        return this.velocidade_maxima; 

    }
    public String getDieta (){
        return dieta;
    }
}
    

class Controller{//////////////

    public static void main(String[] args) {

        Especie animal_1;
        animal_1 = Especie.ESQUILO;
        System.out.println(animal_1.getNome());
        
    }
 }









