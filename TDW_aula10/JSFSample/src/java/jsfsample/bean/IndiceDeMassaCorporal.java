/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfsample.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author 162150579
 */
@ManagedBean
@RequestScoped
public class IndiceDeMassaCorporal {
    private String nome;
    private String email;
    private Double peso;
    private Double altura;
    private String imc;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public String getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(String imc) {
        this.imc = imc;
    }

    public void calculaIMC() {
        Double altura = this.getAltura() * this.getAltura();
        
        Double imc = this.getPeso() / altura;
        
        this.setImc("Seu IMC é:  " + imc);
    }
}
