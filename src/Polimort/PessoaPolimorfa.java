package Polimort;

public class PessoaPolimorfa {
    public static void main(String[] args) {

        Pessoa p = null;

         int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção de 1 a 4"));

        switch(opcao) {
            case 1: p = new Pessoa();
            break;

            case 2: p = new PessoaFisica();
            break;

            case 3: p = new PessoaJuridica();
            break;

            case 4: p = new Funcionario();
            break;

            default: JOptionPane.showMessageDialog(null, "Tipo desconhecido");
            System.exit(0);
        }

        Pessoa pessoa = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        Funcionario func = new Funcionario();

        mostraClasse(func);
        
    }

    public static void mostraClasse(Pessoa p){
        System.out.println("Classe: " + p.getClass().getSimpleName());
    }
    
}
