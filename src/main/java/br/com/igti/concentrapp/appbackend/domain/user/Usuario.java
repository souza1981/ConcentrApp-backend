package br.com.igti.concentrapp.appbackend.domain.user;

import br.com.igti.concentrapp.appbackend.domain.focus.Focus;
import br.com.igti.concentrapp.appbackend.domain.rewards.ConcentraCoin;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ConcentraCoin> listaConcentracoins = new ArrayList<>();

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Focus> listaFocus = new ArrayList<>();

    public Usuario(){

    }

    public Usuario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<ConcentraCoin> getListaConcentracoins() {
        return new ArrayList<>(listaConcentracoins);
    }

    public List<Focus> getListaFocus() {
        return new ArrayList<>(listaFocus);
    }

    public void setListaConcentracoins(List<ConcentraCoin> listaConcentracoins) {
        this.listaConcentracoins = listaConcentracoins;
    }

    public void setListaFocus(List<Focus> listaFocus) {
        this.listaFocus = listaFocus;
    }
}
