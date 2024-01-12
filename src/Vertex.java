public class Vertex { //klasa wierzchołek
    private double x, y; //prywatne pola współrzędnych x i y
    public Vertex(double x, double y) { //konstruktor
        this.x = x;
        this.y = y;
    }
    //gettery
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double dist(Vertex other) { //metoda obliczająca dystans między wierzchołkami
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
