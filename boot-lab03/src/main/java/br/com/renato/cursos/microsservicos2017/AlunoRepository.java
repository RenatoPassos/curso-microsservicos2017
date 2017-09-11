package br.com.renato.cursos.microsservicos2017;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import lombok.val;


@Repository
public class AlunoRepository {
    private List<Aluno> alunos;

    @PostConstruct
    public void init() {
        alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno(1L, "Renato", 123, "renato@email.com"));
        alunos.add(new Aluno(2L, "Arthur", 456, "arthur@yahoo.com"));
        alunos.add(new Aluno(3L, "Soraia", 789, "soraia@microsoft.com"));
    }

    public List<Aluno> listar() {
        return alunos;
    }
    public Aluno encontrar(Long id) {
        return encontrarPeloId(id);
    }
    public Aluno encontrarPeloId(Long id) {
        for (val aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        };
        return new Aluno();
    }
}
