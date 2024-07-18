
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
    protected boolean contabloqueada;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
        if (contabloqueada){
            System.out.println("Saque não permitido pois a conta está bloqueada.");
            return;
        }
        if (saldo < valor){
            System.out.println("Saque não permitido pois não há saldo suficiente.");
            return;
        }
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
        if (contabloqueada){
            System.out.println("Depósito não permitido pois a conta está bloqueada.");
            return;
        }
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
        if (contabloqueada){
            System.out.println("Transferência não permitida pois a conta está bloqueada.");
            return;
        }
        if(saldo<valor){
            return;
        }
        this.sacar(valor);
		contaDestino.depositar(valor);
	}

        @Override
    public void bloquearConta(){
        contabloqueada = true;
        System.out.println("Conta bloqueada.");
    }

        @Override
    public void desbloquearConta(){
        contabloqueada = false;
        System.out.println("Conta bloqueada.");
    }

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
		System.out.println(String.format("Email: %s", this.cliente.getEmail()));
		System.out.println(String.format("Telefone: %s", this.cliente.getTel()));
		System.out.println(String.format("Gênero: %s", this.cliente.getGenero()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}