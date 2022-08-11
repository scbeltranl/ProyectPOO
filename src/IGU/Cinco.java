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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class Cinco extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cinco frame = new Cinco();
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
	public Cinco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("DIFICIL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tres tres = new Tres();
				setVisible(false);
				tres.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(135, 158, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNormal = new JButton("NORMAL");
		btnNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tres tres = new Tres();
				setVisible(false);
				tres.setVisible(true);
				
			}
		});
		btnNormal.setBounds(135, 247, 89, 23);
		contentPane.add(btnNormal);
		
		JButton btnFcil = new JButton("F\u00C1CIL");
		btnFcil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tres tres = new Tres();
				setVisible(false);
				tres.setVisible(true);
				
			}
		});
		btnFcil.setBounds(135, 326, 89, 23);
		contentPane.add(btnFcil);
	}

}
