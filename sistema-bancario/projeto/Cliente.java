public class Cliente {

	private String cpf;
	private String nome;
	private String [] telefone;
	private String [] email;

	private ContaBancaria [] contas;

	public Cliente(String cpf, String nome, String telefone, String email) {
		this.contas	= new ContaBancaria[2];
		this.email = new String[2];
		this.telefone = new String[2];

		this.cpf = cpf;
		this.nome = nome;
		this.telefone[0] = telefone;
		this.email[0] = email;
	}


	public void addConta(ContaBancaria novaConta){
		int contasLength = this.contas.length;

		//VERIFICAR SE HA ESPACO VAZIO NO ARRAY CONTA
		for(int i = 0; i < contasLength; i++) {
			if(this.contas[i] == null) {
				this.contas[i] = novaConta;
				return;
			}
		}

		//AUMENTAR O TAMANHO DO ARRAY E ADICIONA O NOVO CLIENTE
		ContaBancaria [] novoArrayConta = new ContaBancaria[ contasLength * 10 ];
		for(int i = 0; i < contasLength; i++) {
			novoArrayConta[i] = this.contas[i];
		}
		novoArrayConta[ contasLength ] = novaConta;
		this.contas = novoArrayConta;
	}

	public ContaBancaria [] getContas() {
		return this.contas;
	}

	public ContaBancaria buscarConta(int numero) {
		for(int i = 0; i < this.contas.length; i++) {
			if(this.contas[i].numero() == numero) {
				return this.contas[i];
			}
		}
		return null;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

