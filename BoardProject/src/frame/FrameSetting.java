package frame;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSetting extends JFrame{
	
	public Login login;
	public List list;
	public Write write;
	public List2 list2;
	
	public FrameSetting() {
		setTitle("Board");          // â �̸�
		setVisible(true);  			//â�� ���� ���̵��� ��
		setSize(640, 720);			// ������� 640*720
		setResizable(false);		// ������ ������ �Ұ���
		setLocationRelativeTo(null);// â�� ��� �ߵ��� ��
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ������ ���α׷� ����
		
		login = new Login();
		add(login);
		
		list = new List();
		add(list);
		
		write = new Write();
		add(write);
		
		list2 = new List2();
		add(list2);
		
		login.setVisible(true);
		
		
//		JButton btn1 = new JButton();
//		btn1.setBounds(50,50,100,100);
//		add(btn1);
	}
}
