package br.com.igti.concentrapp.appbackend.service.api;

import br.com.igti.concentrapp.appbackend.domain.dto.ConcentraCoinDTO;
import br.com.igti.concentrapp.appbackend.domain.exception.DadosInvalidosException;

import java.util.List;

public interface IConcentracoinsService {
    List<ConcentraCoinDTO> getConcentraCoinsByUser(String idUsuario);

    ConcentraCoinDTO addNewConcentraCoin(ConcentraCoinDTO concentraCoinDTO) throws DadosInvalidosException;
}
