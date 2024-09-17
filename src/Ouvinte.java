import java.util.ArrayList;

public class Ouvinte extends Usuario{
    private ArrayList<String> playlist;
    private int musicasCurtidas;
    private String senha;

    public Ouvinte(String nome, String email, String senha) {
        super(nome, email);
        this.senha = senha;
        this.playlist = new ArrayList<>();
        this.musicasCurtidas = 0;
    }


    public int getMusicasCurtidas() {
        return musicasCurtidas;
    }

    public void curtirMusica() {
        musicasCurtidas++;
    }


    public void adicionarMusica(String musica) {
        playlist.add(musica);
        System.out.println("Música \"" + musica + "\" foi adicionada à sua playlist");
    }
    public void verInformacoes() {
        super.verInformacoes();
        System.out.println("Número de músicas na playlist: " + playlist.size());
        System.out.println("Número de músicas curtidas: " + musicasCurtidas);
    }
}


