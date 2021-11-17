import java.awt.*;

public class Carre extends Rectangle {
    public Carre(int longueur, Color color) {
        super(longueur, longueur, color);
    }

    public Carre(int c) {
        super();
    }

    @Override
    public void setLongueur(int longueur) {
        super.setLongueur(longueur);
        super.setLargeur(longueur);
    }

    @Override
    public void setLargeur(int largeur) {
        super.setLargeur(largeur);
        super.setLongueur(largeur);
    }

    @Override
    public void setBoundingBox(int largeurBB, int hauteurBB) {
        longueur = largeur = largeurBB;
    }

}
