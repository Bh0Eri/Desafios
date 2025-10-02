package Livraria.Users;

public class Aluno extends Usuario{
    private int limite = 2;
    public Aluno(int id, String nome, String email, int idF) {
        super(id, nome, email, idF);
    }

    @Override
    public int getLimitEmprestimos() {
    return limite;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                " id" + getId() +
                " nome='" + nome + '\'' +
                " email='" + email + '\'' +
                '\n';
    }
}
