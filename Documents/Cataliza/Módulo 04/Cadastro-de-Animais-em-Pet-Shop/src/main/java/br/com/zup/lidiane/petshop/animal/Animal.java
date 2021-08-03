package br.com.zup.lidiane.petshop.animal;
import br.com.zup.lidiane.petshop.dono.Dono;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{validacao.nome}")
    private String nome;

   private int idade;

    @NotNull
    private AnimalEspecie especie;

    @ManyToOne(cascade=CascadeType.ALL)
    private Dono dono;

    public Animal() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AnimalEspecie getEspecie() {
        return especie;
    }

    public void setEspecie(AnimalEspecie especie) {
        this.especie = especie;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie=" + especie +
                ", dono='" + dono + '\'' +
                '}';
    }
}
