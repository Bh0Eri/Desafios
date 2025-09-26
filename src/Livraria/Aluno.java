package Livraria;

public class Aluno extends Usuario{

    public Aluno(int id, String nome, String email, int idF) {
        super(id, nome, email, idF);
    }

    @Override
    public void getLimitEmprestimos(int limite) {
    limite = 2;
    }
}
