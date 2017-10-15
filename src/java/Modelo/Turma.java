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
public class Turma {
   
    private long id;
    private String turma;
    private String obs_turma;

    public Turma(long id, String turma, String obs_turma) {
        this.id = id;
        this.turma = turma;
        this.obs_turma = obs_turma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getObs_turma() {
        return obs_turma;
    }

    public void setObs_turma(String obs_turma) {
        this.obs_turma = obs_turma;
    }
    
    
}
