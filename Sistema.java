// Importando bibliotecas necessárias!
import java.util.Scanner;

public class Sistema {
    // Criando o Scanner para ler os dados!
    private static final Scanner scanner = new Scanner(System.in);

    // Iniciando o sistema com o menu principal!
    public static void main(String[] args){
        while (true) {
            System.out.println("\n--- Bem-vindo ao Rolézinho Eventos ---");
            System.out.println("1. Entrar como organizador");
            System.out.println("2. Entrar como participante");
            System.out.println("3. Cadastrar participante");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
    
            switch (opcao) {
                case 1: loginOrganizador(); break; // Linha 31.
                case 2: loginParticipante(); break; // Linha 52.
                case 3: criarParticipante(); break; // Linha 239.
                case 4: System.out.println("Encerrando o sistema. Até a próxima!");
                System.exit(0);
                default: System.out.println("Opção inválida!");
            }
        }
    }

    // Verificando login do organizador!
    public static void loginOrganizador(){
        boolean loginValido = false;

        while (!loginValido) {
            System.out.println("Login: ");
            String loginInput = scanner.nextLine();
    
            System.out.println("Senha: ");
            String senhaInput = scanner.nextLine();
    
            if (loginInput.equals(BancoDeDados.getLogin()) && senhaInput.equals(BancoDeDados.getSenha())) {
                System.out.println("Login realizado com sucesso!");
                menuOrganizador(); // Redireciona para o menu do organizador linha 77!
                loginValido = true;
            } else {
                System.out.println("Login e/ou senha incorretos! Tente novamente.");
            }
        }
    }

    // Verificando login participante!
    public static void loginParticipante() {
        System.out.println("Email: ");
        String emailInput = scanner.nextLine();
    
        System.out.println("Senha: ");
        String senhaInput = scanner.nextLine();
    
        boolean participanteEncontrado = false;
    
        // Buscando o participante na lista de participantes
        for (Participante p : BancoDeDados.getParticipantes()) {
            if (p.getEmailParticipante().equalsIgnoreCase(emailInput) && p.getSenhaParticipante().equals(senhaInput)) {
                System.out.println("Login realizado com sucesso!");
                menuParticipante();  // Redireciona para o menu do participante linha 99!
                participanteEncontrado = true;
                break;
            }
        }
    
        if (!participanteEncontrado) {
            System.out.println("Email e/ou senha incorretos! Tente novamente.");
        }
    }
    
    // Criando o menu do organizador!
    public static void menuOrganizador(){
        while (true){
            System.out.println("\n--- Menu organizador! ---");
            System.out.println("1. Dados dos eventos");
            System.out.println("2. Dados dos participantes");
            System.out.println("3. Dados dos cantores");
            System.out.println("4. Voltar");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer!

            switch (opcao) {
                case 1 -> menuEvento(); // Linha 122
                case 2 -> menuParticipanteOrg(); // Método criado! Linha 154
                case 3 -> menuCantor(); // Método criado! Linha 181
                case 4 -> {return;}
                default -> System.out.println("Opção inválida!");
            }
        }
    }
    
    // Criando o menu do participante!
    public static void menuParticipante(){
        while (true){
            System.out.println("\n--- Menu do participante! ---");
            System.out.println("1. Alterar meus dados");
            System.out.println("2. Listar eventos");
            System.out.println("3. Inscrever no evento");
            System.out.println("4. Cancelar inscrição");
            System.out.println("5. Voltar");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer!

            switch (opcao) {
                //case 1 -> alterarDados();
                case 2 -> listarEvento(); // Método criado! Linha 204
                //case 3 -> inscricaoEvento();
                //case 4 -> cancelarInscricao();
                case 5 -> {return;}
                default -> System.out.println("Opção inválida!");
            }

        }
    }
    
