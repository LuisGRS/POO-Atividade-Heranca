public class Usuario{
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}
