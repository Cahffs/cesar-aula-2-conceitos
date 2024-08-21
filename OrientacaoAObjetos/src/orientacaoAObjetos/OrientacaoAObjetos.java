package orientacaoAObjetos;

public class OrientacaoAObjetos {
	  /*

    Classe:
    representa uma estrutura de dados (um novo tipo de dados) formada por atributos (variáveis de classe) e por métodos (que são as funções que permitem
    manipular estes dados).
    */
   
   
    /*
    Objeto:
    O objeto é uma instância de uma classe.
    Ao instanciar um objeto é alocado memória para que os atributos possam ser manipulados.
    */
   
    // exemplo: Pessoa, outra classe dentro da mesma pasta.
   
   
    public static void main(String[] args) {
       
    /* Usando a classe, instânciando-a e atribuindo valor
        Para instanciar um objeto no Java usamos o "new" em conjunto com o método construtor.
        */
   
        Pessoa pessoa = new Pessoa ();
        pessoa.rg = "12.114.555";
        pessoa.nome = "Caio";
        pessoa.getDadosCompletos();
       
        /* Método Construtor:
        O método construtor é utilizado para instanciar e inicializar um objeto.
        No java, o método construtor não tem tipo de retorno e tem exatamente o mesmo nome da classe.
        Retorna implicitamente um objeto da classe.
        Caso a classe não tenha definido um método construtor, o Java considera a existência de um método sem parâmetros.
        */
       
       
        // Iniciando uma instância com parâmetro:
       
       
        PessoaComParametro pessoax;
        pessoax = new PessoaComParametro("Ricardo");
       
        System.out.println(pessoax.nome);
       
       
       
       
               
       
    }
   
}
