import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("current temp = " + number + "°C");
    }
}

/*
    Napisz funkcyjnie (stream) wyciągniecie z przedziału 100-200 liczb które są podzielne przez 3 i 5 jednocześnie
        3)	Klimatyzator -> stwórz implementację klimatyzatora który umożliwia zbijanie temperatury w pokoju, w pokoju jest możliwy zakres temperatur 19-35C
        - Nieprawidłowa wartość pokoju powinna zostać odnotowana w logach a działanie programu przerwane
        - Użytkownik powinien widzieć aktualną temperaturę po każdym wyborze programu
        - Użytkownik może obniżyć temperaturę w funkcji cool (-1), super-cool (-2) albo custom i wybrać ilość do której ma spadać temperatura
        - Dla chętnych jak masz dużo czasu, możesz symulować spadek temperatury po każdej sekundzie,
         każda zmiana o 1 stopień powinna być odczuwalna w czasie rzeczywistym i po każdej zmianie powinna być ustawiona aktualna temperatura
*/
