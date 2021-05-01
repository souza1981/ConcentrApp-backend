package br.com.igti.concentrapp.appbackend.aplicacao;

import br.com.igti.concentrapp.appbackend.domain.dto.UsuarioDTO;
import br.com.igti.concentrapp.appbackend.service.api.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@Api(value = "ConcentrApp API - User Controller",tags = "Usuário")
public class UserController {

    @Autowired
    private IUserService userService;
    
    @GetMapping("v1/usuarios")
    @ApiOperation(value = "Exibe a lista de usuários")
    public List<UsuarioDTO> getListUsuarios(){
        return new ArrayList<>();
    }

    @GetMapping("v1/usuarios/{idUsuario}")
    @ApiOperation(value = "Busca usuário pelo id")
    public Optional<UsuarioDTO> getUsuarioById(@RequestParam String idUsuario){
        Optional<UsuarioDTO> usuario = null;

        return usuario;
    }

    @PostMapping("v1/usuarios")
    @ApiOperation(value = "Cadastrar um novo usuário")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> postCreateUser(@RequestBody UsuarioDTO usuarioDTO){
        return null;
    }

    @PutMapping("v1/usuarios")
    @ApiOperation(value = "Alterar um usuário")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> putUpdateUser(@RequestBody UsuarioDTO usuarioDTO){
        return null;
    }

    @DeleteMapping("v1/usuarios/{idUsuario}")
    @ApiOperation(value = "Deletar um usuário")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteRemoverUser(@RequestParam String idUsuario){
        try {
            return new ResponseEntity<>(idUsuario,HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
