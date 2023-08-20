package frame;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class List2 extends JPanel {

	public Image background = new ImageIcon(List2.class.getResource("../image/list2.png")).getImage();
	public JButton register;

	public List2() {
		setSize(640, 720);
		setLayout(null);
		setVisible(true);

		register = new JButton();			  // ��� ��ư
		register.setBounds(50, 625, 40, 40);
		register.setBorderPainted(false);     // ��ư �׵θ� ����
		register.setContentAreaFilled(false); // ��ư �����ϰ� ����
		register.setIcon(new ImageIcon(List2.class.getResource("../image/register.png")));
		add(register);


	}

	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}

	
}
