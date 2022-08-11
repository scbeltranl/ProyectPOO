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
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class Tres extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tres frame = new Tres();
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
	public Tres() {
		
	String[] nickname;			
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NICKNAME");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 17));
		lblNewLabel.setBounds(75, 86, 97, 19);
		contentPane.add(lblNewLabel);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(85, 116, 148, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("SELECCIONAR DIFICULTAD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cinco cinco = new Cinco();
				setVisible(false);
				cinco.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(75, 257, 195, 23);
		contentPane.add(btnNewButton);
		
		JButton btnJugar = new JButton("INICIAR");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Seis seis = new Seis();
				setVisible(false);
				seis.setVisible(true);
				
			}
		});
		btnJugar.setBounds(75, 356, 195, 23);
		contentPane.add(btnJugar);
		
		JButton btnAtrs = new JButton("ATR\u00C1S");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Uno uno = new Uno();
				setVisible(false);
				uno.setVisible(true);
				
			}
		});
		btnAtrs.setBounds(75, 449, 195, 23);
		contentPane.add(btnAtrs);
		
		JLabel lblNewLabel_1 = new JLabel("Modo:");
		lblNewLabel_1.setBounds(75, 175, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dificultad");
		lblNewLabel_2.setBounds(153, 175, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
