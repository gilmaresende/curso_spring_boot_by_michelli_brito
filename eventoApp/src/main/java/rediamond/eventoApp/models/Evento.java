package rediamond.eventoApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1l;

    public long getCodigo() {
        return codigo;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    private String nome;
    private String local;
    private String data;


    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String horario;

}