    // Criando o menu do evento (organizador)!
    public static void menuEvento(){
        while (true){
            System.out.println("\n--- Menu evento! ---");
            System.out.println("1. Criar evento");
            System.out.println("2. Listar eventos");
            System.out.println("3. Editar eventos");
            System.out.println("4. Cancelar eventos");
            System.out.println("5. Adicionar cantor no evento");
            System.out.println("6. Adicionar participante no evento");
            System.out.println("7. Remover cantor no evento");
            System.out.println("8. Excluir evento");
            System.out.println("9. Voltar");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer!

            switch (opcao) {
                case 1 -> criarEvento(); // Linha 270.
                case 2 -> listarEvento(); // Linha 206.
                case 3 -> editarEvento(); // Linha 315
                //case 4 -> cancelarEvento();
                //case 5 -> adicionarCantor();
                //case 6 -> adicionarParticipante();
                //case 7 -> removerCantor();
                //case 8 -> excluirEvento();
                case 9 -> {return;}
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    // Criando o menu do participante (Organizador)!
    public static void menuParticipanteOrg(){
        while (true){
            System.out.println("\n--- Menu do participante (organizador)! ---");
            System.out.println("1. Cadastrar participante");
            System.out.println("2. Listar participantes");
            System.out.println("3. Editar participantes");
            System.out.println("4. Adicionar participantes no evento");
            System.out.println("5. Excluir participantes");
            System.out.println("6. Voltar");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer!

            switch (opcao) {
                case 1 -> criarParticipante(); // Linha 248
                case 2 -> listarParticipante(); // Linha 234
                case 3 -> editarParticipante(); // Linha 413
                //case 4 -> adicionarParticipanteEvento();
                //case 5 -> excluirParticipante();
                case 6 -> {return;}
                default -> System.out.println("Opção inválida!");
            }
        }
    }
    
    // Criando o menu do cantor (organizador)!
    public static void menuCantor(){
        while (true){
            System.out.println("\n--- Menu do cantor! ---");
            System.out.println("1. Cadastrar cantor");
            System.out.println("2. Listar cantores");
            System.out.println("3. Editar cantores");
            System.out.println("4. Adicionar cantores no evento");
            System.out.println("5. Excluir cantores");
            System.out.println("6. Voltar");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer!

            switch (opcao) {
                case 1 -> criarCantor(); // Linha 296
                case 2 -> listarCantor(); // Linha 220
                case 3 -> editarCantor(); // Linha 503
                //case 4 -> adicionarCantorEvento();
                //case 5 -> excluirCantor();
                case 6 -> {return;}
                default -> System.out.println("Opção inválida!");
            }
        }
    }
    
    // Método para listar os eventos!
    public static void listarEvento() {
        System.out.println("\n----- Lista de eventos: -----");
    
        if (BancoDeDados.getEventos().isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            for (int i = 0; i < BancoDeDados.getEventos().size(); i++) {
                Evento evento = BancoDeDados.getEventos().get(i);
                System.out.println(evento);
            }
        }
    }

    // Método para listar cantores!
    public static void listarCantor(){
        System.out.println("\n----- Lista de cantores: -----");

        if (BancoDeDados.getCantores().isEmpty()){
            System.out.println("Nenhum cantor cadastrado.");
        } else{
            for(int i = 0; i < BancoDeDados.getCantores().size(); i++){
                Cantor cantor = BancoDeDados.getCantores().get(i);
                System.out.println(cantor);
            }
        }
    }

    // Metodo para listar participantes!
    public static void listarParticipante(){
        System.out.println("\n----- Lista de participantes: -----");

        if (BancoDeDados.getParticipantes().isEmpty()){
            System.out.println("Nenhum participante cadastrado.");
        } else{
            for (int i = 0; i < BancoDeDados.getParticipantes().size(); i++){
                Participante participante = BancoDeDados.getParticipantes().get(i);
                System.out.println(participante);
            }
        }
    }

    // Método para cadastrar participante!
    public static void criarParticipante() {
        System.out.println("=== Cadastro de Participante ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
    
        System.out.print("Email: ");
        String email = scanner.nextLine();
    
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
    
        System.out.print("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
    
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
    
        Participante novoParticipante = new Participante(nome, email, telefone, idade, senha);
        BancoDeDados.adicionarParticipante(novoParticipante);
    }

    // Método para cadastrar evento!
    public static void criarEvento() {
        System.out.println("\n--- Cadastro de Evento ---");
    
        System.out.print("Nome do evento: ");
        String nome = scanner.nextLine();
    
        System.out.print("Descrição do evento: ");
        String descricao = scanner.nextLine();
    
        System.out.print("Local do evento: ");
        String local = scanner.nextLine();
    
        System.out.print("Data do evento (ex: 10/06/2025): ");
        String data = scanner.nextLine();
    
        System.out.print("Capacidade máxima de participantes: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); // Limpa buffer
    
        Evento novoEvento = new Evento(nome, descricao, local, data, capacidade);
        BancoDeDados.adicionarEvento(novoEvento);
        System.out.println("✅ Evento cadastrado com sucesso!");
    }

    // Método para cadastrar cantor!
    public static void criarCantor() {
        System.out.println("Digite o nome do cantor:");
        String nomeCantor = scanner.nextLine();

        System.out.println("Digite o e-mail do cantor:");
        String emailCantor = scanner.nextLine();

        System.out.println("Digite o telefone do cantor:");
        String telefoneCantor = scanner.nextLine();

        System.out.println("Digite a idade do cantor:");
        int idadeCantor = scanner.nextInt();
        scanner.nextLine();  // Limpar buffer!

        Cantor novoCantor = new Cantor(nomeCantor, emailCantor, telefoneCantor, idadeCantor);
        BancoDeDados.adicionarCantor(novoCantor);
    }

    // Método para editar o evento!
    public static void editarEvento() {
        System.out.println("\n----- Lista de eventos: -----");

        if (BancoDeDados.getEventos().isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            for (int i = 0; i < BancoDeDados.getEventos().size(); i++) {
                Evento evento = BancoDeDados.getEventos().get(i);  // Pega o objeto Evento inteiro
                System.out.println(evento.getNomeEvento());  // Imprime apenas o nome do evento
            }
        }

        // Solicitar o nome do evento para identificar qual evento será editado
        System.out.println("Digite o nome do evento que deseja editar:");
        String nomeEvento = scanner.nextLine();

        // Procurar o evento na lista de eventos
        Evento evento = null;
        for (Evento e : BancoDeDados.getEventos()) {
            if (e.getNomeEvento().equalsIgnoreCase(nomeEvento)) {
                evento = e;
                break;
            }
        }

        // Verificar se o evento foi encontrado
        if (evento == null) {
            System.out.println("Evento não encontrado!");
            return;
        }

        // Menu de edição de atributos
        boolean continuarEditando = true;

        while (continuarEditando) {
            System.out.println("\nEscolha o atributo que deseja editar:");
            System.out.println("1. Nome do evento");
            System.out.println("2. Descrição do evento");
            System.out.println("3. Local do evento");
            System.out.println("4. Data do evento");
            System.out.println("5. Capacidade do evento");
            System.out.println("6. Voltar para a tela principal");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o novo nome do evento:");
                    String novoNome = scanner.nextLine();
                    evento.setNomeEvento(novoNome);
                    System.out.println("Nome do evento atualizado com sucesso!");
                }
                case 2 -> {
                    System.out.println("Digite a nova descrição do evento:");
                    String novaDescricao = scanner.nextLine();
                    evento.setDescricaoEvento(novaDescricao);
                    System.out.println("Descrição do evento atualizada com sucesso!");
                }
                case 3 -> {
                    System.out.println("Digite o novo local do evento:");
                    String novoLocal = scanner.nextLine();
                    evento.setLocalEvento(novoLocal);
                    System.out.println("Local do evento atualizado com sucesso!");
                }
                case 4 -> {
                    System.out.println("Digite a nova data do evento:");
                    String novaData = scanner.nextLine();
                    evento.setDataEvento(novaData);
                    System.out.println("Data do evento atualizada com sucesso!");
                }
                case 5 -> {
                    System.out.println("Digite a nova capacidade do evento:");
                    int novaCapacidade = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    evento.setCapacidadeEvento(novaCapacidade);
                    System.out.println("Capacidade do evento atualizada com sucesso!");
                }
                case 6 -> {
                    continuarEditando = false;
                    System.out.println("Voltando para a tela principal...");
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

            // Perguntar se o organizador quer editar mais um atributo
            if (opcao != 6) {
                System.out.println("Você deseja editar mais algum atributo? (S/N)");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("N")) {
                    continuarEditando = false;
                    System.out.println("Voltando para a tela principal...");
                }
            }
        }
    }

    // Método para editar o participante!
    public static void editarParticipante() {
        System.out.println("\n----- Lista de participantes: -----");

        if (BancoDeDados.getParticipantes().isEmpty()) {
            System.out.println("Nenhum participante cadastrado.");
        } else {
            for (int i = 0; i < BancoDeDados.getParticipantes().size(); i++) {
                Participante participante = BancoDeDados.getParticipantes().get(i);
                System.out.println(participante.getEmailParticipante());  // Imprime apenas o e-mail do participante
            }
        }

        System.out.println("Digite o e-mail do participante que deseja editar: ");
        String email = scanner.nextLine();
        
        // Procurar participante pelo e-mail
        Participante participante = null;
        for (Participante p : BancoDeDados.getParticipantes()) {
            if (p.getEmailParticipante().equalsIgnoreCase(email)) {
                participante = p;
                break;
            }
        }

        if (participante == null) {
            System.out.println("Participante não encontrado com esse e-mail.");
            return;
        }

        // Mostrar os dados atuais do participante
        System.out.println("Participante encontrado: ");
        System.out.println(participante);

        boolean editarNovamente = true;
        while (editarNovamente) {
            // Menu de edição
            System.out.println("\nEscolha o que deseja editar:");
            System.out.println("1. Nome");
            System.out.println("2. Telefone");
            System.out.println("3. Idade");
            System.out.println("4. E-mail");
            System.out.println("5. Voltar");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o novo nome:");
                    String novoNome = scanner.nextLine();
                    participante.setNomeParticipante(novoNome);
                    System.out.println("Nome atualizado com sucesso!");
                }
                case 2 -> {
                    System.out.println("Digite o novo telefone:");
                    String novoTelefone = scanner.nextLine();
                    participante.setTelefoneParticipante(novoTelefone);
                    System.out.println("Telefone atualizado com sucesso!");
                }
                case 3 -> {
                    System.out.println("Digite a nova idade:");
                    int novaIdade = scanner.nextInt();
                    participante.setIdadeParticipante(novaIdade);
                    System.out.println("Idade atualizada com sucesso!");
                }
                case 4 -> {
                    System.out.println("Digite o novo e-mail:");
                    String novoEmail = scanner.nextLine();
                    participante.setEmailParticipante(novoEmail);
                    System.out.println("E-mail atualizado com sucesso!");
                }
                case 5 -> {
                    editarNovamente = false;
                    System.out.println("Voltando ao menu principal...");
                }
                default -> System.out.println("Opção inválida.");
            }

            // Perguntar se deseja editar mais um campo
            if (opcao != 5) {
                System.out.println("\nDeseja editar outro atributo? (s/n)");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("n")) {
                    editarNovamente = false;
                }
            }
        }
    }

    // Método para editar o cantor!
    public static void editarCantor() {
        System.out.println("\n----- Editar Cantor: -----");

        // Solicita o nome do cantor para busca
        System.out.print("Digite o nome do cantor para edição: ");
        String nome = scanner.nextLine();

        // Procurar cantor pelo nome
        Cantor cantor = null;
        for (Cantor c : BancoDeDados.getCantores()) {
            if (c.getNomeCantor().equalsIgnoreCase(nome)) {
                cantor = c;
                break;
            }
        }

        if (cantor == null) {
            System.out.println("Cantor não encontrado com o nome: " + nome);
            return;
        }

        System.out.println("Cantor encontrado: " + cantor);

        boolean continuarEditando = true;
        while (continuarEditando) {
            System.out.println("\nEscolha o atributo que deseja editar:");
            System.out.println("1. Nome");
            System.out.println("2. E-mail");
            System.out.println("3. Telefone");
            System.out.println("4. Idade");
            System.out.println("5. Voltar");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o novo nome: ");
                    cantor.setNomeCantor(scanner.nextLine());
                }
                case 2 -> {
                    System.out.print("Digite o novo e-mail: ");
                    cantor.setEmailCantor(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("Digite o novo telefone: ");
                    cantor.setTelefoneCantor(scanner.nextLine());
                }
                case 4 -> {
                    System.out.print("Digite a nova idade: ");
                    cantor.setIdadeCantor(scanner.nextInt());
                    scanner.nextLine(); // Limpa o buffer
                }
                case 5 -> continuarEditando = false;
                default -> System.out.println("Opção inválida!");
            }

            if (continuarEditando) {
                System.out.println("Cantor atualizado: " + cantor);
                System.out.print("\nDeseja editar outro atributo? (S/N): ");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("N")) {
                    continuarEditando = false;
                }
            }
        }
    }

}