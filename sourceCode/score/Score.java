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
		
		//탭 추가
		tp.addTab("성적 입력",ip);
		tp.addTab("성적 조회",sp);
		
		//TabbedPane을 프레임에 추가
		getContentPane().add(tp);
		setTitle("학생 성적 관리(JDBC)"); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x종료
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
