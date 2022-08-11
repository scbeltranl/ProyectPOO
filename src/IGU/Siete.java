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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class Siete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Siete frame = new Siete();
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
	public Siete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGameOver = new JLabel("Game Over");
		lblGameOver.setFont(new Font("Showcard Gothic", Font.PLAIN, 36));
		lblGameOver.setBounds(95, 50, 200, 62);
		contentPane.add(lblGameOver);
		
		JLabel lblNewLabel = new JLabel("Time");
		lblNewLabel.setBounds(178, 214, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("moneda");
		lblNewLabel_1_2_1_2.setBounds(134, 292, 31, 34);
		contentPane.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("moneda X");
		lblNewLabel_1_2_1_2_1.setBounds(174, 292, 31, 34);
		contentPane.add(lblNewLabel_1_2_1_2_1);
		
		JLabel lblNewLabel_1_2_1_2_1_1 = new JLabel("###");
		lblNewLabel_1_2_1_2_1_1.setBounds(220, 292, 31, 34);
		contentPane.add(lblNewLabel_1_2_1_2_1_1);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Uno uno = new Uno();
				setVisible(false);
				uno.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(62, 485, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnVolverAJugar = new JButton("Volver a jugar");
		btnVolverAJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tres tres = new Tres();
				setVisible(false);
				tres.setVisible(true);
				
			}
		});
		btnVolverAJugar.setBounds(206, 485, 137, 23);
		contentPane.add(btnVolverAJugar);
	}
}
