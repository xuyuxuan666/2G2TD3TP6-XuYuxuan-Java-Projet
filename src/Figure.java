import java.awt.*;
import java.io.Serializable;

public abstract class Figure implements Serializable {
    protected Point origine;
    protected Color color;

    public Figure(Point p, Color color) {
        origine = p;
        this.color = color;
    }

    public Figure() {

    }

    public void setOrigine(Point origine) {
        this.origine = origine;
    }
    public String toString() {
        return "Figure d'origine(" + origine.getX() + "," + origine.getY() + ")\n";
    }
    public abstract double getPerimetre();

    public abstract double getSurface();

    public abstract void setBoundingBox(int largeurb, int hauteurb);

    public abstract void draw(Graphics g);

}
