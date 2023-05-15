import java.util.ArrayList;

public class AreaDeProtecao {

    private String nome;
    private  int tamanho;
    private ArrayList <String> estado; // =  new ArrayList<String>(null);
    private ArrayList <Animal> animais; // Agragação (lozangolo)///////////////////



    public void adicionar_estado (String nome ){
       
        estado.add(nome);



    }

    public void listar_estados(){
        for( int  i = 0;  i < estado.size(); i++){
            System.out.println(estado.get(i)); // Para pegar os estados

        }
        
        

    }

    public void aumentar (int area_adicional){
        this.tamanho = this.tamanho + area_adicional;


    }

    public void reduzir(int area_reduiza){
        this.tamanho = this.tamanho - area_reduiza;

    }

    public void mostar_area(){
        System.out.println(this.tamanho );  

    }

    public void mostar_animais(){
        for( int  i = 0;  i < animais.size(); i++){
           /////////////////////////////// //Animal animal_1 = animais.get(i);
          ///////////////////////////////////  System.out.println(animal_1.get_nome()); // Para pegar no animais o nome do animal, criado em animal o GET

            System.out.println(animais.get(i)); // Para pegar os animais 
            
          

        }

        


    }

    public AreaDeProtecao (String nome, int tamanho, ArrayList estado ){
    this.nome = nome;
    this.tamanho = tamanho;
     


    }


    
}
