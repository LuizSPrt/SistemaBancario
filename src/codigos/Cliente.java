package codigos;


public class Cliente {	
	private String nome,cpf,telefone, PIX,senha, agencia,conta,email,endereco ;
	private int datadia, datames, dataano;
	private double renda, saldo;
	private boolean serasa;

	public Cliente(String nome, String cpf, String telefone,String PIX,String senha,String agencia,String conta,String email,String endereco,int datadia,int datames, int dataano, double renda,boolean serasa,double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.PIX = PIX;
		this.senha = senha;
		this.agencia = agencia;
		this.conta = conta;
		this.endereco = endereco;
		this.datadia = datadia;
		this.datames = datames;
		this.dataano= dataano;
		this.email = email;
		this.renda = renda;
		this.serasa = serasa;
		this.saldo = saldo;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getPix() {
		return PIX;
	}
	
	public void setPix(String PIX) {
		this.PIX = PIX;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getConta() {
		return conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getDatadia() {
		return datadia;
	}
	
	public void setDatadia(int datadia) {
		this.datadia = datadia;
	}
	
	public int getDatames() {
		return datames;
	}
	
	public void setDatames(int datames) {
		this.datames = datames;
	}
	
	public int getDataano() {
		return dataano;
	}
	
	public void setDataano(int dataano) {
		this.dataano = dataano;
	}
	
	public double getRenda() {
		return renda;
	}
	
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	public boolean comprovar_endereco(String endereco) {
		
		boolean endcomp;
	
		if(this.endereco==endereco)
			endcomp= true;
		else
			endcomp = false;
		
		return endcomp;
	}
	
	public boolean verificar_serasa() {
		return serasa;
	}
	
	public void alterar_senha(String senha) {
		this.senha=senha;
	}
	
	public double calcular_teto (int anoatual,int mesatual) {
		double valorteto;
		int varmes;
		
		if(anoatual-this.dataano == 1 && this.renda <= 1200 ) {
			varmes=this.datames-mesatual;
			
				if (varmes > 0 && varmes< 12)
					valorteto=0;
					else if (varmes < 1 && varmes > -12)
						valorteto=600;
					else
						valorteto=0;
			
			}
		
		
			else if (anoatual-this.dataano == 1 && this.renda > 1200 ) {
				varmes=this.datames-mesatual;
				
					if (varmes > 0 && varmes< 12)
						valorteto=0;
						else if (varmes < 1 && varmes > -12)
							valorteto=800;
					else
						valorteto=0;
				
			}
		
		
			else if (anoatual-this.dataano == 2 && this.renda <= 1200 ) {
				varmes=this.datames-mesatual;
				
					if (varmes > 0 && varmes< 12)
						valorteto=600;
						else if (varmes < 1 && varmes > -12)
							valorteto=900;
					else
						valorteto=0;
			}
			
		
			else if (anoatual-this.dataano == 2 && this.renda > 1200  ) {
				varmes=this.datames-mesatual;
					
					if (varmes > 0 && varmes< 12)
						valorteto=800;
						else if (varmes < 1 && varmes > -12)
							valorteto=3500;
					else
						valorteto=0;
		
			}
		
			
			else if (anoatual-this.dataano == 3 && this.renda <= 1200 ) {
				varmes=this.datames-mesatual;
	
					if (varmes > 0 && varmes< 12)
						valorteto=900;
						else if (varmes < 1 && varmes > -12)
							valorteto=1200;
					else
						valorteto=0;	
			
			}
			
			else if (anoatual-this.dataano == 3 && this.renda > 1200 ) {
				varmes=this.datames-mesatual;
	
					if (varmes > 0 && varmes< 12)
						valorteto=3500;
						else if (varmes < 1 && varmes > -12)
							valorteto=7500;
					else
						valorteto=0;
			}
			
			else if (anoatual-this.dataano == 4 && this.renda <= 1200 ) {
				varmes=this.datames-mesatual;
				
					if (varmes > 0 && varmes< 12)
						valorteto=1200;
						else if (varmes < 1 && varmes > -12)
							valorteto=4800;
					else
						valorteto=0;
			}
			
			else if (anoatual-this.dataano == 4 && this.renda > 1200 ) {
				varmes=this.datames-mesatual;
				
					if (varmes > 0 && varmes< 12)
						valorteto=7500;
						else if (varmes < 1 && varmes > -12)
							valorteto=10000;
					else
						valorteto=0;
			}
			
			else if (anoatual-this.dataano == 5 && this.renda <= 1200 ) {
				varmes=this.datames-mesatual;
				
					if (varmes > 0 && varmes< 12)
						valorteto=4800;
						else if (varmes < 1 && varmes > -12)
							valorteto=9000;
					else
						valorteto=0;
			}
		
		else if (anoatual-this.dataano == 5 && this.renda > 1200 ) {
			varmes=this.datames-mesatual;
			
				if (varmes > 0 && varmes< 12)
					valorteto=10000;
					else if (varmes < 1 && varmes > -12)
						valorteto=15000;
				else
					valorteto=0;
			
		}
			
			else if (anoatual-this.dataano > 5 && this.renda <= 1200 ) {
				varmes=this.datames-mesatual;
				
					if (varmes > 0 && varmes< 12)
						valorteto=9000;
						else if (varmes < 1 && varmes > -12)
							valorteto=12500;
					else
						valorteto=0;
			}
			
			else if (anoatual-this.dataano > 5 && this.renda > 1200 ) {
				varmes=this.datames-mesatual;
				
					if (varmes > 0 && varmes< 12)
						valorteto=15000;
						else if (varmes < 1 && varmes > -12)
							valorteto=20000;
					else
						valorteto=0;
				
			}
			
		else 
			valorteto=0;
		
		return valorteto;
	}
	
	public boolean aprovar_emprestimo( double quantiadinheiro, int anoatual,int mesatual) {
		boolean aprovar;
		double valorteto;
		
		valorteto= calcular_teto(anoatual,mesatual);
		
		if(quantiadinheiro<=valorteto)
			aprovar= true;
		else
			aprovar = false;
		
		return aprovar;
	}
	
	public double sacar( double quantiasacar) {
		return this.saldo-quantiasacar;
	}
	
	public double depositar( double quantiadeposito) {
		return this.saldo+quantiadeposito;
	
	}
}