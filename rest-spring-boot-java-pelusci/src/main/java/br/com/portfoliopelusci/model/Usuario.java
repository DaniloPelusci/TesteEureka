package br.com.portfoliopelusci.model;


import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@ManyToOne
	@JoinColumn(name = "idcargo")
	private Cargo cargo;
	
	@OneToMany(orphanRemoval = false, mappedBy = "analista", fetch = FetchType.LAZY)
	private List<Roteiro> roteiros;
	
	@OneToMany(orphanRemoval = false, mappedBy = "aprovador", fetch = FetchType.LAZY)
	private List<RoteiroAprovadores> RoteirosAprovadores;
	
	public Usuario() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Roteiro> getRoteiros() {
		return roteiros;
	}

	public void setRoteiros(List<Roteiro> roteiros) {
		this.roteiros = roteiros;
	}

	public List<RoteiroAprovadores> getRoteirosAprovadores() {
		return RoteirosAprovadores;
	}

	public void setRoteirosAprovadores(List<RoteiroAprovadores> roteirosAprovadores) {
		RoteirosAprovadores = roteirosAprovadores;
	}

	public Usuario(Long id, String nome, String email, String senha, Cargo cargo, List<Roteiro> roteiros,
			List<RoteiroAprovadores> roteirosAprovadores) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cargo = cargo;
		this.roteiros = roteiros;
		RoteirosAprovadores = roteirosAprovadores;
	}

	
	


}