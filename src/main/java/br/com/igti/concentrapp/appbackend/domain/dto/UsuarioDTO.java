package br.com.igti.concentrapp.appbackend.domain.dto;

public class UsuarioDTO {
    private String idUsuario;
    private String nome;

    public UsuarioDTO(String idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
}
