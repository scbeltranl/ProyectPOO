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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class Dos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dos frame = new Dos();
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
	public Dos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NICKNAME:");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 17));
		lblNewLabel.setBounds(87, 147, 116, 19);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(87, 177, 165, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTRARSE");
		btnNewButton.setBounds(105, 288, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ATR\u00C1S");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Uno uno = new Uno();
				setVisible(false);
				uno.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(244, 527, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
