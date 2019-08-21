package br.digitalhouse.Execicio.Integrador;

import java.util.List;

public class Livro {
    public int codLivro;
    public String titulo;
    public String autorLivro;
    public int anoDoLivro;
    public int codIsbn;

    public Livro(int codLivro, String titulo, String autorLivro, int anoDoLivro, int codIsbn) {
        this.codLivro = codLivro;
        this.titulo = titulo;
        this.autorLivro = autorLivro;
        this.anoDoLivro = anoDoLivro;
        this.codIsbn = codIsbn;
    }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getAnoDoLivro() {
        return anoDoLivro;
    }

    public void setAnoDoLivro(int anoDoLivro) {
        this.anoDoLivro = anoDoLivro;
    }

    public int getCodIsbn() {
        return codIsbn;
    }

    public void setCodIsbn(int codIsbn) {
        this.codIsbn = codIsbn;
    }

    @Override
    public String toString() {
        return "Livro = " +
                " codLivro " + codLivro +
                "  , titulo " + titulo + '\'' +
                "  , autorLivro " + autorLivro + '\'' +
                "  , anoDoLivro " + anoDoLivro +
                "   , codIsbn " + codIsbn
                ;
    }
}


