package SistemaEventos;

// Importando bibliotecas necessárias!
import java.util.Scanner;

public class Sistema {
    // Criando o Scanner para ler os dados!
    private static Scanner scanner = new Scanner(System.in);
    // Iniciando o sistema!
    public static void main(String[] args) {
        System.out.println("\n--- Bem-vindo ao Rolézinho Eventos ---");
        System.out.println("1. Cadastrar cantor");
        System.out.println("2. Cadastrar participante");
        System.out.println("3. Cadastrar evento");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer!
    
        switch (opcao) {
            case 1: criarCantor(); break;
            case 2: criarParticipante(); break;
            case 3: criarEvento(); break;
            case 4: System.exit(0);
            default: System.out.println("Opção inválida!");
        }
    }

    // Criando método para cadastrar cantor!
    public void criarCantor(){
        System.out.println("Nome do cantor: ");
        String nome = scanner.nextLine();

        System.out.println("E-mail do cantor: ");
        String email = scanner.nextLine();

        System.out.println("Telefone do cantor: ");
        String telefone = scanner.nextLine();

        System.out.println("Idade do cantor: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer!

        // Criando cantor e adicionando na lista centralizada do BancoDeDados!
        Cantor cantor = new Cantor(nome, email, telefone, idade);
        BancoDeDados.getCantores().add(cantor);
    }

    // Criando método para cadastrar participante!
    public void criarParticipante(){
        System.out.println("Nome do participante: ");
        String nome = scanner.nextLine();

        System.out.println("E-mail do participante: ");
        String email = scanner.nextLine();

        System.out.println("Telefone do participante: ");
        String telefone = scanner.nextLine();

        System.out.println("Idade do participante: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        System.out.println("Senha do participante: ");
        String senha =  scanner.nextLine();

        System.out.println("Deseja cadastrar o participante em algum evento? (S/N)");
        String resposta = scanner.nextLine();

        while (resposta.equalsIgnoreCase("s")){
            System.out.println("\n Eventos disponíveis: ");
            for(int i = 0; i < BancoDeDados.getEventos().size(); i++){
                System.out.println(( i + 1 ) + " . " + BancoDeDados.getEventos().get(i).getNomeEvento());
            }
            
            System.out.println("Digite o número do evento para inscrever");
            int escolhaEvento = scanner.nextInt();
            scanner.nextLine(); // Limpar Buffer

            if (escolhaEvento < 1 || escolhaEvento > BancoDeDados.getEventos().size()){
                System.out.println("Evento inválido!");
            }
            else{
                
            }
        }
    }
}
