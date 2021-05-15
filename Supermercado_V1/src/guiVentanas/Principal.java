package guiVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblLOG;
	private JButton btnAdministrador;
	private JButton btnCajero;
	private JLabel lblSeleccioneQueTipo;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 296);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLOG = new JLabel("L   O  G   I   N");
		lblLOG.setForeground(new Color(0, 0, 205));
		lblLOG.setFont(new Font("Lucida Bright", Font.BOLD, 27));
		lblLOG.setBounds(137, 36, 200, 61);
		contentPane.add(lblLOG);
		
		btnAdministrador = new JButton("Administrador");
		btnAdministrador.addActionListener(this);
		btnAdministrador.setBackground(new Color(224, 255, 255));
		btnAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdministrador.setBounds(63, 176, 164, 51);
		contentPane.add(btnAdministrador);
		
		btnCajero = new JButton("Cajero");
		btnCajero.addActionListener(this);
		btnCajero.setBackground(new Color(216, 191, 216));
		btnCajero.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCajero.setBounds(270, 176, 140, 49);
		contentPane.add(btnCajero);
		
		lblSeleccioneQueTipo = new JLabel("Seleccione que tipo de empleado es:");
		lblSeleccioneQueTipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSeleccioneQueTipo.setBounds(63, 110, 374, 25);
		contentPane.add(lblSeleccioneQueTipo);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalir.setBackground(new Color(255, 69, 0));
		btnSalir.setBounds(383, 11, 89, 23);
		contentPane.add(btnSalir);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCajero) {
			do_btnCajero_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAdministrador) {
			do_btnAdministrador_actionPerformed(arg0);
		}
	}
	protected void do_btnAdministrador_actionPerformed(ActionEvent arg0) {
		Ventana_login_Admin nuevoFrame = new Ventana_login_Admin();
		nuevoFrame.setVisible(true);
		dispose();
	}
	protected void do_btnCajero_actionPerformed(ActionEvent arg0) {
		Ventana_login_Cajero nuevoFrame= new Ventana_login_Cajero();
		nuevoFrame.setVisible(true);
		dispose();
	}
	protected void do_btnSalir_actionPerformed(ActionEvent arg0) {
		dispose();
	}
}
