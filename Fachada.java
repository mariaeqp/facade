
public class Fachada {
	private ClienteDoBanco cliente;
	private ContaBancaria conta;

	public Fachada() {
		this.cliente = new ClienteDoBanco();
		this.conta = new ContaBancaria();
	}

	public void fazerDeposito(int quantidade, ClienteDoBanco cliente, ContaBancaria conta){
		System.out.printf("Ola, o beneficiario de seu deposito eh o(a) cliente %s\n",cliente.obterNomeDoCliente());
		System.out.printf("Voce escolheu a conta %s\n", conta.obterNumConta());
		System.out.printf("O saldo desta conta e: %d\n", conta.obterSaldo());
		System.out.printf("Voce esta depositando R$ %s\n", quantidade);
		conta.setSaldo(conta.getSaldo() + quantidade);
		System.out.printf("Depositado R$ %d na conta de %s\n",quantidade, cliente.obterNomeDoCliente());
		System.out.printf("O saldo desta conta e de: R$ %s\n", conta.obterSaldo());
	}

	public ClienteDoBanco getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDoBanco cliente) {
		this.cliente = cliente;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
}
