package br.com.estudos.lsp.utility;

public interface Pagamento {

	public void validarCartao() throws Exception;
	public void coletarPagamento();
}
