package guiVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Arreglos.ArregloCajeros;
import Arreglos.ArregloLogin;
import Clases.Administrador;
import Clases.Cajero;
import Clases.Login;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class BienvenidoCajero extends JFrame implements ActionListener {
  ArregloCajeros ac = new ArregloCajeros();
  ArregloLogin alc=new ArregloLogin();
	private JPanel contentPane;
	private JLabel lblBienvenidoCajero;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblTipoCajero;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel lblDasAsistidos;
	private JLabel lblDasAusente;
	private JLabel lblTarifaDiariaS;
	private JTextField txtIdCajero;
	private JTextField txtNomCajero;
	private JTextField txtApeCajero;
	private JComboBox comboBoxTipoCajero;
	private JComboBox comboBoxDiasAsis;
	private JComboBox comboBoxD�asAuse;
	private JTextField txtTarifaDiariaCaj;
	private JTextField txtUsuarioCajeroBienve;
	private JPasswordField passwordCajero;
	private JTextField txtCargoCaj;
	private JScrollPane scrollPane;
	private JButton btnAdicionar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnListar;
	private DefaultTableModel modelo;
	private JTable tableCajeros;
	private JButton btnBuscar;
	private JButton btnAbrir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BienvenidoCajero frame = new BienvenidoCajero();
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
	public BienvenidoCajero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 559);
		contentPane =  new JPanel();
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBienvenidoCajero = new JLabel("\u00A1 Bienvenido Cajero!");
		lblBienvenidoCajero.setForeground(new Color(0, 0, 205));
		lblBienvenidoCajero.setFont(new Font("Lucida Bright", Font.BOLD, 24));
		lblBienvenidoCajero.setBounds(239, 11, 263, 41);
		contentPane.add(lblBienvenidoCajero);
		
		label_1 = new JLabel("Por favor, s\u00EDrvase llenar los siguientes datos:");
		label_1.setForeground(new Color(47, 79, 79));
		label_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
		label_1.setBackground(SystemColor.menu);
		label_1.setBounds(26, 68, 402, 23);
		contentPane.add(label_1);
		
		label_2 = new JLabel("ID : ");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(26, 102, 45, 23);
		contentPane.add(label_2);
		
		label_3 = new JLabel("Nombres: ");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(26, 130, 68, 23);
		contentPane.add(label_3);
		
		lblTipoCajero = new JLabel("Tipo Cajero: ");
		lblTipoCajero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoCajero.setBounds(26, 164, 89, 23);
		contentPane.add(lblTipoCajero);
		
		label_5 = new JLabel("Usuario: ");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(239, 195, 68, 23);
		contentPane.add(label_5);
		
		label_6 = new JLabel("Cargo: ");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(318, 102, 74, 23);
		contentPane.add(label_6);
		
		label_7 = new JLabel("Apellidos: ");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(318, 130, 68, 23);
		contentPane.add(label_7);
		
		label_8 = new JLabel("Contrase\u00F1a: ");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(443, 195, 89, 23);
		contentPane.add(label_8);
		
		lblDasAsistidos = new JLabel("D\u00EDas asistidos: ");
		lblDasAsistidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDasAsistidos.setBounds(213, 164, 98, 23);
		contentPane.add(lblDasAsistidos);
		
		lblDasAusente = new JLabel("D\u00EDas ausente: ");
		lblDasAusente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDasAusente.setBounds(392, 164, 98, 23);
		contentPane.add(lblDasAusente);
		
		lblTarifaDiariaS = new JLabel("Tarifa diaria: S/ ");
		lblTarifaDiariaS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTarifaDiariaS.setBounds(26, 198, 98, 23);
		contentPane.add(lblTarifaDiariaS);
		
		txtIdCajero = new JTextField();
		txtIdCajero.setBounds(66, 102, 140, 20);
		contentPane.add(txtIdCajero);
		txtIdCajero.setColumns(10);
		
		txtNomCajero = new JTextField();
		txtNomCajero.setBounds(95, 133, 169, 20);
		contentPane.add(txtNomCajero);
		txtNomCajero.setColumns(10);
		
		txtApeCajero = new JTextField();
		txtApeCajero.setColumns(10);
		txtApeCajero.setBounds(392, 133, 169, 20);
		contentPane.add(txtApeCajero);
		
		comboBoxTipoCajero = new JComboBox();
		comboBoxTipoCajero.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un tipo de Cajero", "Cajero Flash", "Cajero Normal"}));
		comboBoxTipoCajero.setBounds(105, 167, 98, 20);
		contentPane.add(comboBoxTipoCajero);
		
		comboBoxDiasAsis = new JComboBox();
		comboBoxDiasAsis.setModel(new DefaultComboBoxModel(new String[] {"Seleccione la cantidad de d\u00EDas asitidos en el mes", "27", "28", "29", "30"}));
		comboBoxDiasAsis.setBounds(305, 167, 81, 20);
		contentPane.add(comboBoxDiasAsis);
		
		comboBoxD�asAuse = new JComboBox();
		comboBoxD�asAuse.setModel(new DefaultComboBoxModel(new String[] {"Seleccione la cantidad de d\u00EDas que estuvo ausente en el mes", "0", "1", "2", "3"}));
		comboBoxD�asAuse.setBounds(487, 167, 94, 20);
		contentPane.add(comboBoxD�asAuse);
		
		txtTarifaDiariaCaj = new JTextField();
		txtTarifaDiariaCaj.setBounds(120, 198, 86, 20);
		contentPane.add(txtTarifaDiariaCaj);
		txtTarifaDiariaCaj.setColumns(10);
		
		txtUsuarioCajeroBienve = new JTextField();
		txtUsuarioCajeroBienve.setBounds(305, 198, 128, 20);
		contentPane.add(txtUsuarioCajeroBienve);
		txtUsuarioCajeroBienve.setColumns(10);
		
		passwordCajero = new JPasswordField();
		passwordCajero.setBounds(524, 197, 140, 20);
		contentPane.add(passwordCajero);
		
		txtCargoCaj = new JTextField();
		txtCargoCaj.setBounds(402, 102, 169, 20);
		contentPane.add(txtCargoCaj);
		txtCargoCaj.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 258, 787, 240);
		contentPane.add(scrollPane);
		
		tableCajeros = new JTable();
		scrollPane.setViewportView(tableCajeros);
		modelo = new DefaultTableModel();
		modelo.addColumn("ID Cajero");
		modelo.addColumn("Nombres");
		modelo.addColumn("Apellidos");
		modelo.addColumn("Cargo");
		modelo.addColumn("Tipo de Cajero");
		modelo.addColumn("D�as Asistidos");
		modelo.addColumn("D�as Ausentes");
		modelo.addColumn("Tarifa Diaria");
		modelo.addColumn("Usuario");
		tableCajeros.setModel(modelo);
		Listar();
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBackground(new Color(50, 205, 50));
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdicionar.setBounds(823, 184, 134, 46);
		contentPane.add(btnAdicionar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBackground(new Color(240, 128, 128));
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setBounds(823, 242, 134, 46);
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBackground(new Color(255, 255, 0));
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificar.setBounds(823, 299, 134, 46);
		contentPane.add(btnModificar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBackground(new Color(135, 206, 250));
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnListar.setBounds(823, 356, 134, 46);
		contentPane.add(btnListar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBackground(new Color(186, 85, 211));
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBuscar.setBounds(823, 413, 134, 41);
		contentPane.add(btnBuscar);
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(this);
		btnAbrir.setBounds(842, 132, 89, 23);
		contentPane.add(btnAbrir);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAbrir) {
			do_btnAbrir_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnListar) {
			do_btnListar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(arg0);
		}
	}
	protected void do_btnAdicionar_actionPerformed(ActionEvent arg0) {
		/* CAJERO FIJO
		Login log=new Login("LuisMiguel","ellanoteama");
		Cajero c=new Cajero(12365, 2, 1, "Jairo", "Cornejo", "Cajero", "Cajero normal", 150, log);
		ac.Adicionar(c);
		Listar();*/
		
		try{
			int ID_Caj=ID_Empleado();
			String nomCaj=Nombre(); 
			if(nomCaj.length() > 0){
				try{
					String apeCaj=Apellido(); 
					if(apeCaj.length() > 0){
						try{
							String cargoCaj=Cargo(); 
							if(cargoCaj.length() > 0){
								try{
									String tipoCaj =Tipo_cajero(); 
									if(tipoCaj.length() > 0){
										try{
											int da=Integer.parseInt(D�as_asistidos()); 
											try{
												int df=Integer.parseInt(D�as_falta()); 
												try{
													Double td=Tarifa_diaria(); 
													try{
														String nombre_usuario_registrado=Login_Usuario(); 
														if(nombre_usuario_registrado.length() > 0){
															try{
																String contrase�a_registrada=Login_Contrase�a(); 
																if(contrase�a_registrada.length() > 0){
																	Login l=new Login(nombre_usuario_registrado,contrase�a_registrada);
																	alc.Adicionar(l);
																	Cajero caj=new Cajero(ID_Caj, da, df, nomCaj, apeCaj, cargoCaj, tipoCaj, td,l ); 
																	ac.Adicionar(caj); 
																	try{
																		 FileWriter fw=new FileWriter("RegistroCajero.txt",true);
																		 BufferedWriter bw=new BufferedWriter(fw);
																		 PrintWriter pw =new PrintWriter(bw);
																		 pw.print("\tRegistro de Cajero\n");
																		 pw.print("-----------------------------\n");
																		 pw.print(caj.getID_Empleado()+"\t");
																		 pw.print(caj.getNombre()+"\t");
																		 pw.print(caj.getApellido()+"\t");
																		 pw.print(caj.getCargo()+"\t");
																		 pw.print(caj.getTipo_cajero()+"\t");
																		 pw.print(caj.getD�as_asistidos()+"\t");
																		 pw.print(caj.getD�as_falta()+"\t");
																		 pw.print(caj.getTarifa_diaria()+"\t");
																		 pw.print(l.getUsuario()+"\t");
																		 pw.print(l.getContrase�a()+"\n");
																	
																			pw.close();
																	 }catch (Exception e){
																		 JOptionPane.showMessageDialog(null, e);
																	 }
																	//Listar();
																	Mensaje("Se ha a�adido un cajero exitosamente");
																	
																}else{
																	mensaje("Hay uno o muchos campos vac�os");
																}
															}catch(Exception e){
																mensaje("Hay uno o muchos campos vac�os");
															}
														}else{
															mensaje("Hay uno o muchos campos vac�os");
														}
													}catch(Exception e){
														mensaje("Hay uno o muchos campos vac�os");
													}
												}catch(Exception e){
													mensaje("Hay uno o muchos campos vac�os");
												}
											}catch(Exception e){
												mensaje("Hay uno o muchos campos vac�os");
											}
										}catch(Exception e){
											mensaje("Hay uno o muchos campos vac�os");
										}
									}else{
										mensaje("Hay uno o muchos campos vac�os");
									}
								}catch(Exception e){
									mensaje("Hay uno o muchos campos vac�os");
								}
							}else{
								mensaje("Hay uno o muchos campos vac�os");
							}
						}catch(Exception e){
							mensaje("Hay uno o muchos campos vac�os");
						}
					}else{
						mensaje("Hay uno o muchos campos vac�os");
					}
				}catch(Exception e){
					mensaje("Hay uno o muchos campos vac�os");
				}
			}else{
				mensaje("Hay uno o muchos campos vac�os");
			}
		}catch(Exception e){
			mensaje("Hay uno o muchos campos vac�os");
		}

		/* FORMA SIN EL TRY -CATCH
		 * int ID_Caj=ID_Empleado();
		String nomCaj=Nombre();
		String apeCaj=Apellido();
		String cargoCaj=Cargo();
		String tipoCaj =Tipo_cajero();
		int da=Integer.parseInt(D�as_asistidos());
		int df=Integer.parseInt(D�as_falta());
		Double td=Tarifa_diaria();
		String nombre_usuario_registrado=Login_Usuario();
		String contrase�a_registrada=Login_Contrase�a();
		Login l=new Login(nombre_usuario_registrado,contrase�a_registrada);
        
		Cajero caj=new Cajero(ID_Caj, da, df, nomCaj, apeCaj, cargoCaj, tipoCaj, td,l );
        ac.Adicionar(caj);
        Listar();*/
	}
	void Listar(){
		modelo.setRowCount(0);
		for(int i=0; i<ac.Tama�o(); i++){
			Object[] fila ={
			ac.Obtener(i).getID_Empleado(),
			ac.Obtener(i).getNombre(),
			ac.Obtener(i).getApellido(),
			ac.Obtener(i).getCargo(),
			ac.Obtener(i).getTipo_cajero(),
			ac.Obtener(i).getD�as_asistidos(),
			ac.Obtener(i).getD�as_falta(),
			ac.Obtener(i).getTarifa_diaria(),
			ac.Obtener(i).getLogcaj().getUsuario()};
			modelo.addRow(fila);
			}
		}
	int ID_Empleado(){
		return Integer.parseInt(txtIdCajero.getText().trim());
	}
	String Nombre(){
		return txtNomCajero.getText().trim();
	}
	String Apellido(){
		return txtApeCajero.getText().trim();
	}
	String Cargo(){
		return txtCargoCaj.getText().trim();
	}
	String Tipo_cajero(){
		return comboBoxTipoCajero.getSelectedItem().toString();
	}
	String D�as_asistidos(){
		return comboBoxDiasAsis.getSelectedItem().toString();
	}
	String D�as_falta(){
		return comboBoxD�asAuse.getSelectedItem().toString();
	}
	double  Tarifa_diaria(){
		return Double.parseDouble(txtTarifaDiariaCaj.getText());
	}
	String Login_Usuario(){
		return txtUsuarioCajeroBienve.getText();
	}
	String Login_Contrase�a(){
		return passwordCajero.getText();
	}
	String mensaje(){
		return "Rellene todos los campos";
	}
	void mensaje(String s){
		JOptionPane.showMessageDialog(contentPane, s, "�ERROR!", 0);
	}
	void Mensaje(String a){
		JOptionPane.showMessageDialog(this,a);
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent arg0) {
				 
		try{
			Cajero x = ac.Buscar(ID_Empleado());
			if(x != null){
				Mensaje("Se encontr� "+ID_Empleado()+" "+"exitosamente");
				txtNomCajero.setText(x.getNombre());
				txtApeCajero.setText(""+x.getApellido());
				txtCargoCaj.setText(""+x.getCargo());
				comboBoxTipoCajero.setSelectedItem(""+x.getTipo_cajero());
				comboBoxDiasAsis.setSelectedItem(""+x.getD�as_asistidos());
				comboBoxD�asAuse.setSelectedItem(""+x.getD�as_falta());
				txtTarifaDiariaCaj.setText(""+x.getTarifa_diaria());
				txtUsuarioCajeroBienve.setText(""+x.getLogcaj().getUsuario());
				passwordCajero.setText(""+x.getLogcaj().getContrase�a());
			}else{
				mensaje("El ID de cajero "+ID_Empleado()+" no existe en el registro");
				txtIdCajero.setText("");
				txtIdCajero.requestFocus();
			}
		}
		catch (Exception e){
				mensaje("Rellene el campo requirido");
				txtIdCajero.setText("");
				txtIdCajero.requestFocus();
			}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent arg0) {
		try {
			Cajero x = ac.Buscar(ID_Empleado());
			if (x != null) {
				ac.Eliminar(x);
				Mensaje("Se elimin� "+ID_Empleado()+" "+"exitosamente");
				//Listar();
				txtIdCajero.setText("");
				txtNomCajero.setText("");
				txtApeCajero.setText("");
				txtCargoCaj.setText("");
				comboBoxTipoCajero.setSelectedItem(" ");
				comboBoxDiasAsis.setSelectedItem(" ");
				comboBoxD�asAuse.setSelectedItem(" ");
				txtTarifaDiariaCaj.setText("");
				passwordCajero.setText(" ");
				
			}
			else {
				mensaje("El ID de Administrador: " + ID_Empleado() + " no existe");
				txtIdCajero.setText("");
				txtIdCajero.requestFocus();
				}
			}
			catch (Exception e) {
				mensaje("Rellene los campos");
				txtIdCajero.setText("");
				txtIdCajero.requestFocus();
			}
		
		//Listar();
	}
	protected void do_btnModificar_actionPerformed(ActionEvent arg0) {
		try{
			Cajero x = ac.Buscar(ID_Empleado());
			if(x != null){
				String nombre = Nombre();
				if(nombre.length()>0){
					try{
						int IDe = ID_Empleado();
						try{
							double td = Tarifa_diaria();
							String contrase�a_registrada=Login_Contrase�a();
							String nombre_usuario_registrado=Login_Usuario();
							Login l=new Login(nombre_usuario_registrado,contrase�a_registrada);
							//Listar();
							Mensaje("Se ha modificado el cajero con ID "+IDe+" correctamente...");
							x.setNombre(Nombre());
							x.setApellido(Apellido());
							x.setCargo(Cargo());
							x.setTipo_cajero(Tipo_cajero());
							x.setD�as_asistidos(Integer.parseInt(D�as_asistidos()));
							x.setD�as_falta(Integer.parseInt(D�as_falta()));
							x.setTarifa_diaria(td);
							x.setLogcaj(l);
		
							Listar();
							txtIdCajero.requestFocus();
						}
						catch(Exception e){
							mensaje(mensaje());
							txtTarifaDiariaCaj.setText("");
							txtTarifaDiariaCaj.requestFocus();
						}
					}catch(Exception e){
						mensaje(mensaje());
						txtNomCajero.setText("");
						txtNomCajero.requestFocus();
					}
				}else{
					mensaje(mensaje());
					txtNomCajero.setText("");
					txtApeCajero.requestFocus();
					txtCargoCaj.setText("");
					comboBoxTipoCajero.setSelectedItem("");
					comboBoxDiasAsis.setSelectedItem("");
					comboBoxD�asAuse.setSelectedItem(" ");
					txtIdCajero.requestFocus();
					}
			}else{
				mensaje("�CODIGO INEXISTENTE!");
				txtIdCajero.setText("");
				txtIdCajero.requestFocus();
			}
		}
		catch(Exception e){
			mensaje("�CODIGO INEXISTENTE!");
			txtIdCajero.setText("");
			txtIdCajero.requestFocus();
		}
	}
  
	protected void do_btnListar_actionPerformed(ActionEvent arg0) {
		String usuario,contrase�a,idc,nom,appe,car,tc,da,dau,td;
		String au="C:/Users/allis/OneDrive/Escritorio/PROYECTO SUPERMERCADO/Supermercado_V1/RegistroCajero.txt";
		Scanner linea=null;
		File doc_1e=new File(au);
				try{
					
					linea=new Scanner(doc_1e);
					
					while(linea.hasNextLine()){
						idc=linea.nextLine();
						nom=linea.nextLine();
						appe=linea.nextLine();
						car=linea.nextLine();
						tc=linea.nextLine();
						da=linea.nextLine();
						dau=linea.nextLine();
						td=linea.nextLine();
						usuario=linea.nextLine();
						contrase�a=linea.nextLine();

						modelo.addRow(new Object[]{idc,nom,appe,car,tc,da,dau,td,usuario,contrase�a});
					}
				}catch(Exception x){
					Mensaje("Se Adicin� correctamente...");
				}	
				Listar();	
	}
		

		public void abrirarchivo(String archivo){

		     try {

		            File objetofile = new File (archivo);
		            Desktop.getDesktop().open(objetofile);

		     }catch (Exception ex) {

		            System.out.println(ex);

		     }

		} 
	protected void do_btnAbrir_actionPerformed(ActionEvent arg0) {
		try{
			abrirarchivo("RegistroCajero.txt");
		}catch (Exception s){
			mensaje("El archivo no existe");
		}
	}
}
