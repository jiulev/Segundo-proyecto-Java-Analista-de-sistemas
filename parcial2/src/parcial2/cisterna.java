package parcial2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class cisterna extends JFrame {

	private JPanel contentPane;
	private JTextField correcto;
	private JTextField dpto;
	private JTextField cant;
     private int columna=20;
     private int litros=0;
     private int num=0;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cisterna frame = new cisterna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	public cisterna() {
		setTitle("-");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JButton btnNewButton = new JButton("DEPARTAMENTO 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dpto.setText("1");
				num=1;
				
			}
			
			
		});
		btnNewButton.setBounds(10, 27, 150, 50);
		contentPane.add(btnNewButton);
		
		JButton btnDepartamento = new JButton("DEPARTAMENTO 2");
		btnDepartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dpto.setText("2");
				num=2;
			}
		});
		btnDepartamento.setBounds(10, 88, 150, 50);
		contentPane.add(btnDepartamento);
		
		JButton btnNewButton_1_1 = new JButton("DEPARTAMENTO 3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dpto.setText("3");
				num=3;
			}
		});
		btnNewButton_1_1.setBounds(10, 148, 150, 50);
		contentPane.add(btnNewButton_1_1);
		
		dpto = new JTextField();
		dpto.setText("\"---\"");
		dpto.setHorizontalAlignment(SwingConstants.CENTER);
		dpto.setFont(new Font("Tahoma", Font.PLAIN, 29));
		dpto.setBounds(278, 35, 106, 99);
		contentPane.add(dpto);
		dpto.setColumns(10);
		
		JButton btnNewButton_1_2 = new JButton("SALIR");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	
		
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(479, 155, 129, 43);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("COMENZAR");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				litros=100;
				String lit = Integer.toString(litros);
				cant.setText(lit);
				repaint();	
				if (columna<220&&num==1) {
				correcto.setText("Correcto");
				columna=420;
				repaint();
				}
			
				else if (columna>=220&&columna<=300&&num==2) {
					correcto.setText("Correcto");
					columna=420;
					repaint();
					}
				
				
				else if (columna>300&&num==3) {
					correcto.setText("Correcto");
					columna=420;
					repaint();
					}
				
				else  {
					correcto.setText("Incorrecto");
					columna=420;
					repaint();
					}
				
				
				
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_1.setBounds(479, 34, 129, 43);
		contentPane.add(btnNewButton_1_2_1);
		
		correcto = new JTextField();
		correcto.setFont(new Font("Tahoma", Font.PLAIN, 26));
		correcto.setText("    \"--\"");
		correcto.setBounds(479, 92, 129, 42);
		contentPane.add(correcto);
		correcto.setColumns(10);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(102, 400, 0, -38);
		contentPane.add(separator);
		
		JButton btnNewButton_1 = new JButton("<<");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (columna<=440&&columna>=60) {
				columna=columna-40;
				litros=litros-10;
				String lit = Integer.toString(litros);
				cant.setText(lit);
				repaint();}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setBounds(429, 339, 95, 95);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_3 = new JButton(">>");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (columna>=20&&columna<=400) {
					columna=columna+40;
					litros=litros+10;
					String lit = Integer.toString(litros);
					cant.setText(lit);
					repaint();}
				
				
			}
			
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1_3.setBounds(557, 339, 95, 95);
		contentPane.add(btnNewButton_1_3);
		
		cant = new JTextField();
		cant.setText("\"---\"");
		cant.setHorizontalAlignment(SwingConstants.CENTER);
		cant.setFont(new Font("Tahoma", Font.PLAIN, 29));
		cant.setColumns(10);
		cant.setBounds(492, 251, 95, 77);
		contentPane.add(cant);
		
		JButton btnNewButton_2 = new JButton("INICIALIZAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				columna=20;
				repaint();
				cant.setText("\"---\"");
				dpto.setText("\"---\"");
				correcto.setText("\"--\"");
				cant.setText("\"---\"");
				litros=0;
				
			}
		});
		btnNewButton_2.setBounds(262, 148, 142, 43);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 340, 8, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("10");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(43, 340, 16, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("20");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(83, 340, 16, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("30");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(125, 339, 16, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("40");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(163, 339, 16, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("50");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(206, 339, 16, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("60");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(243, 339, 16, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("70");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(283, 339, 16, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("80");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(323, 339, 16, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("90");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(363, 339, 16, 17);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("100");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(392, 336, 37, 23);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("NIVEL DE LA CISTERNA");
		lblNewLabel_2.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(124, 234, 190, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dpto Seleccionado:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(263, 11, 150, 23);
		contentPane.add(lblNewLabel_3);
	}


	public void paint(Graphics g) {
		super.paint(g);
	
		
		g.drawRect(20, 300, 400, 70);
		g.drawLine(60, 370, 60, 320);
		g.drawLine(100, 370, 100, 320);
		g.drawLine(140, 370, 140, 320);
		g.drawLine(180, 370, 180, 320);
		g.drawLine(220, 370, 220, 320);
		
		g.drawLine(260, 370, 260, 320);
		

		g.drawLine(300, 370, 300, 320);
		g.drawLine(340, 370, 340, 320);
		g.drawLine(380, 370, 380, 320);
		g.setColor(Color.red);
		g.fillRect(columna, 300, 5, 70);
	}
}




