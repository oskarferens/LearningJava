import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Podaj nazwe pliku");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Path pathToFile = Path.of("C:/Users/oskar/IdeaProjects/JavaClass/FileLineCounter/Files/TextFiles/" + path);
        System.out.println(pathToFile.getFileName());

        try (Stream <String> stream = lines(pathToFile)){
            System.out.println(stream.count());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//        C:\Users\oskar\IdeaProjects\JavaClass\FileLineCounter\Files\XDDD\example.txt
//        Stwórz program który zliczy liczbę linii tekstu dla wszystkich plików w wskazanym folderze
//        Wynikiem powinna być lista plików wraz z informacją o liczbie linii oraz suma wszystkich linii w folderze.
//        Generalnie wypakuj i wrzuć do classpath

//        Procesowanie plikow
//        instancja klasy
//        program sie zaczyna i wyswietla sie komunikat "podaj sciezke do folderu, ktory ma byc przeskanowany"
//        ten plik musze patha skopiowac.
//        ZROBIC sama metode ktora procesuje linijki, ktora na sztywno sprawdzi jakas sciezke string path = nazwa ciezki
//        i z tego patha zrobic plik i sprawdzac  czy ten plik istnieje lub przejsc od razu do czytania linije
//
//        STAGE 2 dodac petle
//        ktora czeka az wprowadze nazwe pliku i patrzylbym qwteey czy ten plik jestw  pathie
//        dopisac obsluge bledow, wyjatki, plik nie istnieje itp