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
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings({ "serial", "unused" })
public class Cuatro extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuatro frame = new Cuatro();
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
	public Cuatro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setName("");
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nickname", "Tiempo", "Cant. monedas"
			}
		));
		table.setBounds(50, 181, 283, 265);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("SCORE");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 26));
		lblNewLabel.setBounds(150, 35, 84, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ATR\u00C1S");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Uno uno = new Uno();
				setVisible(false);
				uno.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(147, 499, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nickname");
		lblNewLabel_1.setBounds(50, 156, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tiempo");
		lblNewLabel_1_1.setBounds(150, 156, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cant. monedas");
		lblNewLabel_1_1_1.setBounds(240, 156, 93, 14);
		contentPane.add(lblNewLabel_1_1_1);
	}
}
