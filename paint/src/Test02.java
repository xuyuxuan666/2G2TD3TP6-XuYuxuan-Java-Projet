import java.awt.*;

public class Test02 {
    public static void main(String[] args) {
        /*Test Point*/
        Point p1 = new Point(6, 6);

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        /*Test Rectangle*/
        Rectangle r3 = new Rectangle(10, 3);
        System.out.println(r3);

        /*Test Carre*/
        Carre C1 = new Carre(2);
        System.out.println(C1);
        C1.setLargeur(8);
        System.out.println(C1);
        C1.setLongueur(4);
        System.out.println(C1);

        /*Test Ellipse*/
        Ellipse E1 = new Ellipse(2);
        System.out.println("Ellipse=(" + E1.AxeVertical + "," + E1.AxeHorizontal + "): perimetre:" + E1.getPerimetre() + ",surface:" + E1.getSurface());

        /*Test Cercle*/
        Color color = null;
        Cercle T1 = new Cercle(2, color);
        System.out.println("Cercle=(" + T1.AxeVertical + "," + T1.AxeHorizontal + "): perimetre:" + T1.getPerimetre() + ",surface:" + T1.getSurface());
        T1.setAxeVertical(4);
        System.out.println("Cercle=(" + T1.AxeVertical + "," + T1.AxeHorizontal + "): perimetre:" + T1.getPerimetre() + ",surface:" + T1.getSurface());
        T1.setAxeHorizontal(3);
        System.out.println("Cercle=(" + T1.AxeVertical + "," + T1.AxeHorizontal + "): perimetre:" + T1.getPerimetre() + ",surface:" + T1.getSurface());

        Rectangle r1 = new Carre(8);

        int n = 4;
        Figure[] rtf = new Figure[n];

        for (int i = 0; i < n; i++) {
            double r = Math.random() * 4;

            if (r < 1) {
                rtf[i] = new Cercle(1, color);
            } else if (r < 2) {
                rtf[i] = new Ellipse(1);
            } else if (r < 3) {
                rtf[i] = new Rectangle(1, 1);
            } else {
                rtf[i] = new Carre(1);
            }
            System.out.println(rtf[i].getSurface());
        }

    }
}

