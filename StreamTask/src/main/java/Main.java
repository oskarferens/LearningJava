import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream.range(100,200)
                .filter(i -> i%3 ==0 && i%5 ==0)
                .forEach(System.out::println);


    }
    //Napisz funkcyjnie (stream) wyciągniecie z przedziału 100-200 liczb które są podzielne przez 3 i 5 jednocześnie
}
