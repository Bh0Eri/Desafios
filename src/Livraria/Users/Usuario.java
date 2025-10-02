package Livraria.Users;

public abstract class Usuario {
    private int id;
    public String nome;
    String email;
    public int idF;

    public Usuario(int id, String nome, String email, int idF) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idF = idF;
    }

    public abstract int getLimitEmprestimos();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
