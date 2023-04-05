package Polimort;

import javax.print.CancelablePrintJob;

public class PessoaJuridica {
    public class PessoaFisica extends Pessoa{
        private String rg:
    
        public PessoaJuridica(){}
        public PessoaJuridica(String nome,String cnpj) {
            super(nome);
            this.cnpj = cnpj;
        }   
        public string getrg(){
            return cnpj;
        }
        public void setrg(String rg){
            this.cnpj = cnpj;
        }
    }
    
}
