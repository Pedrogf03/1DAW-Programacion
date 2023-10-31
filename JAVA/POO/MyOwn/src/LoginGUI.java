import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {

    JFrame frame;
    JPanel panel;
    JTextField userText;
    String usuario = "Pedro";
    JPasswordField passwordText;
    String passwd = "123456";

    public LoginGUI(){
        // Se crea un marco.
        frame = new JFrame("Iniciar Sesión");
        // Se especifica el ancho y alto del marco.
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * Se crea un panel. Esto es igual que la etiqueta DIV en HTML.
         * Podemos crear varios paneles y añadirlos a posiciones
         * especificas en un JFrame. Dentro de los paneles podemos
         * añadir texto, campos, botones y otros componentes.
         */
        panel = new JPanel();
        // Se añade el panel al marco.
        frame.add(panel);

        /*
         * Se llama a un método definido por el usuario para
         * añadir componentes al panel.
         */
        placeComponents(panel);

        // Se pone que el marco sea visible.
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {

        panel.setLayout(null);

        // Se crea un label.
        JLabel userLabel = new JLabel("Usuario");

        /*
         * Este método especifica la localización y tamaño
         * de un componente. setBounds(x, y, width, length).
         * Aquí, (x, y) son coordenadas desde la esquina
         * superior izquierda. Los otros dos argumentos
         * indican el ancho y el alto de los componentes.
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /*
         * Se crea un campo de texto donde el usuarios
         * introduce el nombre.
         */
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Lo mismo para la contraseña.
        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*
         * Esto es similar al campo de texto, pero esconde el
         * texto que el usuario introduce.
         */
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // Se crea un botón de login.
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(10, 80, 150, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);
    }

    private void placeComponents2(JPanel panel) {

        panel.setLayout(null);
        JLabel label2 = new JLabel("Has iniciado sesion correctamente.");
        label2.setBounds(10,20,500,25);
        panel.add(label2);
    }

    public static void main(String[] args) {
        new LoginGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        JFrame frame2 = new JFrame("Iniciar Sesión");
        frame2.setSize(350, 200);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel2 = new JPanel();
        frame2.add(panel2);
        placeComponents2(panel2);
        frame2.setVisible(true);
    }
}
