package frame;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSetting extends JFrame{
	
	public Login login;
	public List list;
	public Write write;
	public List2 list2;
	
	public FrameSetting() {
		setTitle("Board");          // 창 이름
		setVisible(true);  			//창을 눈에 보이도록 함
		setSize(640, 720);			// 사이즈는 640*720
		setResizable(false);		// 사이즈 재조정 불가능
		setLocationRelativeTo(null);// 창이 가운데 뜨도록 함
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창이 꺼지면 프로그램 종료
		
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
