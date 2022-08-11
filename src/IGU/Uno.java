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
public class Uno extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uno frame = new Uno();
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
	public Uno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Game Name");
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 36));
		lblNewLabel.setBounds(92, 42, 200, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("REGISTRARME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dos dos = new Dos();
				setVisible(false);
				dos.setVisible(true);
								
			}
		});
		btnNewButton.setBounds(92, 176, 200, 48);
		contentPane.add(btnNewButton);
		
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tres tres = new Tres();
				setVisible(false);
				tres.setVisible(true);
				
			}
		});
		btnJugar.setBounds(92, 300, 200, 48);
		contentPane.add(btnJugar);
		
		JButton btnScore = new JButton("SCORE");
		btnScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cuatro cuatro = new Cuatro();
				setVisible(false);
				cuatro.setVisible(true);
				
			}
		});
		btnScore.setBounds(92, 426, 200, 48);
		contentPane.add(btnScore);
	}
}
