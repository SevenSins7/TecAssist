/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Erick
 */
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class Resposta {
    @Id
    @GeneratedValue
    private int id;
    private int id_Aluno;
    private int data_hora;
    private String resposta;
    private String nivel;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Aluno")
    private Aluno aluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Aluno() {
        return id_Aluno;
    }

    public void setId_Aluno(int id_Aluno) {
        this.id_Aluno = id_Aluno;
    }

    public int getData_hora() {
        return data_hora;
    }

    public void setData_hora(int data_hora) {
        this.data_hora = data_hora;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String reposta) {
        this.resposta = reposta;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
