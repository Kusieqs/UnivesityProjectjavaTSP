import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfVertices;
        do {
            System.out.println("\nPodaj liczbe wierzcholkow");
            if(scanner.hasNextInt()) {
                numberOfVertices = scanner.nextInt();  // Podanie liczby wierzcholkow
                if(numberOfVertices <= 0)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
            scanner.next();
        }while(true);
        scanner.close();

        List<Vertex> vertices = RandVertices(numberOfVertices); // lista losowo wygenerowanych wierzchołków

        System.out.println("Początkowe wierzchołki:");
        for (Vertex v : vertices) {
            System.out.println("Wierzchołek (" + v.getX() + ", " + v.getY() + ")"); //lista poczatkowych wierzcholkow
        }

        List<Vertex> P = Algorithm.TSP(vertices); //wywolanie metody TSP z klasy Algorithm, ktora zwraca optymalna droge

        System.out.println("\nOptymalna droga:");
        for (Vertex vertex : P) {
            System.out.println("Wierzchołek (" + vertex.getX() + ", " + vertex.getY() + ")\t\t(Odleglosc od poprzedniego wierzcholka: " + vertex.getDlugosc() + ")"); //lista optymalnej drogi
        }
    }
    private static List<Vertex> RandVertices(int numberOfVertices) { //metoda tworzenia listy losowych wierzchołków
        List<Vertex> vertices = new ArrayList<>(); //lista wierzchołków
        Random random = new Random(); //inicjalizacja obiektu klasy Random

        for (int i = 0; i < numberOfVertices; i++) { //dodawanie losowych wierzchołków do listy
            double x = random.nextDouble() * 10; // losowe x od 0 do 10
            double y = random.nextDouble() * 10; // losowe y od 0 do 10
            vertices.add(new Vertex(x, y));
        }
        return vertices; //zwrócenie listy wierzchołków
    }

}