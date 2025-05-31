import java.util.Scanner;

public class Sessao {
    private Participante participanteLogado;
    
    public Sessao(Participante participanteLogado) {
        this.participanteLogado = participanteLogado;
    }

    public Participante getParticipanteLogado() {
        return participanteLogado;
    }

    public void alterarDados(Scanner scanner) {
        System.out.println("Qual dado deseja alterar?");
        System.out.println("1. Nome");
        System.out.println("2. Email");
        System.out.println("3. Senha");
        System.out.print("Opção: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                System.out.print("Novo nome: ");
                String novoNome = scanner.nextLine();
                participanteLogado.setNomeParticipante(novoNome);
                System.out.println("Nome atualizado com sucesso!");
                break;
            case 2:
                System.out.print("Novo email: ");
                String novoEmail = scanner.nextLine();
                participanteLogado.setEmailParticipante(novoEmail);
                System.out.println("Email atualizado com sucesso!");
                break;
            case 3:
                System.out.print("Nova senha: ");
                String novaSenha = scanner.nextLine();
                participanteLogado.setSenhaParticipante(novaSenha);
                System.out.println("Senha atualizada com sucesso!");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
