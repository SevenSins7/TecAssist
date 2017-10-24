/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
/**
 *
 * @author Erick
 */
@Entity
public class Aluno {
    @Id
    @GeneratedValue
    int id;
    String nome;
    String turma;
    String professor;
    
    @Lob
    @Basic(fetch = FetchType.EAGER)
    private byte[] audio_nome;
    
    @Lob
    @Basic(fetch = FetchType.EAGER)
    private byte[] foto_aluno;

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public byte[] getAudio_nome() {
        return audio_nome;
    }

    public void setAudio_nome(byte[] audio_nome) {
        this.audio_nome = audio_nome;
    }

    public byte[] getFoto_aluno() {
        return foto_aluno;
    }

    public void setFoto_aluno(byte[] foto_aluno) {
        this.foto_aluno = foto_aluno;
    }

    @OneToMany(mappedBy = "aluno")
    List<Resposta> respostas;

    public List<Resposta> getResposta() {
        return respostas;
    }

    public void setMatriculas(List<Resposta> respostas) {
        this.respostas = respostas;
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
