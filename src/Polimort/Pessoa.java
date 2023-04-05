package Polimort;

public class Pessoa {
    public class Pessoa extends Funcionario{
        private String rg:
    
        public Pessoa(){}
        public Pessoa(String nome,String rg) {
            super(nome);
            this.rg = rg;
        }   
        public string getrg(){
            return rg;
        }
        public void setrg(String rg){
            this.rg = rg;
        }
    }
}
