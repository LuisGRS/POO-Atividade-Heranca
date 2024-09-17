import java.util.Scanner;

public class Main {
    private static Ouvinte ouvinte = new Ouvinte("marina", "marina@email.com", "12345");
    private static Artista artista = new Artista("eterno mc kevin", "esquece@email.com");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("\nGostaria de entrar como:");
            System.out.println("1. Usuário");
            System.out.println("2. Artista");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();

            if (escolha == 1) {
                menuUsuario(scanner);
            } else if (escolha == 2) {
                menuArtista(scanner);
            } else if (escolha == 3) {
                System.out.println("Saindo do sistema");
            } else {
                System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
    public static void menuUsuario(Scanner scanner) {
        int opcaoUsuario = 0;

        while (opcaoUsuario != 5) {
            System.out.println("\nMenu do Usuário:");
            System.out.println("1. Adicionar música à playlist");
            System.out.println("2. Ver quantidade de músicas curtidas");
            System.out.println("3. Ver suas informações");
            System.out.println("4. Alterar nome de usuario");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");

            opcaoUsuario = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoUsuario) {
                case 1:
                    System.out.print("\nDigite o nome da música que deseja adicionar à playlist: ");
                    String musica = scanner.nextLine();
                    ouvinte.adicionarMusica(musica);
                    ouvinte.curtirMusica();
                    break;
                case 2:
                    System.out.println("\nVocê curtiu " + ouvinte.getMusicasCurtidas() + " músicas");
                    break;
                case 3:
                    ouvinte.verInformacoes();
                    break;
                case 4:
                    System.out.print("\nDigite a novo nome: ");
                    String novoNome = scanner.nextLine();
                    ouvinte.setNome(novoNome);
                    System.out.println("Nome de usuario alterado com sucesso");
                    break;
                case 5:
                    System.out.println("Voltando para menu principal");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
    public static void menuArtista(Scanner scanner) {
        int opcaoArtista = 0;

        while (opcaoArtista != 5) {
            System.out.println("\nMenu do Artista:");
            System.out.println("1. Publicar música");
            System.out.println("2. Remover música");
            System.out.println("3. Ver músicas publicadas");
            System.out.println("4. Ver suas informações");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");

            opcaoArtista = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoArtista) {
                case 1:
                    System.out.print("\nDigite o nome da música que deseja publicar: ");
                    String musica = scanner.nextLine();
                    artista.publicarMusica(musica);
                    break;
                case 2:
                    System.out.print("\nDigite EXATAMENTE o nome da música que deseja remover: ");
                    String musicaRemover = scanner.nextLine();
                    artista.removerMusica(musicaRemover);
                    break;
                case 3:
                    artista.verMusicasPublicadas();
                    break;
                case 4:
                    artista.verInformacoes();
                    break;
                case 5:
                    System.out.println("Voltando ao menu principal");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}

