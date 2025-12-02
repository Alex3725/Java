import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BENVENUTO!!");
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;
        String newIndirizzo, newNome, newTitolo;
        int newPostiMax, newDurata, count, indice1;
        ArrayList<Cinema> listaCinema = new ArrayList<Cinema>();

        do {
            System.out.println("""
                    1)Crea un cinema
                    2)Inserisci le proiezioni
                    3)Rimuovere la proiezione
                    4)prenota un posto
                    5)annullare la prenotazione
                    0)exit
                    """);
            while (true){
                try {
                    scelta = scanner.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("inserisci un intero!");
                }
            }
            scanner.nextLine();
            switch (scelta){
                case 1:
                    System.out.println("inserisci l'indirizzo del cinema");
                    newIndirizzo = scanner.nextLine();
                    System.out.println("inserisci il nome del cinema");
                    newNome = scanner.nextLine();
                    System.out.println("inserisci i posti max");
                    newPostiMax = scanner.nextInt();
                    Cinema cinema1 = new Cinema(newIndirizzo, newPostiMax, newNome);
                    listaCinema.add(cinema1);
                    break;
                case 2:
                    if (stampaLista(listaCinema, "non ci sono cinema")){
                        Cinema cinemaSelezionato = controlloElemento(scanner, listaCinema, "inserisci l'indice di un cinema");
                        System.out.println("inserisci il titolo");
                        newTitolo = scanner.nextLine();
                        System.out.println("inserisci la durata");
                        while (true){
                            try {
                                newDurata = scanner.nextInt();
                                scanner.nextLine();
                                if (newDurata < 0) {
                                    System.out.println("inserisci una durata valida");
                                    continue;
                                }
                                break;
                            }catch (InputMismatchException e){
                                System.out.println("inserisci un intero!");
                                scanner.nextLine();
                            }
                        }

                        Proiezione proiezione1 = new Proiezione(newTitolo, newDurata);
                        cinemaSelezionato.aggiungiProiezione(proiezione1);
                    }
                    break;
                case 3:
                    if (stampaLista(listaCinema,"non ci sono proiezioni")){
                        Cinema cinemaSelezionato = controlloElemento(scanner, listaCinema,"seleziona indice del cinema a cui vuoi inserire la proiezione");
                        count = 0;
                        for(Proiezione proiezione : cinemaSelezionato.getProiezioni()){
                            System.out.println(count +") " + proiezione);
                        }
                        System.out.println("inserisci indice della proiezione che vuoi eliminare");
                        while (true){
                            try {
                                indice1 = scanner.nextInt();
                                cinemaSelezionato.rimuoviProiezione(indice1);
                                break;
                            }catch (InputMismatchException e){
                                System.out.println("inserisci un intero!");
                            }catch (ArrayIndexOutOfBoundsException e){
                                System.out.println("inserisci un indice valido");
                            }
                        }

                    }
            }



        }while (scelta != 0);
    }


    public static <T> boolean stampaLista(ArrayList<T> lista, String messaggioVuoto){
        if (lista.isEmpty()){
            System.out.println(messaggioVuoto);
            return false;
        }
        int count = 0;
        for (T elemento : lista){
            System.out.println(count + ") " + elemento);
            count++;
        }
        return true;
    }


    public static <T> T controlloElemento(Scanner scanner, ArrayList<T> lista, String messaggio){
        System.out.println(messaggio);
        T elementoSelezionato = null;
        int indice = 0;
        while (true){
            try {
                indice = scanner.nextInt();
                scanner.nextLine();
                elementoSelezionato = lista.get(indice);
                break;
            }catch (InputMismatchException e){
                System.out.println("inserisci un intero!");
                scanner.nextLine();
            }catch (IndexOutOfBoundsException x){
                System.out.println("inserisci un indice valido");
            }
        }
        return elementoSelezionato;
    }


}

 