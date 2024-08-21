package orientacaoAObjetos;

public class PessoaComParametro {
    public String nome;
    public String rg;
    public PessoaComParametro (String nome) {
        this.nome = nome;
    }
   
public String getDadosCompletos () {
return nome + "-" + rg;
}
}
