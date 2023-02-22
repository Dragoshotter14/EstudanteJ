import java.util.Scanner;

public class SIESJ {
    public static void main(String[] args) {
        try{
            int escolha;
            System.out.println("Bem vindo ao seu sistema de gestão estudantil!");
            Scanner p = new Scanner(System.in);
            System.out.print("Para gerenciar seu sistema digite 1+" +
                    "Para sair digite 2" +
                    "Escolha:");
            escolha = p.nextInt();
            if (escolha == 1) {
                System.out.print("Para criar a tabela de alunos e professores digite 1" +
                        "Visualizar alunos e professores digite 2" +
                        "editar alunos e professores digite 3" +
                        "Para sair digite 4" +
                        "Escolha");
                escolha = p.nextInt();
                if (escolha == 1) {
                    String alunoNumero;
                    String alunoNome;
                    String professorNome;
                    String professorNumero;
                    System.out.print("Quantos alunos voce quer adicionar?:");
                    alunoNumero = p.nextLine();
                    System.out.print("Quantos professores voce quer adicionar?:");
                    professorNumero = p.nextLine();
                }if (escolha == 2) {
                    System.out.print("Visualizar");
                }if (escolha == 3){
                    System.out.print("Editar");
                }if (escolha == 4){
                    System.out.print("Finalizando o programa...");
                }else {
                    System.out.print("Finalizando o programa...");
                }
            }
            if (escolha == 2) {
                System.out.print("Finalizando o programa...");
            } else {
                System.out.print("Finalizando o programa...");
            }
        }catch (RuntimeException e) {
            System.out.println(e);
    }
}}
