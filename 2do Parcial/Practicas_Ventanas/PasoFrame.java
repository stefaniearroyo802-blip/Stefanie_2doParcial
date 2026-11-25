import java.awt.*;
import java.awt.event.*;

class PasoFrame extends Frame {
    Frame vent1, vent2;
    Button bUno, bDos, bSalir;

    public PasoFrame() {
        bSalir = new Button("Salir");
        bSalir.setBounds(150, 105, 100, 25);
        bSalir.setBackground(Color.red);
        bSalir.setForeground(Color.white);
        bSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        vent1 = new Frame("Esta es la ventana 1");
        vent1.setBounds((1024 / 2), (750 / 2), 400, 200);
        vent1.setBackground(Color.blue);
        vent1.setLayout(null);
        
        bUno = new Button("Ventana 2");
        bUno.setBounds(150, 75, 100, 25);
        bUno.setBackground(Color.yellow);
        bUno.setForeground(Color.black);
        
        vent1.add(bUno);
        vent1.add(bSalir);
        
        bUno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vent2.setVisible(true);
                vent1.setVisible(false);
            }
        });

        Button bSalir2 = new Button("Salir");
        bSalir2.setBounds(150, 105, 100, 25);
        bSalir2.setBackground(Color.red);
        bSalir2.setForeground(Color.white);
        bSalir2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        vent2 = new Frame("Esta es la Ventana 2");
        vent2.setBounds((1024 / 2), (750 / 2), 400, 200);
        vent2.setBackground(Color.yellow);
        vent2.setLayout(null);
        
        bDos = new Button("Ventana 1");
        bDos.setBounds(150, 75, 100, 25);
        bDos.setBackground(Color.blue);
        bDos.setForeground(Color.white);
        
        vent2.add(bDos);
        vent2.add(bSalir2);
        
        bDos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vent1.setVisible(true);
                vent2.setVisible(false);
            }
        });
        
        vent1.setVisible(true);
    }

    public static void main(String a[]) {
        PasoFrame ventana = new PasoFrame();
        ventana.validate();
    }
}