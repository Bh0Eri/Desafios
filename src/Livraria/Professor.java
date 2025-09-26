package Livraria;

public class Professor extends Usuario {

    public Professor(int id, String nome, String email, int idF) {
        super(id, nome, email, idF);
    }

    @Override
    public void getLimitEmprestimos(int limite) {
    limite = 5;
    }
}
