import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Dessin extends JPanel implements MouseMotionListener, MouseListener {
    private static final long seriaVersionUID = 1L;
    ArrayList<Figure> liste = new ArrayList<Figure>();
    protected Color color;
    protected String nomFigure;
    protected int x;
    protected int y;

    public Dessin() {
        super();
        this.liste = new ArrayList<Figure>();
        this.color = Color.BLACK;
        this.nomFigure = "Rectangle";
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFigureName(String figureName) {
        this.nomFigure = figureName;
    }

    public ArrayList<Figure> getList() {
        return this.liste;
    }

    public void setList(ArrayList<Figure> list) {
        this.liste = list;
    }


    public int sizeList() {
        int i;
        i = liste.size();
        return i;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Figure f : liste) {
            f.draw(g);
        }
    }
    public void mouseDragged(MouseEvent mouseEvent) {

        int x0 = liste.get(liste.size() - 1).origine.getX();
        int y0 = liste.get(liste.size() - 1).origine.getY();
        liste.get(liste.size() - 1).setBoundingBox(mouseEvent.getX() - x0, mouseEvent.getY() - y0);

        repaint();
    }

    public void mouseMoved(MouseEvent mouseEvent) {
    }


    public void mouseClicked(MouseEvent mouseEvent) {
        this.x = mouseEvent.getX();
        this.y = mouseEvent.getY();
        System.out.println("Nouvelle figure de type" + nomFigure + "de couleur" + color + "au pooint" + x + "," + y);
    }

    public void mouseEntered(MouseEvent mouseEvent) {
    }

    public void mouseExited(MouseEvent mouseEvent) {
    }

    public void mousePressed(MouseEvent mouseEvent) {
        /*this.x = mouseEvent.getX();
        this.y = mouseEvent.getY();
        System.out.println("Nouvelle figure de type" + nomFigure + "de couleur" + color + "au pooint" + x + "," + y);
        switch (nomFigure){
            case "Carre":liste.add(new Carre(0, color));
                break;
            case "Rectangle":liste.add(new Rectangle(0, 0, color));
                break;
            case "Cercle":liste.add(new Cercle(0, color));
                break;
            case "Ellipse":liste.add(new Ellipse(0, 0, color));
                break;
        }*/
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        Point p = new Point(x, y);
        System.out.println(nomFigure + " " + color + " " + x + " " + y);
        Figure f;
        if (nomFigure.equals("Rectangle")) {
            f = new Rectangle(0, 0, color);
            f.setOrigine(p);
            liste.add(f);
        } else if (nomFigure.equals("Carre")) {
            f = new Carre(0, color);
            f.setOrigine(p);
            liste.add(f);
        } else if (nomFigure.equals("Ellipse")) {
            f = new Ellipse(0, 0, color);
            f.setOrigine(p);
            liste.add(f);
        } else if (nomFigure.equals("Cercle")) {
            f = new Cercle(0, color);
            f.setOrigine(p);
            liste.add(f);
        }
    }
    public void mouseReleased(MouseEvent mouseEvent) {
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        int x0 = liste.get(liste.size() - 1).origine.getX();
        int y0 = liste.get(liste.size() - 1).origine.getY();
        liste.get(liste.size() - 1).setBoundingBox(x - x0, y - y0);
        System.out.println(x0 + " " + y0 + " " + x + " " + y);
        repaint();
    }
}



