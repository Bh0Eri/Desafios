package Livraria;

public class Livro implements Emprestavel {
    private int codigo;
    String titulo;
    String autor;
    private Status status;

    public Livro(int codigo, String titulo, String autor, Status status) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;

    }




    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void emprestar(Usuario usuario) {

    }
    @Override
    public void devolver(){

    }
}
