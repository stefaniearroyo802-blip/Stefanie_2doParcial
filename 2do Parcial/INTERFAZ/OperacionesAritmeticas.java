 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class OperacionesAritmeticas {
    private Frame fr_Ventana;
    private JLabel lblInstruccion, lblNum1, lblNum2, lblResultado;
    private JTextField jtfNum1, jtfNum2, jtfResultado;
    private JButton bSumar, bCerrar;
    private  Panel pnlSuperior, pnlCentral, pnlInferior;
    

    public OperacionesAritmeticas (){
        fr_Ventana=new Frame("Operaciones Aritmeticas");
        pnlSuperior = new Panel();
        pnlCentral = new Panel();
        pnlInferior = new Panel();

        lblInstruccion=new JLabel("<html>Ingresa dos números y da clic en el boton suma para realizar la operación</html>");
        lblNum1=new JLabel("Número A:");
        lblNum2=new JLabel("Número B:");
        lblResultado= new JLabel("Resultado; ");

        jtfNum1 = new JTextField(5);
        jtfNum2 = new JTextField(5);
        jtfResultado = new JTextField(10);

        bSumar = new JButton("Sumar");
        bCerrar = new JButton("Cerrar");
    }

    public void acomodarEnVentana(){

        bSumar.addActionListener(new ManejadorBotonSumar());
        bCerrar.addActionListener(new ManejadorBotonCerrar());

        fr_Ventana.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(-1);
            }
        });


        pnlSuperior.add(lblInstruccion);
        fr_Ventana.add(pnlSuperior, BorderLayout.NORTH);

        
        pnlCentral.setLayout(new GridLayout(3, 2));
        pnlCentral.add(lblNum1);
        pnlCentral.add(lblNum2);
        pnlCentral.add(lblResultado);
        pnlCentral.add(jtfNum1);
        pnlCentral.add(jtfNum2);
        pnlCentral.add(jtfResultado);
        fr_Ventana.add(pnlCentral, BorderLayout.CENTER);

        pnlInferior.add(bSumar);
        pnlInferior.add(bCerrar);
        fr_Ventana.add(pnlInferior, BorderLayout.SOUTH);

        fr_Ventana.setSize(500, 300);
        fr_Ventana.setVisible(true);
    }

    class ManejadorBotonSumar implements ActionListener{
      
      @Override  
        public void actionPerformed(java.awt.event.ActionEvent actionEvent){
            double num1, num2, resultado;

        num1 = Double.valueOf(jtfNum1.getText());
        num2 = Double.valueOf(jtfNum2.getText());
        
        resultado = num1 + num2;

        jtfResultado.setText(String.valueOf(resultado)); //GENERALIZA
        jtfResultado.setText(Double.toString(resultado));  //ESPECIFICA


       }

    }

    class ManejadorBotonCerrar implements ActionListener{
      
      @Override  
        public void actionPerformed(java.awt.event.ActionEvent actionEvent){    
            System.exit(-1);
        }

        }



    public static void main(String[] args) {
        OperacionesAritmeticas iguOperaciones = new OperacionesAritmeticas();
        iguOperaciones.acomodarEnVentana();
    }
   
}

