import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>() {{
            add(new Person("Kasia", "Kaczmarek", 15));
            add(new Person("Zosia", "Zosiewicz", 25));
            add(new Person("Bartek", "Dziadosz", 35));
            add(new Person("Ukasz", "Lecz", 45));
            add(new Person("Bartek", "Dziadczyk", 21));
            add(new Person("Kacper", "Kaczmarek", 43));
            add(new Person("Mateusz", "Mateuszczykl", 43));
        }};


        list.stream()
                .map(a -> a.getSurname())
                .forEach(System.out::println);

        /*
        1) Zwroc liste osób które mają wiecej niż 5 liter w naziwsku.
        2) Zwroc srednia wieku z podanych osób.
        3) Zwroc srednia wieku z osob ktore maja mniej niż 30 lat.
        4) Znajdz pierwsza osobe z listy której nazwisko zaczyna się na D.
        5) Sprawdz czy jest z osoba w liscie z imieniem Bartek i Krzysztof.
        6) Zsumuj wiek osób któe mają mniej niż 26 lat.
        */
    }
}

//        IntStream.range(100,200)
//                .filter(i -> i%3 ==0 && i%5 ==0)
//                .forEach(System.out::println);
//        Napisz funkcyjnie (stream) wyciągniecie z przedziału 100-200 liczb które są podzielne przez 3 i 5 jednocześnie

