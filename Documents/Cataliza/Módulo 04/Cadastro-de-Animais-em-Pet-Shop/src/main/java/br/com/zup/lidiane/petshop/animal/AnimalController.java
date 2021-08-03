package br.com.zup.lidiane.petshop.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    @Transactional
    public ResponseEntity<List<Animal>>listar(){
        return ResponseEntity.status( HttpStatus.OK ).
                body( animalRepository.findAll() );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Animal adicionar(@RequestBody @Valid Animal animal) {
          return animalRepository.save( animal );
    }

     @GetMapping("/{nome}")
    public List<Animal> pesquisarPeloNome(@PathVariable String nome){
        return animalRepository.findAll();
    }

    @PutMapping("/{id}")
    public Animal atualizar(@RequestBody Animal animal, @PathVariable("id") Long id) {
        animal.setId( id );
        return animalRepository.save( animal );
    }


}
