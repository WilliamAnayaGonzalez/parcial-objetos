import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProyectoIntegrador extends JFrame {
    public ProyectoIntegrador() {
        setTitle("RecoveryRoadmap - Proyecto Integrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JButton informacionGeneralButton = new JButton("Información General");
        informacionGeneralButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInformacionGeneral();
            }
        });

        JButton factoresRiesgoButton = new JButton("Factores de Riesgo y Protección");
        factoresRiesgoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFactoresRiesgo();
            }
        });

        JButton señalesAdvertenciaButton = new JButton("Señales de Advertencia");
        señalesAdvertenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarSeñalesAdvertencia();
            }
        });

        JButton efectosButton = new JButton("Efectos a Corto y Largo Plazo");
        efectosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarEfectos();
            }
        });

        JButton recursosAyudaButton = new JButton("Recursos de Ayuda y Tratamiento");
        recursosAyudaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarRecursosAyuda();
            }
        });

        JButton historiasButton = new JButton("Historias Personales y Testimonios");
        historiasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarHistorias();
            }
        });

        JButton leyesButton = new JButton("Leyes y Regulaciones");
        leyesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarLeyes();
            }
        });

        JButton actividadesButton = new JButton("Actividades Interactivas");
        actividadesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarActividades();
            }
        });

        panel.add(informacionGeneralButton);
        panel.add(factoresRiesgoButton);
        panel.add(señalesAdvertenciaButton);
        panel.add(efectosButton);
        panel.add(recursosAyudaButton);
        panel.add(historiasButton);
        panel.add(leyesButton);
        panel.add(actividadesButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
    }


    private void mostrarInformacionGeneral() {
        JFrame ventanaInformacionGeneral = new JFrame();
        ventanaInformacionGeneral.setTitle("Información General sobre Sustancias Psicoactivas");
        ventanaInformacionGeneral.setSize(600, 400);
        ventanaInformacionGeneral.setLocationRelativeTo(null);

        JTextArea informacionTextArea = new JTextArea();
        informacionTextArea.setEditable(false);
        informacionTextArea.setLineWrap(true);
        informacionTextArea.setWrapStyleWord(true);
        informacionTextArea.setText("Información General sobre Sustancias Psicoactivas:\n" +
                "Las sustancias psicoactivas son compuestos químicos, ya sean drogas o psicofármacos, que afectan las funciones del sistema nervioso central (SNC), incluyendo el cerebro y la médula espinal. Estas sustancias pueden alterar el estado de ánimo, modificar la percepción, inhibir el dolor y afectar la conducta. Algunas son de origen natural (como la marihuana) y otras son sintéticas (como la metanfetamina). El cerebro es especialmente susceptible a los efectos de estas sustancias debido a su compleja red de neuronas y neurotransmisores.");

        JScrollPane scrollPane = new JScrollPane(informacionTextArea);


        ventanaInformacionGeneral.add(scrollPane);
        ventanaInformacionGeneral.setVisible(true);
    }
    private void mostrarFactoresRiesgo() {
        JFrame ventanaFactoresRiesgo = new JFrame();
        ventanaFactoresRiesgo.setTitle("Factores de Riesgo y Protección");
        ventanaFactoresRiesgo.setSize(600, 400);
        ventanaFactoresRiesgo.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(235, 239, 249));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.setLayout(new BorderLayout());

        JTextArea informacionTextArea = new JTextArea();
        informacionTextArea.setEditable(false);
        informacionTextArea.setLineWrap(true);
        informacionTextArea.setWrapStyleWord(true);
        informacionTextArea.setText("Efectos a Corto Plazo:\n" +
                "- Mayor atención y disminución de la fatiga.\n" +
                "- Mayor actividad y vigilia.\n" +
                "- Disminución del apetito.\n" +
                "- Euforia y prisa.\n" +
                "- Aumento de la respiración.\n" +
                "- Latidos cardíacos rápidos y/o irregulares.\n" +
                "- Hipertermia.\n\n" +
                "Efectos a Largo Plazo:\n" +
                "- Adicción.\n" +
                "- Psicosis (paranoia, alucinaciones, actividad motora repetitiva).\n" +
                "- Cambios en la estructura y función del cerebro.\n" +
                "- Déficits en el pensamiento y habilidades motoras.\n" +
                "- Aumento de la distracción.\n" +
                "- Pérdida de memoria.\n" +
                "- Comportamiento agresivo o violento.\n" +
                "- Problemas dentales graves (caries dental severa y pérdida de dientes, conocida como “boca de metanfetamina”).\n" +
                "- Pérdida de peso.\n" +
                "- Llagas en la piel.");

        JScrollPane scrollPane = new JScrollPane(informacionTextArea);

        panel.add(scrollPane, BorderLayout.CENTER);

        ventanaFactoresRiesgo.add(panel);
        ventanaFactoresRiesgo.setVisible(true);
    }
    private void mostrarSeñalesAdvertencia() {
        JFrame ventanaSenalesAdvertencia = new JFrame();
        ventanaSenalesAdvertencia.setTitle("Factores de Riesgo y Protección");
        ventanaSenalesAdvertencia.setSize(600, 400);
        ventanaSenalesAdvertencia.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(235, 239, 249));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.setLayout(new BorderLayout());

        JTextArea informacionTextArea = new JTextArea();
        informacionTextArea.setEditable(false);
        informacionTextArea.setLineWrap(true);
        informacionTextArea.setWrapStyleWord(true);
        informacionTextArea.setText("Factores de Riesgo:\n" +
                "Individuales:\n" +
                "- Baja tolerancia a la frustración: Las personas con baja tolerancia a la frustración pueden recurrir al consumo de sustancias para escapar de situaciones difíciles.\n" +
                "- Conductas agresivas: La agresividad puede estar relacionada con el uso de sustancias como una forma de liberar tensiones.\n" +
                "- Baja autoestima: Las personas con baja autoestima pueden buscar en las drogas una forma de sentirse mejor consigo mismas.\n\n" +
                "Familiares:\n" +
                "- Consumo de sustancias por parte de padres o cuidadores: Si los miembros de la familia consumen drogas, hay un mayor riesgo de que los hijos también lo hagan.\n" +
                "- Disciplina autoritaria o sobreprotección: Ambos extremos pueden aumentar el riesgo de consumo de sustancias.\n" +
                "- Falta de supervisión parental: Cuando los padres no supervisan las actividades de sus hijos, estos pueden estar más expuestos a situaciones de riesgo.\n" +
                "- Violencia intrafamiliar: Un entorno violento puede aumentar la vulnerabilidad al consumo de drogas.\n\n" +
                "Sociales:\n" +
                "- Bajo apoyo de redes sociales: La falta de apoyo social puede llevar a buscar consuelo en las sustancias.\n" +
                "- Disponibilidad de sustancias: Cuanto más fácil sea acceder a las drogas, mayor es el riesgo.\n" +
                "- Uso de sustancias por parte de pares: La influencia de amigos o compañeros que consumen drogas puede ser significativa.\n\n" +
                "Factores de Protección:\n" +
                "- Apoyo familiar y social: Tener una red de apoyo sólida reduce el riesgo de consumo.\n" +
                "- Educación sobre los riesgos: Conocer los efectos negativos de las sustancias puede ser un factor protector.\n" +
                "- Habilidades de afrontamiento: Las personas con habilidades para manejar el estrés y las dificultades tienen menos probabilidades de recurrir a las drogas.");

        JScrollPane scrollPane = new JScrollPane(informacionTextArea);

        panel.add(scrollPane, BorderLayout.CENTER);

        ventanaSenalesAdvertencia.add(panel);
        ventanaSenalesAdvertencia.setVisible(true);
    }
    private void mostrarEfectos() {
        JFrame ventanaEfectos = new JFrame();
        ventanaEfectos.setTitle("Efectos a Corto y Largo Plazo");
        ventanaEfectos.setSize(600, 400);
        ventanaEfectos.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(173, 216, 230));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.setLayout(new BorderLayout());

        JTextArea informacionTextArea = new JTextArea();
        informacionTextArea.setEditable(false);
        informacionTextArea.setLineWrap(true);
        informacionTextArea.setWrapStyleWord(true);
        informacionTextArea.setText("Efectos a Corto Plazo:\n" +
                "- Mayor atención y disminución de la fatiga.\n" +
                "- Mayor actividad y vigilia.\n" +
                "- Disminución del apetito.\n" +
                "- Euforia y prisa.\n" +
                "- Aumento de la respiración.\n" +
                "- Latidos cardíacos rápidos y/o irregulares.\n" +
                "- Hipertermia.\n\n" +
                "Efectos a Largo Plazo:\n" +
                "- Adicción.\n" +
                "- Psicosis (paranoia, alucinaciones, actividad motora repetitiva).\n" +
                "- Cambios en la estructura y función del cerebro.\n" +
                "- Déficits en el pensamiento y habilidades motoras.\n" +
                "- Aumento de la distracción.\n" +
                "- Pérdida de memoria.\n" +
                "- Comportamiento agresivo o violento.\n" +
                "- Problemas dentales graves (caries dental severa y pérdida de dientes, conocida como 'boca de metanfetamina').\n" +
                "- Pérdida de peso.\n" +
                "- Llagas en la piel.\n");
        informacionTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
        informacionTextArea.setForeground(Color.BLACK);

        JScrollPane scrollPane = new JScrollPane(informacionTextArea);

        panel.add(scrollPane, BorderLayout.CENTER);

        ventanaEfectos.add(panel);
        ventanaEfectos.setVisible(true);
    }
    private void mostrarRecursosAyuda() {
        JFrame ventanaRecursosAyuda = new JFrame();
        ventanaRecursosAyuda.setTitle("Recursos de Ayuda y Tratamiento");
        ventanaRecursosAyuda.setSize(600, 400);
        ventanaRecursosAyuda.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(173, 216, 230));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.setLayout(new BorderLayout());

        JTextArea informacionTextArea = new JTextArea();
        informacionTextArea.setEditable(false);
        informacionTextArea.setLineWrap(true);
        informacionTextArea.setWrapStyleWord(true);
        informacionTextArea.setText("Recursos de Ayuda y Tratamiento:\n\n" +
                "Enlaces a servicios de apoyo y líneas de ayuda:\n\n" +
                "1. Línea Nacional de Prevención del Suicidio: Brinda apoyo emocional y asistencia a personas en crisis y sus seres queridos. Ofrece recursos para la prevención del suicidio.\n" +
                "   Teléfono: 1-800-273-TALK (8255)\n" +
                "   Sitio web: https://suicidepreventionlifeline.org/\n\n" +
                "2. Línea Nacional de Ayuda contra la Violencia Doméstica: Proporciona apoyo y recursos a personas afectadas por la violencia doméstica y abuso familiar.\n" +
                "   Teléfono: 1-800-799-SAFE (7233)\n" +
                "   Sitio web: https://www.thehotline.org/\n\n" +
                "Información sobre cómo buscar tratamiento y apoyar a personas que luchan contra el abuso de sustancias:\n\n" +
                "1. Substance Abuse and Mental Health Services Administration (SAMHSA): Ofrece información sobre tratamientos, recursos y servicios de prevención relacionados con el abuso de sustancias y la salud mental.\n" +
                "   Sitio web: https://www.samhsa.gov/\n\n" +
                "2. Centros de Tratamiento de Abuso de Sustancias (SAMHSA): Proporciona un directorio de instalaciones de tratamiento para el abuso de sustancias en todo Estados Unidos.\n" +
                "   Sitio web: https://www.findtreatment.samhsa.gov/\n\n" +
                "Recuerda que buscar ayuda es el primer paso hacia la recuperación. No estás solo y hay recursos disponibles para brindarte apoyo en tu camino hacia una vida saludable y sobria.\n");
        informacionTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
        informacionTextArea.setForeground(Color.BLACK);

        JScrollPane scrollPane = new JScrollPane(informacionTextArea);

        panel.add(scrollPane, BorderLayout.CENTER);

        ventanaRecursosAyuda.add(panel);
        ventanaRecursosAyuda.setVisible(true);
    }
    private void mostrarHistorias() {
        JFrame ventanaHistorias = new JFrame();
        ventanaHistorias.setTitle("Historias Personales y Testimonios");
        ventanaHistorias.setSize(600, 400);
        ventanaHistorias.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(173, 216, 230));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.setLayout(new BorderLayout());

        JTextArea historiasTextArea = new JTextArea();
        historiasTextArea.setEditable(false);
        historiasTextArea.setLineWrap(true);
        historiasTextArea.setWrapStyleWord(true);
        historiasTextArea.setText("Historias Personales y Testimonios:\n\n" +
                "A continuación se presentan testimonios motivadores de personas que han superado el abuso de sustancias:\n\n" +
                "1. Testimonio de Juan: Juan fue adicto a la heroína durante varios años, pero después de buscar ayuda y participar en un programa de rehabilitación, logró recuperarse. Hoy en día, Juan está sobrio y trabaja como consejero para ayudar a otros en su proceso de recuperación.\n\n" +
                "2. Testimonio de María: María luchó contra el alcoholismo durante años, pero finalmente buscó tratamiento y encontró apoyo en un grupo de apoyo local. A través del amor y el apoyo de su familia y amigos, María logró superar su adicción y ahora vive una vida plena y sobria.\n\n" +
                "Estas historias son un recordatorio de que la recuperación es posible y que nunca es demasiado tarde para buscar ayuda. Si estás luchando contra el abuso de sustancias, recuerda que no estás solo y que hay personas y recursos disponibles para ayudarte en tu camino hacia la recuperación.\n");
        historiasTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
        historiasTextArea.setForeground(Color.BLACK);

        JScrollPane scrollPane = new JScrollPane(historiasTextArea);

        panel.add(scrollPane, BorderLayout.CENTER);

        ventanaHistorias.add(panel);
        ventanaHistorias.setVisible(true);
    }
    private void mostrarLeyes() {
        JFrame ventanaLeyes = new JFrame();
        ventanaLeyes.setTitle("Leyes y Regulaciones");
        ventanaLeyes.setSize(600, 400);
        ventanaLeyes.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(173, 216, 230));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.setLayout(new BorderLayout());

        JTextArea leyesTextArea = new JTextArea();
        leyesTextArea.setEditable(false);
        leyesTextArea.setLineWrap(true);
        leyesTextArea.setWrapStyleWord(true);
        leyesTextArea.setText("Leyes y Regulaciones:\n\n" +
                "Las leyes y regulaciones relacionadas con el abuso de sustancias varían según el país y la jurisdicción. Algunos aspectos importantes incluyen:\n\n" +
                "1. Legislación sobre drogas ilícitas: Establece la prohibición y penalización de la producción, distribución y posesión de drogas ilegales, como la cocaína, la heroína y la metanfetamina.\n\n" +
                "2. Edad legal para consumir alcohol y otras sustancias: Define la edad mínima permitida para el consumo de alcohol y otras drogas legales.\n\n" +
                "3. Programas de prevención y tratamiento: Establece políticas y recursos para la prevención y el tratamiento del abuso de sustancias, incluyendo la disponibilidad de programas de rehabilitación y centros de tratamiento.\n\n" +
                "4. Regulaciones en la industria farmacéutica: Supervisa la fabricación, distribución y prescripción de medicamentos psicotrópicos y controlados para prevenir su abuso y mal uso.\n\n" +
                "Es importante conocer las leyes y regulaciones aplicables en tu área para comprender tus derechos y responsabilidades en relación con el abuso de sustancias.\n");
        leyesTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
        leyesTextArea.setForeground(Color.BLACK);

        JScrollPane scrollPane = new JScrollPane(leyesTextArea);

        panel.add(scrollPane, BorderLayout.CENTER);

        ventanaLeyes.add(panel);
        ventanaLeyes.setVisible(true);
    }

    private void mostrarActividades() {
        JFrame ventanaActividades = new JFrame();
        ventanaActividades.setTitle("Actividades Interactivas");
        ventanaActividades.setSize(600, 400);
        ventanaActividades.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(173, 216, 230));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.setLayout(new BorderLayout());

        JTextArea actividadesTextArea = new JTextArea();
        actividadesTextArea.setEditable(false);
        actividadesTextArea.setLineWrap(true);
        actividadesTextArea.setWrapStyleWord(true);
        actividadesTextArea.setText("Actividades Interactivas:\n\n" +
                "Las actividades interactivas pueden ser una herramienta efectiva en la prevención y tratamiento del abuso de sustancias. Algunas actividades recreativas que pueden ayudar incluyen:\n\n" +
                "1. Juegos educativos: Desarrolla juegos que enseñen sobre los efectos de las drogas, los riesgos asociados y las habilidades para resistir la presión de los compañeros.\n\n" +
                "2. Simulaciones de situaciones reales: Crea escenarios interactivos que enfrenten a los participantes a decisiones relacionadas con el consumo de drogas y sus consecuencias.\n\n" +
                "3. Talleres de habilidades: Ofrece actividades prácticas para desarrollar habilidades de comunicación, resolución de problemas y manejo del estrés, que son importantes para evitar el consumo de drogas.\n\n" +
                "4. Programas de arte y expresión: Fomenta la creatividad a través de actividades artísticas como la pintura, la música o la escritura, que pueden servir como formas de expresión emocional y terapia.\n\n" +
                "Estas actividades no solo educan sobre los peligros del abuso de sustancias, sino que también ofrecen alternativas saludables y constructivas para ocupar el tiempo y mantenerse alejado de las drogas.\n");
        actividadesTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
        actividadesTextArea.setForeground(Color.BLACK);

        JScrollPane scrollPane = new JScrollPane(actividadesTextArea);

        panel.add(scrollPane, BorderLayout.CENTER);

        ventanaActividades.add(panel);
        ventanaActividades.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProyectoIntegrador ventana = new ProyectoIntegrador();
                ventana.setVisible(true);
            }
        });
    }
}
