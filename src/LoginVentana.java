import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoginVentana extends JFrame {
    private JTextField usuarioField, contraseñaField;
    private JLabel mensajeLabel;

    public LoginVentana() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Usuario:"));
        panel.add(usuarioField = new JTextField());
        panel.add(new JLabel("Contraseña:"));
        panel.add(contraseñaField = new JPasswordField());


        panel.add(new JLabel());
        panel.add(new JLabel("<html><font size='2'>Autores<br>Luis Javier Alvarez Sanchez<br>Willian Anaya Gonzales</font></html>"));

        JButton iniciarSesionButton = new JButton("Iniciar Sesión");
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarCredenciales();
            }
        });

        JButton registrarButton = new JButton("Registrar");
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaRegistro();
            }
        });

        mensajeLabel = new JLabel();
        mensajeLabel.setForeground(Color.RED);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(iniciarSesionButton);
        buttonPanel.add(registrarButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(mensajeLabel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void verificarCredenciales() {
        String usuario = usuarioField.getText();
        String contraseña = contraseñaField.getText();

        if (verificarEnArchivo(usuario, contraseña)) {
            mensajeLabel.setText("Inicio de sesión exitoso");
            mensajeLabel.setForeground(Color.GREEN);

            abrirVentanaListarUsuarios();
        } else {
            mensajeLabel.setText("Error: Usuario o contraseña incorrectos");
            mensajeLabel.setForeground(Color.RED);
        }
    }

    private boolean verificarEnArchivo(String usuario, String contraseña) {
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datos = line.split(",");
                if (datos.length == 2 && datos[0].equals(usuario) && datos[1].equals(contraseña)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void mostrarVentanaRegistro() {
        RegistroVentana ventanaRegistro = new RegistroVentana();
        ventanaRegistro.setVisible(true);

        dispose();
    }

    private void abrirVentanaListarUsuarios() {
        ListarUsuarios listarUsuarios = new ListarUsuarios();
        listarUsuarios.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginVentana ventana = new LoginVentana();
                ventana.setVisible(true);
            }
        });
    }
}
