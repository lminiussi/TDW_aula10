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
 * @author DB1007634
 */
@ManagedBean
@RequestScoped
public class AutomovelBean {

    private String modelo;
    private String resultado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    /**
     * Creates a new instance of AutomovelBean
     */
    public AutomovelBean() {
    }
    
    public void grava() {
        this.setResultado("Modelo selecionado é: " + getModelo());
    }
}
