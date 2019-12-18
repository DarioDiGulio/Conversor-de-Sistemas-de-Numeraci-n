package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Conversor {

	private JFrame frmConversorDeSistemas;
	private JTextField textField;
	private JComboBox<?> comboBox_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
					window.frmConversorDeSistemas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorDeSistemas = new JFrame();
		frmConversorDeSistemas.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Desktop\\Proyectos Personales\\Conversor de Sistemas de Numeración\\src\\Interfaz\\Imagenes\\logoUpward.png"));
		frmConversorDeSistemas.setType(Type.POPUP);
		frmConversorDeSistemas.setTitle("Conversor de Sistemas de Numeración");
		frmConversorDeSistemas.setBounds(100, 100, 450, 300);
		frmConversorDeSistemas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBorder(new LineBorder(new Color(119, 136, 153), 4, true));
		panelCentral.setBackground(new Color(47, 79, 79));
		frmConversorDeSistemas.getContentPane().add(panelCentral, BorderLayout.CENTER);
		SpringLayout sl_panelCentral = new SpringLayout();
		panelCentral.setLayout(sl_panelCentral);
		
		JButton btnNewButton = new JButton("CONVERTIR");
		sl_panelCentral.putConstraint(SpringLayout.SOUTH, btnNewButton, -28, SpringLayout.SOUTH, panelCentral);
		sl_panelCentral.putConstraint(SpringLayout.EAST, btnNewButton, -161, SpringLayout.EAST, panelCentral);
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Sitka Display", Font.PLAIN, 12));
		btnNewButton.setActionCommand("");
		panelCentral.add(btnNewButton);
		
		textField = new JTextField();
		sl_panelCentral.putConstraint(SpringLayout.NORTH, textField, 132, SpringLayout.NORTH, panelCentral);
		sl_panelCentral.putConstraint(SpringLayout.WEST, textField, -375, SpringLayout.EAST, panelCentral);
		sl_panelCentral.putConstraint(SpringLayout.SOUTH, textField, -48, SpringLayout.NORTH, btnNewButton);
		sl_panelCentral.putConstraint(SpringLayout.EAST, textField, -255, SpringLayout.EAST, panelCentral);
		panelCentral.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(UIManager.getBorder("Button.border"));
		comboBox.setFont(new Font("Sitka Banner", Font.BOLD, 12));
		sl_panelCentral.putConstraint(SpringLayout.SOUTH, comboBox, -39, SpringLayout.NORTH, textField);
		sl_panelCentral.putConstraint(SpringLayout.EAST, comboBox, -255, SpringLayout.EAST, panelCentral);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DECIMAL", "HEXADECIMAL", "BINARIO"}));
		panelCentral.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBorder(UIManager.getBorder("Button.border"));
		comboBox_1.setFont(new Font("Sitka Banner", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"DECIMAL", "HEXADECIMAL", "BINARIO"}));
		sl_panelCentral.putConstraint(SpringLayout.WEST, comboBox_1, 90, SpringLayout.EAST, comboBox);
		sl_panelCentral.putConstraint(SpringLayout.SOUTH, comboBox_1, 0, SpringLayout.SOUTH, comboBox);
		panelCentral.add(comboBox_1);
		
		textField_1 = new JTextField();
		sl_panelCentral.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, textField);
		sl_panelCentral.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, comboBox_1);
		sl_panelCentral.putConstraint(SpringLayout.EAST, textField_1, 210, SpringLayout.EAST, textField);
		textField_1.setColumns(10);
		panelCentral.add(textField_1);

		JLabel lblNewLabel = new JLabel("Ingresá tus datos y presioná en \"CONVERTIR\"");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		sl_panelCentral.putConstraint(SpringLayout.NORTH, lblNewLabel, 14, SpringLayout.NORTH, panelCentral);
		sl_panelCentral.putConstraint(SpringLayout.WEST, lblNewLabel, -323, SpringLayout.EAST, comboBox_1);
		sl_panelCentral.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, comboBox_1);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setFocusCycleRoot(true);
		panelCentral.add(lblNewLabel);
	}
}
