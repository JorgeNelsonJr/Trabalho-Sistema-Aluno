package br.com.controlealunos.controller;

import br.com.controlealunos.model.Aluno;
import br.com.controlealunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional; // Importe esta classe

import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    // Rota: http://localhost:8080/alunos
    @GetMapping
    public String listarAlunos(Model model) {
        List<Aluno> alunos = alunoRepository.findAll();
        model.addAttribute("listaAlunos", alunos);
        return "index"; // /resources/templates/index.html
    }


    @GetMapping("/novo")
    public String exibirFormularioCadastro(Model model) {
        Aluno aluno = new Aluno();
        model.addAttribute("aluno", aluno);
        return "form-aluno"; // /resources/templates/form-aluno.html
    }


    @PostMapping("/salvar")
    public String salvarAluno(@ModelAttribute("aluno") Aluno aluno) {
      alunoRepository.save(aluno);
        return "redirect:/alunos";
    }
    @GetMapping("/editar/{id}")
    public String exibirFormularioEdicao(@PathVariable Long id, Model model) {

        Optional<Aluno> alunoOptional = alunoRepository.findById(id);


        if (alunoOptional.isPresent()) {
            Aluno aluno = alunoOptional.get();
            model.addAttribute("aluno", aluno);
            return "form-aluno";
        } else {
            return "redirect:/alunos";
        }
    }
    @GetMapping("/ver/{id}")
    public String visualizarAluno(@PathVariable Long id, Model model) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(id);

        if (alunoOptional.isPresent()) {
            model.addAttribute("aluno", alunoOptional.get());
            return "detalhes-aluno"; // /resources/templates/detalhes-aluno.html
        } else {
         model.addAttribute("aluno", null);
            return "detalhes-aluno";
        }
    }
    @GetMapping("/deletar/{id}")
    public String deletarAluno(@PathVariable Long id) {

        alunoRepository.deleteById(id);
        return "redirect:/alunos";
    }
}

