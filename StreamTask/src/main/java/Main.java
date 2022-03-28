import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    List<Person> list = new ArrayList<>() {{
        add(new Person("Kasia", "Kaczmarek", 15));
        add(new Person("Zosia", "Zosiewicz", 25));
        add(new Person("Bartek", "Dziadosz", 35));
        add(new Person("Ukasz", "Lecz", 45));
        add(new Person("Bartek", "Dziadczyk", 21));
        add(new Person("Kacper", "Kaczmarek", 43));
        add(new Person("Mateusz", "Mateuszczykl", 43));
    }};

    public static List<String> findShortSurnames (final List<Person> list) {
        return list.stream()
                .map(Person::getSurname)
                .filter(str -> str.length() >5)
                .collect(Collectors.toList());
    }

    private static Double getAvgAge(List<Person> list) {
        return list.stream()
                .mapToDouble(Person::getAge)
                .average()
                .getAsDouble();
    }

    private static Double getAvgAgeOfPplUnder30 (List<Person> list){
        return list.stream()
                .mapToDouble(Person::getAge)
                .filter(a -> a < 30)
                .average()
                .getAsDouble();
    }

    private static String getFirstPersonStaringWithD (List<Person> list) {
        return list.stream()
                .map(Person::getSurname)
                .filter(name -> name.startsWith("D"))
                .findFirst().orElse("There's no name staring with D");
    }

    private static List<String> checkIfBartekOrKrzysztofExisist(List<Person> list) {
        return list.stream()
                .map(Person::getName)
                .filter(name -> name.contains("Bartek"))
                .filter(name -> name.contains("Krzysztof"))
                .collect(Collectors.toList());
    }

    public static void main(final String[] args) {
        Main main = new Main();
        List<Person> list = main.list;

        List<String> shortSurnames = findShortSurnames(list);
        System.out.println(shortSurnames);

        double avgAge = getAvgAge(list);
        System.out.println("avg age is " + avgAge);

        double avgAgeUnderThirty = getAvgAgeOfPplUnder30(list);
        System.out.println("avg age of people under 30 is: " + avgAgeUnderThirty);

        String firstNameWithDLetter = getFirstPersonStaringWithD(list);
        System.out.println("first surname starting with D is: " + firstNameWithDLetter);

        List<String> checkNamesBartekOrKrzysztof = checkIfBartekOrKrzysztofExisist(list);
        System.out.println(checkNamesBartekOrKrzysztof);
    }
}
/*
        1) Zwroc liste osób które mają wiecej niż 5 liter w nazwisku. done
        2) Zwroc srednia wieku z podanych osób. done
        3) Zwroc srednia wieku z osob ktore maja mniej niż 30 lat. done
        4) Znajdz pierwsza osobe z listy której nazwisko zaczyna się na D. done
        5) Sprawdz czy jest z osoba w liscie z imieniem Bartek i Krzysztof.
        6) Zsumuj wiek osób któe mają mniej niż 26 lat.
        */

//        IntStream.range(100,200)
//                .filter(i -> i%3 ==0 && i%5 ==0)
//                .forEach(System.out::println);
//        Napisz funkcyjnie (stream) wyciągniecie z przedziału 100-200 liczb które są podzielne przez 3 i 5 jednocześnie