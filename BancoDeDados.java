// Importando bibliotecas para fazer listas!
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    // Criando as tabelas das classes para armazenar os dados!
    private static List<Evento> eventos = new ArrayList<>();
    private static List<Cantor> cantores = new ArrayList<>();
    private static List<Participante> participantes = new ArrayList<>();
    
    // Adicionando login de organizador!
    private static String login = "admin";
    private static String senha = "1234";

    public static String getLogin(){
        return login;
    }

    public static String getSenha(){
        return senha;
    }

    // Criando método para adicionar o evento na tabela!
    public static void adicionarEvento(Evento evento){
        for(Evento e : eventos){
            if(e.getNomeEvento().equalsIgnoreCase(evento.getNomeEvento())){
                System.out.println("Nome de evento já cadastrado!");
                return;
            } else{
                System.out.println("Evento cadastrado com sucesso!");
            }
        }
        getEventos().add(evento);
    }

    // Criando método para adicionar o cantor na tabela!
    public static void adicionarCantor(Cantor cantor){
        for(Cantor c : cantores){
            if (c.getEmailCantor().equalsIgnoreCase(cantor.getEmailCantor()) || c.getNomeCantor().equalsIgnoreCase(cantor.getNomeCantor())){
                System.out.println("Nome ou e-mail do cantor já cadastrado!");
                return;
            } else{
                System.out.println("Cantor cadastrado com sucesso!");
            }
        }
        getCantores().add(cantor);
    }

    // Criando método para adicionar o
    public static void adicionarParticipante(Participante participante){
        for(Participante p : participantes){
            if (p.getEmailParticipante().equalsIgnoreCase(participante.getEmailParticipante())){
                System.out.println("E-mail já cadastrado!");
                return;
            } else{
                System.out.println("Participante cadastrado com sucesso!");
            }
        }
        getParticipantes().add(participante);
    }

    // Adicionando um evento teste para a tabela!
    static{
        eventos.add(new Evento("Bomrap", "Maior show de rap", "Kleber Andrade - Cariacica", "29/05/2025", 30000));
    }

    // Adicionando um cantor teste para a tabela!
    static{
        cantores.add(new Cantor("MC Cabelinho", "mccabelinho@gmail.com", "(21) 9 9999-9999", 22));
    }

    static{
        cantores.add(new Cantor("MC Oruam","mcoruam@gmail.com", "(21) 9 9999-9999", 25));
    }

    // Adicionando um participante teste para a tabela!
    static{
        participantes.add(new Participante("Anderson Souza", "andersonsouzapcb@gmail.com", "(27) 9 9999-9999", 21, "1234"));
    }

    // Criando os métodos getters (Ler)!
    public static List<Evento> getEventos() {
        return eventos;
    }

    public static List<Cantor> getCantores() {
        return cantores;
    }

    public static List<Participante> getParticipantes() {
        return participantes;
    }

    //Criando os métodos setters (Adicionar)!
    public static void setEventos(List<Evento> eventos) {
        BancoDeDados.eventos = eventos;
    }

    public static void setCantores(List<Cantor> cantores) {
        BancoDeDados.cantores = cantores;
    }

    public static void setParticipantes(List<Participante> participantes) {
        BancoDeDados.participantes = participantes;
    }
}
