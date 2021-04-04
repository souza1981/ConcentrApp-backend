package br.com.igti.concentrapp.appbackend.domain.rewards;

import br.com.igti.concentrapp.appbackend.domain.focus.Focus;
import br.com.igti.concentrapp.appbackend.domain.user.Usuario;

import javax.persistence.*;

@Entity
public class ConcentraCoin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantidade;

    @OneToOne
    @JoinColumn(name = "id_focus")
    private Focus focus;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public ConcentraCoin(){

    }

    public ConcentraCoin(Long id, int quantidade, Focus focus, Usuario usuario) {
        this.id = id;
        this.quantidade = quantidade;
        this.focus = focus;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Focus getFocus() {
        return focus;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
