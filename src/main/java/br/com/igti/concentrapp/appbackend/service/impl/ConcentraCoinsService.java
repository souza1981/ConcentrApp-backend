package br.com.igti.concentrapp.appbackend.service.impl;

import br.com.igti.concentrapp.appbackend.domain.dto.ConcentraCoinDTO;
import br.com.igti.concentrapp.appbackend.service.api.IConcentracoinsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcentraCoinsService implements IConcentracoinsService {
    @Override
    public List<ConcentraCoinDTO> getConcentraCoinsByUser(String idUsuario) {
        return null;
    }

    @Override
    public ConcentraCoinDTO addNewConcentraCoin(ConcentraCoinDTO concentraCoinDTO) {
        return null;
    }
}
