import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {
    Dessin mondessin;
    Fenetre(String title_neam,int x,int y) {
        /* set  Fenetre */
        super(title_neam);                                               //设置窗口名称
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(10, 10);
        setSize(x,y);

        Container contentPane = getContentPane();
        /* set  Menu */
        JMenuBar pan1 = new JMenuBar();
        JMenu File = new JMenu("File");
        pan1.add(File);
        //separe d’un trait
        JMenuItem New = new JMenuItem("New");

        File.add(New);

        JMenuItem Open = new JMenuItem("Open");
        File.add(Open);

        JMenuItem Save = new JMenuItem("Save");
        File.add(Save);
        //raccourci
        Save.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));

        File.addSeparator();
        JMenuItem Quit = new JMenuItem("Quit");
        File.add(Quit);

        JMenu APropos = new JMenu("A propos");
        pan1.add(APropos);
        JMenuItem Others = new JMenuItem("Others");
        APropos.add(Others);
        //

        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Quit.addActionListener(this);
        Others.addActionListener(this);

        mondessin = new Dessin();
        contentPane.add(mondessin);
        /* set  bouton color*/

        JPanel panne = new JPanel();

        JPanel pancolor = new JPanel();
        pancolor.setLayout(new GridLayout(2, 4));
        JButton noir = new JButton("Noir");
        noir.setBackground(Color.BLACK);             pancolor.add(noir);
        JButton rouge = new JButton("Rouge");
        rouge.setBackground(Color.RED);              pancolor.add(rouge);
        JButton vert = new JButton("Vert");
        vert.setBackground(Color.GREEN);             pancolor.add(vert);
        JButton bleu = new JButton("Bleu");
        bleu.setBackground(Color.BLUE);              pancolor.add(bleu);
        JButton jaune = new JButton("Jaune");
        jaune.setBackground(Color.YELLOW);           pancolor.add(jaune);
        JButton rose = new JButton("Rose");
        rose.setBackground(Color.PINK);               pancolor.add(rose);
        JButton magenta = new JButton("Magenta");
        magenta.setBackground(Color.MAGENTA);        pancolor.add(magenta);
        JButton orange = new JButton("Orange");
        orange.setBackground(Color.ORANGE);          pancolor.add(orange);

        rouge.addActionListener(this);
        vert.addActionListener(this);
        bleu.addActionListener(this);
        jaune.addActionListener(this);
        rose.addActionListener(this);
        magenta.addActionListener(this);
        orange.addActionListener(this);
        noir.addActionListener(this);
        /* set les bouton*/

        JPanel panoutil = new JPanel();
        panoutil.setLayout(new GridLayout(2, 2));
        JButton Ellipse = new JButton("Ellipse");
        JButton Cercle = new JButton("Cercle");
        JButton Carre = new JButton("Carre");
        JButton Rectangle = new JButton("Rectangle");
        panoutil.add(Rectangle);
        panoutil.add(Ellipse);
        panoutil.add(Cercle);
        panoutil.add(Carre);

        Rectangle.addActionListener(this);
        Ellipse.addActionListener(this);
        Cercle.addActionListener(this);
        Carre.addActionListener(this);

        contentPane.add(panne, "South");
        panne.add(pancolor);
        panne.add(panoutil);
        setJMenuBar(pan1);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String com = e.getActionCommand();

        if (com.equals("Quit")) {
            System.exit(0);
        } else if (com.equals("Noir")) {
            mondessin.setColor(Color.BLACK);
            System.out.println("You clicked " + com);
        } else if (com.equals("Rouge")) {
            mondessin.setColor(Color.RED);
        } else if (com.equals("Vert")) {
            mondessin.setColor(Color.GREEN);
        } else if (com.equals("Jaune")) {
            mondessin.setColor(Color.YELLOW);
        } else if (com.equals("Bleu")) {
            mondessin.setColor(Color.BLUE);
        } else if (com.equals("Magenta")) {
            mondessin.setColor(Color.MAGENTA);
        } else if (com.equals("Orange")) {
            mondessin.setColor(Color.ORANGE);
        } else if (com.equals("Rose")) {
            mondessin.setColor(Color.PINK);
        } else if (com.equals("Ellipse")) {
            mondessin.setFigureName("Ellipse");
            System.out.println("You clicked " + com);
        } else if (com.equals("Rectangle")) {
            mondessin.setFigureName("Rectangle");
        } else if (com.equals("Cercle")) {
            mondessin.setFigureName("Cercle");
        } else if (com.equals("Carre")) {
            mondessin.setFigureName("Carre");
        } else if (com.equals("New")) {
            mondessin.liste.clear();
            repaint();
        } else if (com.equals("Others")) {
            JOptionPane others = new JOptionPane();
        } else {
            System.out.println("You clicked " + com);
        }
    }


}




