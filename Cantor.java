public class Cantor{
    // Definindo atributos da classe cantor!
    protected String nomeCantor;
    private String emailCantor;
    private String telefoneCantor;
    private int idadeCantor;

    // Criando o método construtor!
    public Cantor(String nomeCantor, String emailCantor, String telefoneCantor, int idadeCantor){
        this.nomeCantor = nomeCantor;
        this.emailCantor = emailCantor;
        this.telefoneCantor = telefoneCantor;
        this.idadeCantor = idadeCantor;
    }

    // Criando os métodos getters (Ler)!
    public String getNomeCantor() {
        return nomeCantor;
    }

    public String getEmailCantor() {
        return emailCantor;
    }

    public String getTelefoneCantor() {
        return telefoneCantor;
    }

    public int getIdadeCantor() {
        return idadeCantor;
    }

    // Criando os métodos setters (Adicionar)!
    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }

    public void setEmailCantor(String emailCantor) {
        this.emailCantor = emailCantor;
    }

    public void setTelefoneCantor(String telefoneCantor) {
        this.telefoneCantor = telefoneCantor;
    }

    public void setIdadeCantor(int idadeCantor) {
        this.idadeCantor = idadeCantor;
    }

    // Criando o método para listar!
    @Override
    public String toString() {
        return "\n Cantores:" +
            "\n Nome: " + nomeCantor + 
            "\n E-mail: " + emailCantor + 
            "\n Telefone: " + telefoneCantor + 
            "\n Idade: " + idadeCantor +
            "\n -------------------";
    }   
}