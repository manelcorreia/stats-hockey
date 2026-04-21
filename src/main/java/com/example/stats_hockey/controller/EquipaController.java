package com.example.stats_hockey.controller;

import com.example.stats_hockey.model.Equipa;
import com.example.stats_hockey.model.EquipaDuplicadaException;
import com.example.stats_hockey.model.NaoExisteEquipaException;
import com.example.stats_hockey.service.EquipaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // "diz" ao Spring que isto é uma API REST
@RequestMapping("/equipas")  // o endereço base no browser será localhost:8080/equipas
public class EquipaController {
    private final EquipaService equipaService;

    // injeta-se o service
    public EquipaController(EquipaService equipaService) {
        this.equipaService = equipaService;
    }

    // listar todas as equipas
    @GetMapping("/todas")
    public List<Equipa> listarEquipas() {
        return equipaService.listarTodas();
    }

    // adicionar nova equipa
    @PostMapping
    public void adicionarEquipa(@RequestBody Equipa e) throws EquipaDuplicadaException {
        // o @RequestBody pega no JSON que for "enviado" e transforma num objeto Equipa
        equipaService.adicionarEquipa(e);
    }

    // remover equipa
    @DeleteMapping("/{nome}-apagar")
    public void removerEquipa(@PathVariable String nome) throws NaoExisteEquipaException {
        equipaService.removerEquipa(nome);
    }

    // procurar pelo nome
    @GetMapping("/{nome}")
    public Equipa procurarEquipa(@PathVariable String nomeEquipa) {
        return equipaService.procurarEquipa(nomeEquipa);
    }
}
