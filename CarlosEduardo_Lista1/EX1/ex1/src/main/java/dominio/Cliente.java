package dominio;


import java.io.Serializable;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
public class Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
	private int idade;
    private int CodCliente;
		
	public Cliente() {
		this("",0 ,0);
	}

	public Vendedor(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public long getCodCliente() {
		return CodCliente;
	}

	public void setCodClinte(long CodCliente) {
		this.CodCliente = CodCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setCpf(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Cliente [CodCliente=" + CodCliente + ", nome=" + nome + ", Idade=" + idade + "]";
	}
}
