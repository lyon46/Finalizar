package Polimort;

import org.w3c.dom.css.RGBColor;

public class PessoaFisica extends Pessoa{
    private String rg:

    public PessoaFisica(){}
    public PessoaFisica(String nome,String rg) {
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
