
public class AplicacaoCliente {

	public static void main(String[] args) {
		ClienteDoBanco cliente = new ClienteDoBanco("Madu");
		ContaBancaria conta = new ContaBancaria("4228-7");

		Fachada facade = new Fachada();
		facade.fazerDeposito(710, cliente, conta);
	}
}
