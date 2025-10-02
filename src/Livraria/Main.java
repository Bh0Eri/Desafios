package Livraria;

import Livraria.Library.*;
import Livraria.Users.*;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();




        int opc, opcu;

        // Lista de livros e professores/alunos

        ArrayList <Usuario> users = new ArrayList <>();

        // Populando com professores
        users.add(new Professor(users.size() + 1, "Marcelo","Marcelo@edu.com",0));
        users.add(new Professor(users.size() + 1, "Fiama","Fiama.brenda@edu.com",0));
        users.add(new Professor(users.size() + 1, "Lucas","Correa@edu.com",0));

        // Populando com alunos
        users.add(new Aluno(users.size() + 1, "Eric", "Eric@gmail.com", 0));
        users.add(new Aluno(users.size() + 1, "david", "David@gmail.com", 0));
        users.add(new Aluno(users.size() + 1, "Luiz", "Luiz@gmail.com", 0));

        //Populando com livros
        biblioteca.addLivro(new Livro(1, "Dom Casmurro", "Machado de Assis", Status.DISPONIVEL));
        biblioteca.addLivro(new Livro(2, "O Senhor dos Anéis", "J. R. R. Tolkien", Status.DISPONIVEL));
        biblioteca.addLivro(new Livro(3, "Harry Potter e a Pedra Filosofal", "J. K. Rowling", Status.DISPONIVEL));
        biblioteca.addLivro(new Livro(4, "1984", "George Orwell", Status.DISPONIVEL));
        biblioteca.addLivro(new Livro(5, "A Revolução dos Bichos", "George Orwell", Status.DISPONIVEL));




        Usuario user;
        Livro book;

        while(true){
            System.out.println("Bem vindo a biblioteca jorge \n");
            System.out.println("O que irá fazer agora? \n [1] Devolver um livro \n [2] Pegar um livro \n [3] Adicionar um livro");
            switch(input.nextInt()){
                case 1:
                    System.out.println("Que livro você pegou??");
                    opc = input.nextInt();
                    book = (Livro) biblioteca.getLivros().get(opc);
                    System.out.print("Qual seu id?");
                    opcu = input.nextInt();
                    user = (Usuario) users.get(opcu);
                    System.out.print("Qual o id do livro?");
                    opc = input.nextInt();
                    biblioteca.devolverLivro(user, opc);
                    if(book.getStatus().equals(Status.DISPONIVEL)){
                        user.idF-=1;
                    }

                    break;
                    case 2:
                        System.out.println(biblioteca.getLivros());

                        System.out.println("Qual livro você vai querer?");
                        opc = input.nextInt()-1;
                        book = (Livro) biblioteca.getLivros().get(opc);
                        System.out.println("Quem vai pegar livro?");
                        System.out.println(users);
                        opcu = input.nextInt()-1;
                        user = (Usuario) users.get(opcu);

                        if (book.getStatus().equals(Status.DISPONIVEL)) {
                            biblioteca.emprestarLivro(user, opc);
                            if (user.getLimitEmprestimos() > user.idF) {
                                user.idF += 1;
                                System.out.println("Emprestado com sucesso para " + user.nome + " o livro: " + book.getTitulo());
                                //System.out.println("Qual sua data ");
                                //String data = input.next();

                            } else {
                                book.setStatus(Status.DISPONIVEL);
                                System.err.println("Limite atingido de livros!");

                            }
                        }else {
                            System.out.println("Livro já foi emprestado!");
                        }
                        break;
                case 3:
                    System.out.print("Titulo:");
                    String titulo = input.next();
                    System.out.print("Autor:");
                    String autor = input.next();
                    if (titulo.isEmpty() || autor.isEmpty()) {
                        System.err.println("Titulo ou Autor vazio!");
                    }else {
                        biblioteca.addLivro(new Livro(biblioteca.getLivros().size()+1, titulo, autor, Status.DISPONIVEL));
                        System.out.println("Livro adicionado com sucesso!");
                    }
                    break;
            }


        }
    }
    }
