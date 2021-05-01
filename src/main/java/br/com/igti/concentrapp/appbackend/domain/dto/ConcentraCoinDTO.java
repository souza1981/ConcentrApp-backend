package br.com.igti.concentrapp.appbackend.domain.dto;

public class ConcentraCoinDTO {
    private String idUsuario;
    private int quantidadeConcentraCoins;
    private String idConcentraCoin;

    public String getIdUsuario() {
        return idUsuario;
    }

    public int getQuantidadeConcentraCoins() {
        return quantidadeConcentraCoins;
    }

    public ConcentraCoinDTO(String idUsuario, int quantidadeConcentraCoins) {
        this.idUsuario = idUsuario;
        this.quantidadeConcentraCoins = quantidadeConcentraCoins;
    }

    public String getIdConcentraCoin() {
        return idConcentraCoin;
    }
}
