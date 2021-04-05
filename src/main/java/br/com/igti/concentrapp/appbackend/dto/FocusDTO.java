package br.com.igti.concentrapp.appbackend.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class FocusDTO {
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "dd/MM/yyyy hh:mm:ss")
    private LocalDateTime dataHoraInicio;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "dd/MM/yyyy hh:mm:ss")
    private LocalDateTime dataHoraFim;

    private String idUsuario;

    public String getIdUsuario() {
        return idUsuario;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public FocusDTO(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String idUsuario) {
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.idUsuario = idUsuario;
    }
}
