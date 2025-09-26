package Livraria;

public abstract class Usuario {
    private int id;
    String nome;
    String email;
    int idF;

    public Usuario(int id, String nome, String email, int idF) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idF = idF;
    }

    public abstract void getLimitEmprestimos(int limite);

}
