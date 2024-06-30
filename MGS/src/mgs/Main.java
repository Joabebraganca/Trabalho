package mgs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static int idCounter = 1;

    public static void main(String[] args) {
        Database db = new Database();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Consultar Funcionário");
            System.out.println("3. Sair");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                adicionarFuncionario(db, scanner);
            } else if (opcao.equals("2")) {
                consultarFuncionario(db, scanner);
            } else if (opcao.equals("3")) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void adicionarFuncionario(Database db, Scanner scanner) {
        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            String dataNascimentoStr = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascimento = sdf.parse(dataNascimentoStr);

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            System.out.print("Alergias: ");
            String alergias = scanner.nextLine();

            System.out.print("Problemas Médicos: ");
            String problemasMedicos = scanner.nextLine();

            System.out.print("Nome do Contato de Emergência: ");
            String contatoEmergenciaNome = scanner.nextLine();

            System.out.print("Telefone do Contato de Emergência: ");
            String contatoEmergenciaTelefone = scanner.nextLine();

            System.out.print("Email do Contato de Emergência: ");
            String contatoEmergenciaEmail = scanner.nextLine();

            Funcionario funcionario = new Funcionario(idCounter++, nome, dataNascimento, cpf, telefone, email, endereco, alergias, problemasMedicos, contatoEmergenciaNome, contatoEmergenciaTelefone, contatoEmergenciaEmail);
            db.adicionarFuncionario(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao adicionar funcionário: " + e.getMessage());
        }
    }

    private static void consultarFuncionario(Database db, Scanner scanner) {
        System.out.print("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();

        Funcionario funcionario = db.consultarFuncionario(cpf);
        if (funcionario != null) {
            String cartao = CartaoGerador.gerarCartao(funcionario);
            System.out.println(cartao);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}

