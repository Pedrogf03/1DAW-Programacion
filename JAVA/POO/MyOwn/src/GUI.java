import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JButton button;
    private JPanel panel;

    public GUI(){
        // Se crea un marco.
        this.frame = new JFrame();
        // Se crea un botón.
        this.button = new JButton("Púlsame");
        // Hacemos que el botón cumpla una acción.
        this.button.addActionListener(this);
        // Creamos un panel.
        this.panel = new JPanel();
        // Creamos un texto.
        this.label = new JLabel("Número de clicks: 0");
        this.frame.setBounds(660,330,200,100);
        // Indicamos la anchura del borde.
        this.panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        // Indicamos el diseño del panel.
        this.panel.setLayout(new GridLayout(3,3));
        // Añadimos el texto al panel.
        this.panel.add(label);
        // Añadimos el botón al panel.
        this.panel.add(button);
        // Añadimos el panel al marco.
        this.frame.add(panel);
        // Acción por defecto al cerrar la pestaña.
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Título del marco.
        this.frame.setTitle("Mi primera GUI");
        // Se hace visible el marco.
        this.frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.count++;
        label.setText("Número de clicks: "+ this.count);
    }

    public static void main(String[] args) {
        new GUI();
    }

}
