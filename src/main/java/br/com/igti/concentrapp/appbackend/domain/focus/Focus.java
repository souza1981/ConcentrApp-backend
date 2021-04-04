package br.com.igti.concentrapp.appbackend.domain.focus;

import br.com.igti.concentrapp.appbackend.domain.user.Usuario;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Focus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHoraInicio;

    private LocalDateTime dataHoraFim;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    protected Focus(){

    }

    public Focus(Long id, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, Usuario usuario) {
        this.id = id;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }
}
