public class Vertex { //klasa wierzchołek
    private double x, y, dlugosc; //prywatne pola współrzędnych x i y
    public Vertex(double x, double y) { //konstruktor
        this.x = x;
        this.y = y;
        this.dlugosc = 0;
    }
    //gettery
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getDlugosc() {return dlugosc;}

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public double Dist(Vertex other) { //metoda obliczająca dystans między wierzchołkami
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
