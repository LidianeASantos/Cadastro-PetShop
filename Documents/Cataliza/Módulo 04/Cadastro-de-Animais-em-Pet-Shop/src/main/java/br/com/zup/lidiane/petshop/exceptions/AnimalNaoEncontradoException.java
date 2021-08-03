package br.com.zup.lidiane.petshop.exceptions;

public class AnimalNaoEncontradoException extends RuntimeException {
    public AnimalNaoEncontradoException(String message) {
        super(message);
    }

}
