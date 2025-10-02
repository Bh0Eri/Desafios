package Livraria.Users;

public class Professor extends Usuario {
    private int limite = 5;
    public Professor(int id, String nome, String email, int idF) {
        super(id, nome, email, idF);
    }

    @Override
    public int getLimitEmprestimos() {
    return limite;
    }

    @Override
    public String toString() {
        return "Professor:" +
                " Id"+getId()+
                " nome='" + nome + '\'' +
                " email='" + email + '\'' +
                '\n';
    }
}
