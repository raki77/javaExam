import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Score extends JFrame{

	private JTabbedPane tp; 
	private InputPane ip;
	private SearchPane sp;
	
	
	public Score() {
		tp = new JTabbedPane();
		ip = new InputPane();
		sp = new SearchPane();
		
		//�� �߰�
		tp.addTab("���� �Է�",ip);
		tp.addTab("���� ��ȸ",sp);
		
		//TabbedPane�� �����ӿ� �߰�
		getContentPane().add(tp);
		setTitle("�л� ���� ����(JDBC)"); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score score = new Score();
		Dimension d = new Dimension(250,350);
		score.setSize(d);
		score.setLocation(200,100);
		score.setVisible(true);
		score.show(true);
	}

}
