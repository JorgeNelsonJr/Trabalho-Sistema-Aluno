package br.com.controlealunos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nomeCompleto;

    @Column(nullable = false, unique = true, length = 20)
    private String matricula;

    @Column(length = 100)
    private String email;

    @Column(length = 100)
    private String curso;

    // Construtor padrão (exigido pelo JPA)
    public Aluno() {
    }

    // Construtor para facilitar a criação
    public Aluno(String nomeCompleto, String matricula, String email, String curso) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.email = email;
        this.curso = curso;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}