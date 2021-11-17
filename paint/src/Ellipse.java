import java.awt.*;

public class Ellipse extends Figure {
    protected int AxeVertical;
    protected int AxeHorizontal;
    final double pi = Math.PI;
    public Ellipse(int AxeVertical, int AxeHorizontal, Color color) {
        super(new Point(0, 0), color);
        this.AxeVertical = AxeVertical;
        this.AxeHorizontal = AxeHorizontal;
    }
    public Ellipse(int i) {
    }

    public void setAxeVertical(int gaxe) {
        this.AxeVertical = gaxe;
    }

    public void setAxeHorizontal(int paxe) {
        this.AxeHorizontal = paxe;
    }

    public double getPerimetre() {
        return 2 * pi * Math.sqrt((Math.pow(AxeVertical, 2) + Math.pow(AxeHorizontal, 2)) / 2);
    }

    public double getSurface() {
        return pi * AxeVertical * AxeHorizontal / 4;
    }

    @Override
    public void setBoundingBox(int largeurb, int hauteurb) {
        AxeHorizontal = largeurb;
        AxeVertical = hauteurb;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(origine.x, origine.y, AxeVertical, AxeHorizontal);
    }
    public int getAxeHorizontal() {
        return AxeHorizontal;
    }
    public int getAxeVertical() {
        return AxeVertical;
    }



}
