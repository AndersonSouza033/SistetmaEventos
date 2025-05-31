    // Importando bibliotecas necessárias!
import java.util.List;

public class Participante {
    // Definindo atributos da classe participante!
    private String nomeParticipante;
    private String emailParticipante;
    private String telefoneParticipante;
    private int idadeParticipante;
    private String senhaParticipante;
    private List<Evento> eventoEscolhido;
    
    // Criando o método construtor!
    public Participante(String nomeParticipante, String emailParticipante, String telefoneParticipante,int idadeParticipante, String senhaPartcipante){
        this.nomeParticipante = nomeParticipante;
        this.emailParticipante = emailParticipante;
        this.telefoneParticipante = telefoneParticipante;
        this.idadeParticipante = idadeParticipante;
        this.senhaParticipante = senhaPartcipante;
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

    public String getSenhaParticipante() {
        return senhaParticipante;
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

    public void setSenhaParticipante(String senhaParticipante) {
        this.senhaParticipante = senhaParticipante;
    }

    public void setEventoEscolhido(List<Evento> eventoEscolhido){
        this.eventoEscolhido = eventoEscolhido;
    }

    // Criando o método para listar!
    @Override
    public String toString() {
        return """
            Participantes:
            Nome: %s
            E-mail: %s
            Telefone: %s
            Idade: %d
            Eventos inscritos: %s
            -------------------
            """.formatted(nomeParticipante, emailParticipante, telefoneParticipante, idadeParticipante, eventoEscolhido);
    }

}
