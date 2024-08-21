package orientacaoAObjetos;

public class Pessoa {
	/*
	Exemplo:
	 */

	//criação de classe
	   
	    //atributos da classe: variáveis que dão suas características
	    public String nome;
	    public String rg;
	    public String rua;
	    public int numero;
	   
	   
	    //métodos: as funções que a classe pode exercer
	    public String getDadosCompletos (){
	      return nome + "-" + rg;
	    }  
	   
	    public String getDados (String complemento) {
	        return rua + "-" + numero + "-" + complemento;
	   
	   
	    }

	}


