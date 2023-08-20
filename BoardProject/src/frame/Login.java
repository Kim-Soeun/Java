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
			public void setBorder(Border border) { // 입력창 테두리 삭제

			}
		};

		idField.setBounds(235, 310, 215, 40);
		idField.setOpaque(false);
		add(idField);

		passField = new JPasswordField() {
			public void setBorder(Border border) { // 입력창 테두리 삭제

			}
		};

		passField.setBounds(235, 375, 215, 40);
		passField.setOpaque(false); // 입력창 투명도
		add(passField);

		loginbtn = new JButton();
		loginbtn.setBounds(235, 520, 180, 40);
		loginbtn.setBorderPainted(false); // 버튼 테두리 삭제
		loginbtn.setContentAreaFilled(false); // 버튼 투명하게 설정
		loginbtn.addActionListener(this); // 버튼에 이벤트 등록
		add(loginbtn);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginbtn) { // 로그인 버튼 클릭하면 로그인 판넬 꺼짐
			if (idField.getText().equals("soeunee")) {
				if (passField.getText().equals("1234")) {
					setVisible(false);
				} else {
					JOptionPane aa = new JOptionPane();
					aa.showMessageDialog(null, "비밀번호가 올바르지 않습니다.");
					passField.setText("");

				}
			} else {
				JOptionPane aa = new JOptionPane();
				aa.showMessageDialog(null, "아이디가 올바르지 않습니다.");
				idField.setText("");
				passField.setText("");
			}
		}

	}
	
}
