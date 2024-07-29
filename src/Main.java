//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- Menu da Agenda Telefônica ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Atualizar Contato");
            System.out.println("5. Listar Contatos");
            System.out.println("6. Encerrar");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    Contato contato = new Contato(nome, numero);
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato para remoção: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato para busca: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoBuscado = agenda.buscarContato(nomeBuscar);
                    if (contatoBuscado != null) {
                        System.out.println(contatoBuscado);
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do contato para atualização: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo número: ");
                    String novoNumero = scanner.nextLine();
                    Contato novoContato = new Contato(novoNome, novoNumero);
                    agenda.atualizarContato(nomeAtualizar, novoContato);
                    break;
                case 5:
                    agenda.listarContatos();
                    break;
                case 6:
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 6);

        scanner.close();
    }
}
