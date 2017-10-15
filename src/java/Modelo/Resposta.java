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
public class Resposta {
  
    private long id;
    private Pergunta pergunta_id;
    private String audio_resposta;
    private int fl_resposta;

    public Resposta(long id, Pergunta pergunta_id, String audio_resposta, int fl_resposta) {
        this.id = id;
        this.pergunta_id = pergunta_id;
        this.audio_resposta = audio_resposta;
        this.fl_resposta = fl_resposta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pergunta getPergunta_id() {
        return pergunta_id;
    }

    public void setPergunta_id(Pergunta pergunta_id) {
        this.pergunta_id = pergunta_id;
    }

    public String getAudio_resposta() {
        return audio_resposta;
    }

    public void setAudio_resposta(String audio_resposta) {
        this.audio_resposta = audio_resposta;
    }

    public int getFl_resposta() {
        return fl_resposta;
    }

    public void setFl_resposta(int fl_resposta) {
        this.fl_resposta = fl_resposta;
    }
    
    
}
