// Importando bibliotecas para fazer listas!
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    // Criando as tabelas das classes para armazenar os dados!
    private static List<Evento> eventos = new ArrayList<>();
    private static List<Cantor> cantores = new ArrayList<>();
    private static List<Participante> participantes = new ArrayList<>();

    // Criando método para adiciona o cantor na tabela!
    public static void adicionarCantor(Cantor cantor){
        
    }

    // Adicionando um evento teste para a tabela!
    static{
        eventos.add(new Evento("Bomrap", "Maior show de rap", "Kleber Andrade - Cariacica", "29/05/2025", 30000, null, null));
    }

    // Adicionando um cantor teste para a tabela!
    static{
        cantores.add(new Cantor("MC Cabelinho", "mccabelinho@gmail.com", "(21) 9 9999-9999", 22));
    }

    // Adicionando um participante teste para a tabela!
    static{
        participantes.add(new Participante("Anderson Souza", "andersonsouzapcb@gmail.com", "(27) 9 9999-9999", 21, "1234", null));
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
