package Livraria;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        // Lista de livros e professores/alunos
        ArrayList <Livro> livros = new ArrayList <>();
        ArrayList <Usuario> users = new ArrayList <>();

        // Populando com professores
        users.add(new Professor(users.size()+1, "Marcelo","Marcelo@edu.com",2));
        users.add(new Professor(users.size()+1, "Fiama","Fiama.brenda@edu.com",2));
        users.add(new Professor(users.size()+1, "Lucas","Correa@edu.com",2));

        // Populando com alunos
        users.add(new Aluno(users.size()+1, "Eric", "Eric@gmail.com", 2));
        users.add(new Aluno(users.size()+1, "david", "David@gmail.com", 2));
        users.add(new Aluno(users.size()+1, "Luiz", "Luiz@gmail.com", 2));

        // Populando Livros
        livros.add(new Livro(users.size()+1,"Biografia felipe neto", "Felipe neto",Status.DISPONIVEL));
        livros.add(new Livro(livros.size() + 1, "Dom Casmurro", "Machado de Assis", Status.DISPONIVEL));
        livros.add(new Livro(livros.size() + 1, "O Senhor dos Anéis", "J. R. R. Tolkien", Status.DISPONIVEL));
        livros.add(new Livro(livros.size() + 1, "Harry Potter e a Pedra Filosofal", "J. K. Rowling", Status.DISPONIVEL));
        livros.add(new Livro(livros.size() + 1, "1984", "George Orwell", Status.DISPONIVEL));









    }
}