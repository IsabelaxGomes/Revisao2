public class Animal {

   private String nome;
   private  int idade;
   private String cor;
   private  Especie especie;   ///////////////// Ligação/Associação entre duas classes recebe o tipo sendo  nome da  classe
   



    public void envelhecer (){
        
        //this.idade++;
        //idade++;
        //this.idade = idade + 1;
        
        this.idade = this.idade +1;

       
      

    }
    
    public void recolorir (String novaCor){
        this.cor = novaCor;
       
        this.idade = idade + 1;

       // this.envelhecer(); chama o método que aumenta a idade dele 
        

    }

    public void renomear (String novoNome){
        this.nome = novoNome;
        this.idade = 1;

    }

   ////////////////////////////public String get_nome (){
       //////////////////////////// return this.nome
   // /////////////////////////////}



    ///Construtor

    public   Animal (String nome , String cor, Especie especie){///////Especie está sendo ligada a classe especie, criando ligação entre as classes
        this.nome = nome; // A variavél (Atributo) vai pegar o nome passado no parametro
        this.cor = cor;
        this.idade = 1; // iniciando a idade com 1
        this.especie = especie;
        
        
    }
}
