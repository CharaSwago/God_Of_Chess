import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        String j1, j2; // declaration des variables Joueur 1 et Joueur 2
        int longueur,Largeur; // Declaration des variables de la longueur et de la Largeur de notre grille

        Scanner myObj = new Scanner(System.in);  // Créer un scan de l'objet

        System.out.println("le pseudo du joueur 1 ?");
        j1 = myObj.nextLine();  // lecture du pseudo du joueur 1

        System.out.println("le pseudo du joueur 2 ?");
        j2 = myObj.nextLine();    // lecture du pseudo du joueur 2

        MenuCommencement(); // invocation d'une function pour commencer le jeu
    }
    public static void RegleMenu(){
        Scanner scanner = new Scanner(System.in);
                // tous les choix disponible
            System.out.println("Sélectionnez une action :");
            System.out.println("1. Retour au menu principal !");
            System.out.println("2. Reprendre la partie !");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1: // choix 1 on retourne au menu de base
                    MenuCommencement();
                    break;
                case 2: // choix 2 on retourne a notre games si on est en games et sinon ça nous retourne au menu si on est au menu
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                default: // choix par defaut si on choisie quelque chose de non valide
                    System.out.println("Choix non valide. Veuillez sélectionner une action valide.");
            }

    }
    public static void MenuCommencement(){
        Scanner scanner = new Scanner(System.in);

            // affichage de tous les choix possible
            System.out.println("Sélectionnez une action :");
            System.out.println("1. Regle du jeu !");
            System.out.println("2. Nouvelle Partie !");
            System.out.println("3. Charger une sauvegarde !");
            System.out.println("4. Quitter");

            int choix = scanner.nextInt(); // lecture de notre choix

            switch (choix) {
                case 1: // choix 1 affiche les regles et invoque la function regle menu
                    System.out.println("Les Regles du jeu :");

                    System.out.println("Pendant son tour un joueur peut déplacer son pion d’une case ");
                    System.out.println("(verticalement ou horizontalement), puis il détruit une case du plateau.");
                    System.out.println("Le dernier joueur pouvant encore se déplacer gagne.");
                    RegleMenu();
                    // Ajoutez ici le code correspondant à l'Action 1
                    break;
                case 2: // choix 2 créer une nouvelle partie
                    System.out.println("Nouvelle partie ...");
                    // Ajoutez ici le code correspondant à l'Action 2
                    break;
                case 3: // choix 3 charge une partie déjà sauvegarder
                    System.out.println("Chargement d'une sauvegarde");
                    // Ajoutez ici le code correspondant à l'Action 2
                    break;
                case 4: // choix 4 quitte le jeu
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                default: // choix par defaut si vous mettez quelque chose de pas valide
                    System.out.println("Choix non valide. Veuillez sélectionner une action valide.");
            }

    }


}