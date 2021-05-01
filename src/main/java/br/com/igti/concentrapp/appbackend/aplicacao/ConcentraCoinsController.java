package br.com.igti.concentrapp.appbackend.aplicacao;

import br.com.igti.concentrapp.appbackend.domain.dto.ConcentraCoinDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "ConcentrApp API - ConcentraCoins Controller", tags = "ConcentraCoins")
public class ConcentraCoinsController {

    @ApiOperation(value = "Consulta os ConcentraCoins por cliente")
    @GetMapping("v1/concentracoins/{idUsuario}")
    public List<ConcentraCoinDTO> getConcentracoins(@PathVariable String idUsuario){
        return null;
    }

    @ApiOperation(value = "Insere novos Concentracoins na carteira do cliente")
    @PostMapping("v1/concentracoins")
    public ResponseEntity<Object> postConcentracoins(@RequestBody ConcentraCoinDTO concentraCoinDTO){
        return null;
    }

    @ApiOperation(value = "Consumir Concentracoins")
    @DeleteMapping("v1/concentracoins")
    public ResponseEntity<Object> deleteConcentracoins(@RequestBody ConcentraCoinDTO concentraCoinDTO){
        return null;
    }
}
