package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }

    @GetMapping("/todas")
    public String todasMissoes(){
        return "Todas as missões";
    }

    @GetMapping("/missaoId")
    public String missaoPorId(){
        return "Missão por Id";
    }

    @PutMapping("/atualizar")
    public String atualizarMissao(){
        return "Atualizado com sucesso";
    }

    @DeleteMapping("/deletarMissaoPorId")
    public String deletarMissaoPorId(){
        return "Deletada com sucesso";
    }
}
