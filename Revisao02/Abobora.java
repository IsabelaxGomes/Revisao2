public class Abobora extends Vegetal{



    private boolean comprida; 


                @Override//sobrescrita
                    public void pegarSol(){
                      if(this.cor.equalsIgnoreCase("Rosa")){
                       this.tamanho = tamanho+ 0.1f;

                      }else if (this.cor.equals("Amarela")){
                          this.tamanho = tamanho+ 0.1f;

                     } else if(this.cor.equals("Verde")){
                            this.tamanho = tamanho+ 0.5f; }

                        

}



    public boolean get_comrpida(){
        return comprida;
    }

    public Abobora (boolean comprida, String cor){
        
        super(cor); // chama o contrutor da classe Pai, pq a cor está na classe Vegetal que é o pai 

        this.comprida = comprida;

        
        
    }

    
}
