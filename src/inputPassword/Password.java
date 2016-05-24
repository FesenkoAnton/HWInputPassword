package inputPassword;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Password extends JFrame {

	private UserPass user;
	private JPanel panelFirst;
	// private JPanel panelSecond;
	private JTextField log;
	private JPasswordField pass;
	private JButton button;

	public Password(UserPass up) {
		user = up;
	}

	public void print() {
		panelFirst = new JPanel(new GridLayout(5, 3));

		panelFirst.add(new JLabel("Login:"));
		log = new JTextField();
		log.setSize(100, 20);
		panelFirst.add(log);

		panelFirst.add(new JLabel("Password:"));
		pass = new JPasswordField();
		pass.setSize(100, 20);
		panelFirst.add(pass);

		button = new JButton("Enter");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String password = "";
				for (char c : pass.getPassword())
					password += c;
				UserPass access = new UserPass(log.getText(), password);
				
				if (user.checkPassLog(access)) {
					JOptionPane.showMessageDialog(null,
							"Secret information - you are THE BEST", "Correct",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Wrong Password",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		panelFirst.add(button);

	}

	public void start() {
		this.setSize(500, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		print();
		add(panelFirst);
		pack();
	}

}
