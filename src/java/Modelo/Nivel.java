/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author anderson
 */
public class Nivel {
    
    private long id;
    private String nivel_nome;

    public Nivel(long id, String nivel_nome) {
        this.id = id;
        this.nivel_nome = nivel_nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNivel_nome() {
        return nivel_nome;
    }

    public void setNivel_nome(String nivel_nome) {
        this.nivel_nome = nivel_nome;
    }
    
    
}
