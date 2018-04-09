package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        
      
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar stosu ");
        int size = scanner.nextInt();

        Stos stack1 = new Stos(size);
        int whileStos=1;

        while (whileStos == 1 ) {

            System.out.println("Co chcesz zrobic ze stosem ?");
            System.out.println("1. Dodac element ");
            System.out.println("2. Usunac ze stosu ");
            System.out.println("3. Pokazac stos ");
            System.out.println("4. Pokaz rozmiar ");

            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    int elem =scanner.nextInt();
                    stack1.push(elem);
                    break;
                case 2:
                    stack1.pop();
                    break;
                case 3:
                    stack1.showStos();
                    break;
                case 4:
                    stack1.showSize();
                    break;
                default:
                    System.out.println("Niepoprawny wybor ");
            }
            System.out.println("Powtorzyc dzialanie (1 czy 0)?");
            whileStos = scanner.nextInt();
        }




//        //Zadanie 5
        System.out.println("Zadanie 5");
        System.out.println();

        int powtorkaWhile=1;
        int x =0;



        Firma firma1 = new Firma();
        while (powtorkaWhile == 1){

            System.out.println("1.Dodac pracownika ");
            System.out.println("2.Spis pracownikow ");

            x = scanner.nextInt();


            switch (x){
                case 1:
                    System.out.println("Podaj imie");
                    String imie = scanner.nextLine();
                    imie = scanner.nextLine();

                    System.out.println("Podaj nazwisko ");
                    String nazwisko = scanner.nextLine();

                    System.out.println("Podaj wiek ");
                    int wiek = scanner.nextInt();

                    System.out.println("Podaj stanowisko ");
                    String stanowisko = scanner.nextLine();
                    stanowisko = scanner.nextLine();

                    Pracownik people = new Pracownik(imie, nazwisko,wiek, stanowisko);

                    firma1.newWorking(people);
                    break;

                case 2:
                    firma1.showWorking();
                    break;

                default:
                    System.out.println("Niepoprawny nomer ");
            }
            System.out.println("Powtorzyc (1 czy 0) ?");
            powtorkaWhile=scanner.nextInt();
        }
    }
    
}
