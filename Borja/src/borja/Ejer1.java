package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*Ejercicio 1
Crea una ventana (Frame) utilizando el Window Builder. Utiliza la interfaz de diseño para
añadirla un Absolute Layout. La ventana tiene que tener dos JTextField para introducir el
usuario y el password; dos JLabel para etiquetar los campos de texto; y un JButton.
Cuando el botón es pulsado, se cogerá el valor de los JTextField. Si ambos valores están
rellenos y son “admin”, muestra un mensaje pop-up con el texto “Bienvenido”. En cualquier otro caso, muestra un mensaje pop-up con el texto “User o password desconocido”
El pop-up se hace con la instrucción JOPtionPane.showMessageDialog (…). Consulta en
Google ejemplos de cómo se utiliza.
Solución: Ejercicio1. java*/

public class Ejer1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer1 frame = new Ejer1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejer1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(58, 82, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasea.setBounds(40, 121, 80, 14);
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(130, 79, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 118, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((textField.getText().equalsIgnoreCase("admin")) && (textField_1.getText().equalsIgnoreCase("admin"))) {
					JOptionPane.showMessageDialog(null, "¡Bienvenido!");
				}
				else JOptionPane.showMessageDialog(null, "Usuario o contraseña desconocidos.");
			}
		});
		btnNewButton.setBounds(127, 166, 89, 23);
		contentPane.add(btnNewButton);
	}
}
