import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSetting extends JFrame{
	FrameSetting() {
		setVisible(true);  			//â�� ���� ���̵��� ��
		setSize(640, 720);			// ������� 640*720
		setResizable(false);		// ������ ������ �Ұ���
		setLocationRelativeTo(null);// â�� ��� �ߵ��� ��
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ������ ���α׷� ����
		
		JButton btn1 = new JButton();
		btn1.setBounds(50,50,100,100);
		add(btn1);
	}
}
