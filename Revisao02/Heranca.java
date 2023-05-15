class Funcionario {
  protected  String nome; //
  protected float salario;



  public void set_nome(String nome){
    this.nome = nome;
  }
  public String get_nome(){
    return this.nome;
  }

  public void salario( float salario){
    this.salario = salario;
  }

  public float get_salario(){
    return this.salario;
  }
  



  public Funcionario (String nome, float salario){
    this.nome= nome;
    this.salario = salario;
  }
}


class Efetivo extends Funcionario{

   String cargo;

   public Efetivo(String cargo, String nome, Float salario){

    super(nome,salario); // chama o construtor da classe PAi

    
   }
    
}




class Controller {
    public static void main(String[] args) {
        Efetivo func_1 = new Efetivo("Gerente","Alex", 100.0f); // criei um funcionario efetivo
        System.out.println(func_1.cargo);
        System.out.println(func_1.nome);

    }
}




///// Sobrescrita