import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ListarUsuarios extends JFrame {
    private JTextArea usuariosTextArea;

    public ListarUsuarios() {
        setTitle("Lista de Usuarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JButton verUsuariosRegistradosButton = new JButton("Ver Usuarios Registrados");
        verUsuariosRegistradosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarUsuariosRegistrados();
            }
        });

        JButton proyectoIntegradorButton = new JButton("Proyecto Integrador");
        proyectoIntegradorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarProyectoIntegrador();
            }
        });

        JButton registrarUsuariosButton = new JButton("Registrar Usuarios");
        registrarUsuariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarUsuarios();
            }
        });

        JButton volverButton = new JButton("Volver");
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volver();
            }
        });

        panel.add(verUsuariosRegistradosButton);
        panel.add(proyectoIntegradorButton);
        panel.add(registrarUsuariosButton);
        panel.add(volverButton);

        usuariosTextArea = new JTextArea();
        usuariosTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(usuariosTextArea);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void registrarUsuarios() {
        String usuario, contraseña;
        do {
            usuario = JOptionPane.showInputDialog("Ingrese el usuario (o deje vacío para terminar):");
            if (usuario != null && !usuario.isEmpty()) {
                contraseña = JOptionPane.showInputDialog("Ingrese la contraseña para el usuario '" + usuario + "':");
                if (contraseña != null) {
                    agregarUsuario(usuario, contraseña);
                }
            }
        } while (usuario != null && !usuario.isEmpty());
    }

    private void agregarUsuario(String usuario, String contraseña) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            writer.write(usuario + "," + contraseña);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void volver() {
        dispose();
        LoginVentana loginVentana = new LoginVentana();
        loginVentana.setVisible(true);
    }

    private void mostrarUsuariosRegistrados() {
        usuariosTextArea.setText("");

        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                usuariosTextArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarProyectoIntegrador() {
        ProyectoIntegrador ventanaProyecto = new ProyectoIntegrador();
        ventanaProyecto.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListarUsuarios ventana = new ListarUsuarios();
                ventana.setVisible(true);
            }
        });
    }
}
