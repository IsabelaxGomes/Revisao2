 class Vegetal {
    protected String cor;
    protected float tamanho;


    public void pegarSol(){
        if(this.cor.equalsIgnoreCase("Vermelha")){
            this.tamanho = tamanho+ 0.1f;
        }else if (this.cor.equals("Amarela")){
            this.tamanho = tamanho+ 0.1f;

        } else if(this.cor.equals("Verde")){
            this.tamanho = tamanho+ 0.5f;

        }


    }



    public void alterarEstacao(String x){

        switch(x){

            case "Inverno" : this.cor = "Amarela";
            break;


            case "Verão": this.cor= "Verde";
            break;

            case "Outono": this.cor = "Vermelho";
            break;

            case "Primavera": this.cor = "Verde";
            break;


        }

    }
    
    public String get_cor(){

        return this.cor;

    }

    public float get_tamanho(){

        return this.tamanho;

    }

    public Vegetal (String cor){

        this.cor = cor;
        this.tamanho = 1; 


    }
}
