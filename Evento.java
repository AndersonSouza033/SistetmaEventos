// Importando bibliotecas necessárias!
import java.util.List;

public class Evento {
    // Definindo atributos da classe evento!
    private boolean ativoEvento;
    private String nomeEvento;
    private String descricaoEvento;
    private String localEvento;
    private String dataEvento;
    private int capacidadeEvento;
    private List<Cantor> cantoresEscolhidos;
    private List<Participante> participantesCadastrados;

    // Criando o método construtor!
    public Evento(String nomeEvento, String descricaoEvento, String localEvento, String dataEvento, int capacidadeEvento) {
        this.ativoEvento = true;
        this.nomeEvento = nomeEvento;
        this.descricaoEvento = descricaoEvento;
        this.localEvento = localEvento;
        this.dataEvento = dataEvento;
        this.capacidadeEvento = capacidadeEvento;
    }

    // Criando os métodos getters (Ler)!
    public boolean getAtivoEvento(){
        return ativoEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public int getCapacidadeEvento() {
        return capacidadeEvento;
    }

    public List<Cantor> getCantoresEscolhidos(){
        return cantoresEscolhidos;
    }

    public List<Participante> getParticipantesCadastrados(){
        return participantesCadastrados;
    }

    //Criando os métodos setters (Adicionar)!
    public void isAtivoEvento(boolean ativoEvento){
        this.ativoEvento = ativoEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public void setCapacidadeEvento(int capacidadeEvento) {
        this.capacidadeEvento = capacidadeEvento;
    }
    
    public void setCantoresEscolhidos(List<Cantor> cantoresEscolhidos) {
        this.cantoresEscolhidos = cantoresEscolhidos;
    }

    public void setParticipantesCadastrados(List<Participante> participantesCadastrados) {
        this.participantesCadastrados = participantesCadastrados;
    }
    
    // Criando o método para listar!
    @Override
    public String toString() {
        return """
            Eventos:
            Nome: %s
            Descrição: %s
            Local: %s
            Data: %s
            Capacidade: %d pessoas
            Cantores: %s
            Ativo: %s
            -------------------
            """.formatted(nomeEvento, descricaoEvento, localEvento, dataEvento, capacidadeEvento, cantoresEscolhidos, ativoEvento);
    }

    public void desativarEvento() {
        this.ativoEvento = false;
        System.out.println("Evento cancelado!");
    }
}

