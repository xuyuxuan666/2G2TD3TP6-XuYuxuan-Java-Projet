import java.awt.*;

public class Rectangle extends Figure {
    protected int longueur;
    protected int largeur;

    public Rectangle(int longueur, int largeur, Color color) {
        super(new Point(0, 0), color);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(int i, int j) {
        super();
    }

    public Rectangle() {
    }

    public double getPerimetre() {
        return 2 * longueur + 2 * largeur;
    }

    public double getSurface() {
        return longueur * largeur;
    }

    @Override
    public void setBoundingBox(int largeurb, int hauteurb) {
        longueur = largeurb;
        largeur = hauteurb;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(origine.x, origine.y, longueur, largeur);
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public String toString() {
        String out = "+";
        for (int i = 0; i < longueur; i++) {
            out += "--";
        }
        out += "+\n";
        for (int i = 0; i < largeur; i++) {
            out += "|";
            for (int j = 0; j < longueur; j++) {
                out += "  ";
            }
            out += "|\n";
        }
        out += "+";
        for (int i = 0; i < longueur; i++) {
            out += "--";
        }
        out += "+";
        return out;
    }
}
