package br.com.igti.concentrapp.appbackend.aplicacao;

import br.com.igti.concentrapp.appbackend.domain.dto.ConcentraCoinDTO;
import br.com.igti.concentrapp.appbackend.domain.exception.DadosInvalidosException;
import br.com.igti.concentrapp.appbackend.service.api.IConcentracoinsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "ConcentrApp API - ConcentraCoins Controller", tags = "ConcentraCoins")
public class ConcentraCoinsController {

    @Autowired
    private IConcentracoinsService concentracoinsService;

    @ApiOperation(value = "Consulta os ConcentraCoins por cliente")
    @GetMapping("v1/concentracoins/{idUsuario}")
    public ResponseEntity<List<ConcentraCoinDTO>> getConcentracoins(@PathVariable String idUsuario) {
        try {
            List<ConcentraCoinDTO> listaConcentraCoins = concentracoinsService.getConcentraCoinsByUser(idUsuario);
            if (listaConcentraCoins.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(listaConcentraCoins, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Insere novos Concentracoins na carteira do cliente")
    @PostMapping("v1/concentracoins")
    public ResponseEntity<String> postConcentracoins(@RequestBody ConcentraCoinDTO concentraCoinDTO) {
        try {
            ConcentraCoinDTO novoConcentraCoin =  concentracoinsService.addNewConcentraCoin(concentraCoinDTO);
            return new ResponseEntity<>(novoConcentraCoin.getIdConcentraCoin(),HttpStatus.CREATED);
        } catch (DadosInvalidosException dadosInvalidosException) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Consumir Concentracoins")
    @DeleteMapping("v1/concentracoins")
    public ResponseEntity<Object> deleteConcentracoins(@RequestBody ConcentraCoinDTO concentraCoinDTO) {
        return null;
    }
}
