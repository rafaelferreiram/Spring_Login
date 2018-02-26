package br.com.resource.exception;

public abstract class Excecao extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String getErro(Exception e){

		String erro = e.getClass().getName();
		if(erro.equals("IllegalArgumentException")){
			return "Valores inapropriados para o parametro";
		}else if(erro.equals("NullPointerException")){
			return "Objeto nao instanciado";
		}else if(erro.equals("NumberFormatException")){
			return "Valores n�o podem ser convertidos para n�mero";
		}else if(erro.equals("SecurityException")){
			return "Viola��o de seguran�a";
		}else if(erro.equals("AssertionError")){
			return "Erro de retorno na fun��o";
		}else if(erro.equals("ExceptionInitializerError")){
			return "Erro de instancia / inicializa��o";
		}else if(erro.equals("NoClassDefFoundError")){
			return "Erro de iniacializa��o no java";
		}else if(erro.equals("StackOverflowError")){
			return "Erro de looping em m�todo";
		}else{
			return e.getClass().getName();
		}

	}
}
