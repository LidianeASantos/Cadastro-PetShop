package br.com.zup.lidiane.petshop.animal;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
