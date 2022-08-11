/**
 * SOFTWARE: POO
 * @version 1.0
 * @authors SEBASTIÁN BELTRÁN, LINA LEÓN, MAURICIO SÁNCHEZ
 * 
 * */

package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class Seis extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seis frame = new Seis();
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
	public Seis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nickname");
		lblNewLabel.setBounds(10, 11, 134, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("I I");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[] arreglo = {"Reanudar","Terminar partida"};
				
				int opcion = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "PAUSE", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Reanudar");
				switch(opcion) {
				
				case 0:
					
					
					
					break;
				case 1:
					
					Siete siete = new Siete();
					setVisible(false);
					siete.setVisible(true);
					
					break;
				}
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton.setBounds(328, 7, 46, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("imagen 1 (0-10)");
		lblNewLabel_1.setBounds(10, 44, 31, 34);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("imagen 2 (slash)");
		lblNewLabel_1_1.setBounds(51, 44, 31, 34);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("imagen 2 (10)");
		lblNewLabel_1_1_1.setBounds(92, 44, 31, 34);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("cora1");
		lblNewLabel_1_2.setBounds(10, 91, 31, 34);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("cora2");
		lblNewLabel_1_2_1.setBounds(10, 136, 31, 34);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("cora3");
		lblNewLabel_1_2_1_1.setBounds(10, 184, 31, 34);
		getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("moneda");
		lblNewLabel_1_2_1_2.setBounds(240, 54, 31, 34);
		getContentPane().add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("moneda X");
		lblNewLabel_1_2_1_2_1.setBounds(280, 54, 31, 34);
		getContentPane().add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_1_2_1_2_1_1 = new JLabel("###");
		lblNewLabel_1_2_1_2_1_1.setBounds(326, 54, 31, 34);
		getContentPane().add(lblNewLabel_1_2_1_2_1_1);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setBounds(240, 11, 73, 14);
		contentPane.add(lblTiempo);
	}

}
