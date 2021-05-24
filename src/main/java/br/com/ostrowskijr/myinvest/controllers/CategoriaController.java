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

import br.com.ostrowskijr.myinvest.model.Categoria;
import br.com.ostrowskijr.myinvest.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @PostMapping("/")
    public Categoria persist(@RequestBody Categoria categoria) {
        return this.categoriaRepository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(name = "id") Long id) {
        this.categoriaRepository.delete(this.categoriaRepository.getById(id));
    }

    @GetMapping("/listAll")
    public List<Categoria> listAll() {
        return this.categoriaRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Categoria getById(@PathVariable(name = "id") Long id) {
        return this.categoriaRepository.findById(id).orElse(null);
    }

}
