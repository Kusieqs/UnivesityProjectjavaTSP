import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Algorithm {
    public static List<Vertex> TSP(List<Vertex> K) { //metoda TSP-Traveling Salesman Problem
        List<Vertex> P = new ArrayList<>(); // tworzymy zbior P
        Random random = new Random(); // inicjalizacja obiektu klasy Random
        boolean pierwszyRaz = true;

        int index = random.nextInt(K.size());  // wylosuj dowolny wierzchołek ze zbioru K, wpisz do zbioru P i usuń z K
        Vertex w1 = K.get(index); // przypisanie z listy obiektu o danym indexie
        K.remove(index); // usuniecie obiektu o danym indexie
        P.add(w1);  // dodanie obiektu do drugiej listy

        while (!K.isEmpty()) { // ponawiaj tak dluugo, dopoki sa wierzcholki w K

            double najmn = Double.MAX_VALUE; // najmniejsza odległość
            int najbindex = -1; // najbliższy index

            // wybierz wierzchołek z K znajdujący się najbliżej wcześniej wybranego wierzchołka
            for (int i = 0; i < K.size(); i++) { //ponawiaj tak długo, dopóki są wierzchołki w K
                double dystans = w1.dist(K.get(i)); //wyznacz łączną trasę
                if (dystans < najmn) {
                    najmn = dystans;
                    najbindex = i;
                }
            }
            w1 = K.get(najbindex);
            w1.setDlugosc(najmn);
            K.remove(najbindex);//usun wybrany wierzcholek z listy K
            P.add(w1); //wpisanie obiektu do nowej listy
        }
        return P; //zwroc optymalna droge
    }
}
