import java.util.ArrayList;

public class Artista extends Usuario {
    private ArrayList<String> musicasPublicadas;

    public Artista(String nome, String email) {
        super(nome, email);
        this.musicasPublicadas = new ArrayList<>();
    }



    public void publicarMusica(String musica) {
        musicasPublicadas.add(musica);
        System.out.println("Música \"" + musica + "\" foi publicada com sucesso.");
    }

    public void removerMusica(String musica) {
        if (musicasPublicadas.remove(musica)) {
            System.out.println("Música \"" + musica + "\" foi removida.");
        } else {
            System.out.println("Música \"" + musica + "\" não encontrada.");
        }
    }

    public void verMusicasPublicadas() {
        System.out.println("\nSuas músicas publicadas:");
        if (musicasPublicadas.isEmpty()) {
            System.out.println("Nenhuma música publicada.");
        } else {
            for (String musica : musicasPublicadas) {
                System.out.println("- " + musica);
            }
        }
    }
    public void verInformacoes() {
        super.verInformacoes();
        System.out.println("Número de músicas publicadas: " + musicasPublicadas.size());
    }
}

