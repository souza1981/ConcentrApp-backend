package br.com.igti.concentrapp.appbackend.controller;

import br.com.igti.concentrapp.appbackend.dto.FocusDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "ConcentrApp API - Focus Controller",tags = "Focus")
public class FocusController {

    @GetMapping("v1/focus/{idUsuario}")
    @ApiOperation(value = "Lista de concentrações por usuário")
    public List<FocusDTO> getFocusPorUsuario(@PathVariable String idUsuario){
        return null;
    }

    @PostMapping("v1/focus")
    @ApiOperation(value = "Registra novas concentrações do usuário")
    public ResponseEntity<Object> postFocus(@RequestBody FocusDTO focusDTO){
        return null;
    }
}
