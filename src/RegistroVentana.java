import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroVentana extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField usuarioField, contraseñaField;

    public RegistroVentana() {
        setTitle("Registro de Usuarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Usuario");
        tableModel.addColumn("Contraseña");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Usuario:"));
        inputPanel.add(usuarioField = new JTextField());
        inputPanel.add(new JLabel("Contraseña:"));
        inputPanel.add(contraseñaField = new JPasswordField());

        JButton registrarButton = new JButton("Registrar");
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarUsuario();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(registrarButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void agregarUsuario() {
        String usuario = usuarioField.getText();
        String contraseña = contraseñaField.getText();

        tableModel.addRow(new String[]{usuario, contraseña});

        escribirEnArchivo(usuario, contraseña);
        cerrarYAbrirVentanaInicioSesion();
    }

    private void escribirEnArchivo(String usuario, String contraseña) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            writer.write(usuario + "," + contraseña);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al escribir en el archivo de usuarios: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cerrarYAbrirVentanaInicioSesion() {
        dispose();
        LoginVentana ventanaInicioSesion = new LoginVentana();
        ventanaInicioSesion.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RegistroVentana ventana = new RegistroVentana();
                ventana.setVisible(true);
            }
        });
    }
}
