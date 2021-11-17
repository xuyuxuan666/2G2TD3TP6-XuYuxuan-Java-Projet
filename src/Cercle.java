import java.awt.*;

public class Cercle extends Ellipse {
    public Cercle(int i) {
        super(i);
    }
    public Cercle(int x, Color color) {
        super(x, x, color);
    }
    public void setAxeHorizontal(int diametre) {
        super.setAxeVertical(diametre);
        super.setAxeHorizontal(diametre);
    }

    public void setAxeVertical(int diametre) {
        super.setAxeHorizontal(diametre);
        super.setAxeVertical(diametre);
    }

    public void setBoundingBox(int hauteurBB, int largeurBB) {
        AxeVertical = AxeHorizontal = hauteurBB;
    }
}
