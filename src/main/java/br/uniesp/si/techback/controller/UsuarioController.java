package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Usuario;
import br.uniesp.si.techback.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UsuarioController {
    private UsuarioService usuarioservice;
 import br.uniesp.si.techback.model.Usuario;
 import br.uniesp.si.techback.service.UsuarioService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;

    public Usuario criarUsuario(Usuario usuario) {
        return null;
    }
 import java.util.List;

    public List<Usuario> listarUsuarios() {
        return null;
    }
    @RestController
    @RequestMapping("/usuarios")
    public class UsuarioController {
        @Autowired
        private UsuarioService usuarioservice;

        public Usuario buscarUsuario(Long id) {
            return null;
            @PostMapping
            public Usuario incluir(Usuario Usuario) {
                return usuarioservice.cadastrar(Usuario);
            }
            @GetMapping
            public List<Usuario> listar() {
                return usuarioservice.listar();
            }

            public Usuario atualizarUsuario(Long id, Usuario Usuario) {
                return null;
                @PutMapping
                public Usuario alterar (Usuario Usuario) {
                    return usuarioservice.alterar(Usuario);
                }

                public void deletarUsuario(Long id) {
                    @DeleteMapping("/{id}")
                    public ResponseEntity delete(Integer id) {
                        usuarioservice.excluir(id);
                        return ResponseEntity.ok().build();

                    }
                }