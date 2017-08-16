/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.model;


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;

/**
 *
 * @author Avanxo
 */
@Entity
@Table(name = "Imovel")
public class Imovel implements Serializable {
    
    @Id
    @GeneratedValue
     @Column(name = "idImovel")
  private Integer  id;
  @DecimalMin("10000.00")   
  
  private BigDecimal  valorVenda;
  @DecimalMin("200.00")
  
  private BigDecimal  valorAluguel;
  @Column(length=2, nullable=false)
  private double area;

  @Column(nullable = false) 
@Enumerated(EnumType.STRING)
private Estado estado;	


  @Column(length=8, nullable=false)
  @Pattern(regexp="\\d{5}-\\d{3}")
	private String cep;
	
	@Column(length=50,nullable=false)
	private String logradouro;
	
	@Column(length=10,nullable=false)
	private String numero;
	
	@Column(length=30,nullable=true)
	private String bairro;
	
	@Column(length=30,nullable=true)
	private String complemento;
	
	@Column(length=20,nullable=false)
	private String cidade;
	
	@Column(length=2,nullable=false)
	private String uf;
        
  

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public BigDecimal getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(BigDecimal valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
  
}
