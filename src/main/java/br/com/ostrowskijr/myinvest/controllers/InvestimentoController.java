package br.com.ostrowskijr.myinvest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ostrowskijr.myinvest.model.Investimento;
import br.com.ostrowskijr.myinvest.repository.InvestimentoRepository;

@RestController
@RequestMapping("/investimento")
public class InvestimentoController {

    private InvestimentoRepository repository;

    @Autowired
    public InvestimentoController(InvestimentoRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/")
    public Investimento persist(@RequestBody Investimento investimento) {
        return this.repository.save(investimento);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(name = "id") Long id) {
        this.repository.delete(this.repository.getById(id));
    }

    @GetMapping("/listAll")
    public List<Investimento> listAll() {
        return this.repository.findAll();
    }

    @GetMapping("/get/{id}")
    public Investimento getById(@PathVariable(name = "id") Long id) {
        return this.repository.findById(id).orElse(null);
    }

}
