package frame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Login extends JPanel implements ActionListener {

	public Image background = new ImageIcon(Login.class.getResource("../image/login.jpg")).getImage();
	public JPasswordField passField;
	public JTextField idField;
	public JButton loginbtn;

	public Login() {
		setSize(640, 720);
		setLayout(null);
		setVisible(false);

		idField = new JTextField() {
			public void setBorder(Border border) { // �Է�â �׵θ� ����

			}
		};

		idField.setBounds(235, 310, 215, 40);
		idField.setOpaque(false);
		add(idField);

		passField = new JPasswordField() {
			public void setBorder(Border border) { // �Է�â �׵θ� ����

			}
		};

		passField.setBounds(235, 375, 215, 40);
		passField.setOpaque(false); // �Է�â ����
		add(passField);

		loginbtn = new JButton();
		loginbtn.setBounds(235, 520, 180, 40);
		loginbtn.setBorderPainted(false); // ��ư �׵θ� ����
		loginbtn.setContentAreaFilled(false); // ��ư �����ϰ� ����
		loginbtn.addActionListener(this); // ��ư�� �̺�Ʈ ���
		add(loginbtn);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginbtn) { // �α��� ��ư Ŭ���ϸ� �α��� �ǳ� ����
			if (idField.getText().equals("soeunee")) {
				if (passField.getText().equals("1234")) {
					setVisible(false);
				} else {
					JOptionPane aa = new JOptionPane();
					aa.showMessageDialog(null, "��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
					passField.setText("");

				}
			} else {
				JOptionPane aa = new JOptionPane();
				aa.showMessageDialog(null, "���̵� �ùٸ��� �ʽ��ϴ�.");
				idField.setText("");
				passField.setText("");
			}
		}

	}
	
}
