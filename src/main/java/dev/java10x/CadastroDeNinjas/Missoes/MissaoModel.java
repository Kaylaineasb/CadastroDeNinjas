package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;

    private String dificuldade;

    // Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;

    public MissaoModel() {
    }

    public MissaoModel(int id, String titulo, String dificuldade) {
        this.id = id;
        this.titulo = titulo;
        this.dificuldade = dificuldade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
