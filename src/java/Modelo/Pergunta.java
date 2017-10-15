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
public class Pergunta {
    
    private long id;
    private String text_pergunta;
    private String audio_pergunta;
    private Nivel nivel_id;

    public Pergunta(long id, String text_pergunta, String audio_pergunta, Nivel nivel_id) {
        this.id = id;
        this.text_pergunta = text_pergunta;
        this.audio_pergunta = audio_pergunta;
        this.nivel_id = nivel_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText_pergunta() {
        return text_pergunta;
    }

    public void setText_pergunta(String text_pergunta) {
        this.text_pergunta = text_pergunta;
    }

    public String getAudio_pergunta() {
        return audio_pergunta;
    }

    public void setAudio_pergunta(String audio_pergunta) {
        this.audio_pergunta = audio_pergunta;
    }

    public Nivel getNivel_id() {
        return nivel_id;
    }

    public void setNivel_id(Nivel nivel_id) {
        this.nivel_id = nivel_id;
    }
    
    
}
