package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    //Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado com sucesso!";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Todos";
    }

    //Mostrar ninja por id (READ)
    @GetMapping("/todosId")
    public String mostrarNinjaPorId(){
        return "Ninja por id";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/atualizar")
    public String atualizarNinja(){
        return "Atualizado com sucesso!";
    }

    //Deletar ninja (DELETE)
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId(){
        return "Deletado com sucesso!";
    }
}
