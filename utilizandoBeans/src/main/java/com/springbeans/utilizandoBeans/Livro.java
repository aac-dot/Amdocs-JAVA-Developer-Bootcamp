package com.springbeans.utilizandoBeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {
    private String nome;
    private String codigo;

    @Autowired
    private AutorLivro autor;

    public AutorLivro getAutor() {
        return autor;
    }

    public void setAutor(AutorLivro autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /*
    public void exibir() {
        System.out.println(this.nome + " - " + this.codigo);
    }
    */

    public void exibir() {
        System.out.println(this.nome + " - " + this.codigo);
        this.autor.exibirAutor();
    }
}
