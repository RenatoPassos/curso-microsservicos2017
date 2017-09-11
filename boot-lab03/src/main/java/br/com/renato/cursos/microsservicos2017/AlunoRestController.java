package br.com.renato.cursos.microsservicos2017;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.val;

@RestController
@RequestMapping("/alunos")
public class AlunoRestController {
    @Autowired
    private AlunoRepository alunoRepo;
    
    @GetMapping
    public List<Aluno> listar() {
        return alunoRepo.listar(); 
    }    
    @GetMapping(path="/{id}")
    public Aluno encontrar(@PathVariable Long id) {
        return alunoRepo.encontrar(id);
    }
    //TODO: implementar de verdade.
    @PostMapping
    public Aluno criar(Aluno aluno) {
        return aluno;
    }
    //TODO: implementar de verdade.
    @PatchMapping
    public Aluno atualizar(Aluno aluno) {
        return aluno;
    }
    //TODO: implementar de verdade.
    @DeleteMapping Aluno excluir(Aluno aluno) {
        return new Aluno();
    }
}