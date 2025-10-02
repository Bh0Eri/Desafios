package Livraria.Library;

import Livraria.Users.Status;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private Status status;

    public Livro(int id, String titulo, String autor, Status status) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }

    public Livro() {
    } // Construtor vazio, se necessário

    @Override
    public String toString() {
        return "Livro | " +
                " id:" + id +
                " status:" + status +
                " título:" + titulo +
                " autor:" + autor +
                " | \n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}