package br.com.zup.lidiane.petshop.animal;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AnimalDto {

    @NotBlank(message = "{validacao.nome}")
    private String nome;

    private int idade;

    @NotNull
    private Enum<AnimalEspecie> especie;

    @ManyToOne(cascade=CascadeType.ALL)
    private String dono;

    public AnimalDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Enum<AnimalEspecie> getEspecie() {
        return especie;
    }

    public void setEspecie(Enum<AnimalEspecie> especie) {
        this.especie = especie;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "AnimalDto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie=" + especie +
                ", dono='" + dono + '\'' +
                '}';
    }
}
