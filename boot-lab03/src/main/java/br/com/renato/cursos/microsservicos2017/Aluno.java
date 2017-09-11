package br.com.renato.cursos.microsservicos2017;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    private Long id;
    private String nome;
    private Integer matricula;
    private String email;
}
