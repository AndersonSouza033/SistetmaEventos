// Importando bibliotecas necessárias!
import java.util.List;

public class Participante {
    // Definindo atributos da classe participante!
    private String nomeParticipante;
    private String emailParticipante;
    private String telefoneParticipante;
    private int idadeParticipante;
    private String senhaPartcipante;
    private List<Evento> eventoEscolhido;
    
    // Criando o método construtor!
    public Participante(String nomeParticipante, String emailParticipante, String telefoneParticipante,int idadeParticipante, String senhaPartcipante, List<Evento> eventoEscolhido){
        this.nomeParticipante = nomeParticipante;
        this.emailParticipante = emailParticipante;
        this.telefoneParticipante = telefoneParticipante;
        this.idadeParticipante = idadeParticipante;
        this.senhaPartcipante = senhaPartcipante;
        this.eventoEscolhido = eventoEscolhido;
    }

    // Criando os métodos getters (Ler)!
    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public String getEmailParticipante() {
        return emailParticipante;
    }

    public String getTelefoneParticipante() {
        return telefoneParticipante;
    }

    public int getIdadeParticipante() {
        return idadeParticipante;
    }

    public String getSenhaPartcipante() {
        return senhaPartcipante;
    }

    public List<Evento> getEventoEscolhido(){
        return eventoEscolhido;
    }

    //Criando os métodos setters (Adicionar)!
    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public void setEmailParticipante(String emailParticipante) {
        this.emailParticipante = emailParticipante;
    }

    public void setTelefoneParticipante(String telefoneParticipante) {
        this.telefoneParticipante = telefoneParticipante;
    }

    public void setIdadeParticipante(int idadeParticipante) {
        this.idadeParticipante = idadeParticipante;
    }

    public void setSenhaPartcipante(String senhaPartcipante) {
        this.senhaPartcipante = senhaPartcipante;
    }

    public void setEventoEscolhido(List<Evento> eventoEscolhido){
        this.eventoEscolhido = eventoEscolhido;
    }

    // Criando o método para listar!
    @Override
    public String toString() {
        return "\n Participantes:" +
            "\n Nome: " + nomeParticipante +
            "\n E-mail: " + emailParticipante + 
            "\n Telefone: " + telefoneParticipante + 
            "\n Idade: " + idadeParticipante +
            "\n Eventos inscrito: " + eventoEscolhido +
            "\n -------------------";
    }
}
