package rediamond.eventoApp.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    public long getCodigo() {
        return codigo;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    private String nome;
    private String local;
    private String data;
    private String hora;

    @OneToMany
    private List<Convidado> convidados;

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(List<Convidado> convidados) {
        this.convidados = convidados;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}