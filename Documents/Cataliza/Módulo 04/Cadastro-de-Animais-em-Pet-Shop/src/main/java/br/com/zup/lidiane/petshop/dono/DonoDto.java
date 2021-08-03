package br.com.zup.lidiane.petshop.dono;

import br.com.zup.lidiane.petshop.animal.Animal;

import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

public class DonoDto {

    @NotBlank(message = "Nome é obrigatório!")
    private String nome;

    @Email
    @NotBlank(message = "Email é obrigatório!")
    private String email;

    @NotBlank(message = "Teleone é obrigatório!")
    private String telefone;



    public DonoDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "DonoDto{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
