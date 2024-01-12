import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Algorithm {
    public static List<Vertex> TSP(List<Vertex> K) { //metoda TSP-Traveling Salesman Problem
        List<Vertex> P = new ArrayList<>(); // tworzymy zbior P
        Random random = new Random(); // inicjalizacja obiektu klasy Random

        while (!K.isEmpty()) { // ponawiaj tak dluugo, dopoki sa wierzcholki w K
            // wylosuj dowolny wierzchołek ze zbioru K, wpisz do zbioru P i usuń z K
            int index = random.nextInt(K.size());
            Vertex w = K.remove(index);
            P.add(w);

            double najmn = Double.MAX_VALUE; // najmniejsza odległość
            int najbindex = -1; // najbliższy index

            // wybierz wierzchołek z K znajdujący się najbliżej wcześniej wybranego wierzchołka
            for (int i = 0; i < K.size(); i++) { //ponawiaj tak długo, dopóki są wierzchołki w K
                double dystans = w.dist(K.get(i)); //wyznacz łączną trasę
                if (dystans < najmn) {
                    najmn = dystans;
                    najbindex = i;
                }
            }
            w = K.remove(najbindex); //usun wybrany wierzcholek z K
            P.add(w); //wpisz do P
        }
        return P; //zwroc optymalna droge
    }
}
