
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonStudy extends JFrame {
	ButtonStudy() {
		JButton btn1 = new JButton();
		add(btn1);
		
		setVisible(true);  			//â�� ���� ���̵��� ��
		setSize(640, 720);			// ������� 640*720
		setResizable(false);		// ������ ������ �Ұ���
		setLocationRelativeTo(null);// â�� ��� �ߵ��� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ������ ���α׷� ����
	}
}
