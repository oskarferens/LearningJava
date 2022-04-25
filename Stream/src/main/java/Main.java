import java.util.InputMismatchException;
import java.util.Scanner;
import Exception.TooLowTempException;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(25);

        boolean working = true;

        while (working) {
            System.out.println("choose an option");
            System.out.println("1 - cool");
            System.out.println("2 - supercool");
            System.out.println("3 - custom");
            System.out.println("0 - exit");
            Scanner scan = new Scanner(System.in);
            try {
                int userInput = scan.nextInt();
                switch(userInput) {
                    case 1: room.cool();
                        break;
                    case 2: room.superCool();
                        break;
                    case 3: room.customCool(scan);
                        break;
                    case 4: working = false;
                        break;
                }
                room.tempChecker();
            }
            catch (InputMismatchException | TooLowTempException e) {
                System.out.println("not a number");
            }
        }
        room.abc();
    }
}
/*
  3)	Klimatyzator -> stwórz implementację klimatyzatora który umożliwia zbijanie temperatury w pokoju, w pokoju jest możliwy zakres temperatur 19-35C
  - Nieprawidłowa wartość pokoju powinna zostać odnotowana w logach a działanie programu przerwane
  - Użytkownik powinien widzieć aktualną temperaturę po każdym wyborze programu
  - Użytkownik może obniżyć temperaturę w funkcji cool (-1), super-cool (-2) albo custom i wybrać ilość do której ma spadać temperatura
  - Dla chętnych jak masz dużo czasu, możesz symulować spadek temperatury po każdej sekundzie,
każda zmiana o 1 stopień powinna być odczuwalna w czasie rzeczywistym i po każdej zmianie powinna być ustawiona aktualna temperatura
Wydzielic do metod i wywolywac metody na obiektach.
enumy tutoorial - na pozniej
nieskonczona petla, zeby program dzialal przez caly czas. - zrobione while
Ogaarnac gitIgnore zeby nie wrzucac build -- zrobione
key shortcuts do code block
alt + enter
master - feature branch
Amigos code, kursy
*/
