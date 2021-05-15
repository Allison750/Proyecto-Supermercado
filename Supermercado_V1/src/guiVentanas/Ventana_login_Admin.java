package guiVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloLogin;
import Arreglos.ArregloAdministradores;

import Clases.Login;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Ventana_login_Admin extends JFrame implements ActionListener {
	ArregloLogin ala= new ArregloLogin();
	ArregloAdministradores aa=new ArregloAdministradores();
	private JPanel contentPane;
	private JLabel lblLOG;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JTextField txtLoginUsuario;
	private JButton btnCrearUsuario;
	private JButton btnIngresar;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblSupermercadoUpn;
	private JLabel lblprecioMsBajos;
	private JButton btnSalir;
	private JPasswordField passwordLoginAdmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_login_Admin frame = new Ventana_login_Admin();
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
	public Ventana_login_Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 433);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLOG = new JLabel(" A  D  M  I  N  I  S  T  R  A  D  O  R");
		lblLOG.setForeground(new Color(0, 0, 205));
		lblLOG.setFont(new Font("Lucida Bright", Font.BOLD, 27));
		lblLOG.setBounds(55, 11, 456, 61);
		contentPane.add(lblLOG);
		
		lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblUsuario.setBounds(274, 97, 107, 25);
		contentPane.add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblContrasea.setBounds(274, 144, 117, 33);
		contentPane.add(lblContrasea);
		
		txtLoginUsuario = new JTextField();
		txtLoginUsuario.setBounds(382, 103, 157, 20);
		contentPane.add(txtLoginUsuario);
		txtLoginUsuario.setColumns(10);
		
		btnCrearUsuario = new JButton("Nuevo Usuario");
		btnCrearUsuario.setBackground(new Color(221, 160, 221));
		btnCrearUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCrearUsuario.setForeground(new Color(0, 0, 0));
		btnCrearUsuario.addActionListener(this);
		btnCrearUsuario.setBounds(361, 222, 124, 25);
		contentPane.add(btnCrearUsuario);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBackground(new Color(255, 250, 205));
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIngresar.setBounds(380, 188, 89, 23);
		contentPane.add(btnIngresar);
		
		panel = new JPanel();
		panel.setBounds(10, 71, 254, 194);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ventana_login_Admin.class.getResource("/Imag/LOGO.png")));
		lblNewLabel.setBounds(0, -46, 254, 240);
		panel.add(lblNewLabel);
		
		lblSupermercadoUpn = new JLabel("  SUPERMERCADO UPN");
		lblSupermercadoUpn.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 26));
		lblSupermercadoUpn.setForeground(new Color(51, 102, 255));
		lblSupermercadoUpn.setBackground(new Color(255, 255, 255));
		lblSupermercadoUpn.setBounds(96, 289, 324, 55);
		contentPane.add(lblSupermercadoUpn);
		
		lblprecioMsBajos = new JLabel("-Precios m\u00E1s bajos siempre -");
		lblprecioMsBajos.setFont(new Font("Segoe Script", Font.BOLD, 23));
		lblprecioMsBajos.setBounds(67, 342, 387, 25);
		contentPane.add(lblprecioMsBajos);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBackground(new Color(250, 128, 114));
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalir.setBounds(464, 332, 89, 23);
		contentPane.add(btnSalir);
		
		passwordLoginAdmin = new JPasswordField();
		passwordLoginAdmin.setBounds(382, 153, 157, 20);
		contentPane.add(passwordLoginAdmin);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnCrearUsuario) {
			do_btnCrearUsuario_actionPerformed(arg0);
		}
	}
	protected void do_btnCrearUsuario_actionPerformed(ActionEvent arg0) {
		CrearUsuario nuevoFrame = new CrearUsuario();
		nuevoFrame.setVisible(true);
		dispose();
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent arg0) {
		 String nombre_usuario_registrado=leerNombreUsuario();
		 String contraseña_registrada=leerContraseña();
		 ala.Adicionar(new Login("Admin","1234"));
		 ala.Adicionar(new Login("Admin01","Ad01"));
		 ala.Adicionar(new Login("Admin02","Ad02"));
		 ala.Adicionar(new Login("Admin04","Ad04"));
		 ala.Adicionar(new Login("Admin03","Ad03"));
		 Login log=new Login(nombre_usuario_registrado,contraseña_registrada);
		 //ala.Adicionar(new Login(nombre_usuario_registrado,contraseña_registrada));
	
			//for(int i=0;i<ala.Tamaño();i++){
			
					if(nombre_usuario_registrado.equals(log.getUsuario())&& contraseña_registrada.equals(log.getContraseña())){
												
						dispose();
						BienvenidoAdministrador nuevoFrame = new BienvenidoAdministrador();
						nuevoFrame.setVisible(true);
					
						
					}
					else{
						Mensaje("El Nombre de Usuario o la Contraseña están INCONRRECTOS.");
						
					}
				}
			//}

	
    String leerNombreUsuario(){
    	return txtLoginUsuario.getText();
    	
    }
    String leerContraseña(){
    	return passwordLoginAdmin.getText();
    }
	void Mensaje (String s){
			JOptionPane.showMessageDialog(this, s);
		}
	protected void do_btnSalir_actionPerformed(ActionEvent arg0) {
		Principal nuevoFrame = new Principal();
		nuevoFrame.setVisible(true); 
		dispose();
	}
}
