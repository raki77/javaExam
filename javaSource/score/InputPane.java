
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

import java.sql.*;
import javax.sql.*;
import java.util.*;

public class InputPane extends JPanel implements ActionListener{

	private String url = "jdbc:odbc:score";
	private Connection con;
	private Statement stmt;
	
	private JPanel p[];
	private JLabel l[];
	private JTextField tf[];
	private JButton okb;
	private JButton rsb;
	
	
	//init
	public InputPane() {
		setLayout(new GridLayout(7,1));
		EtchedBorder eb= new EtchedBorder();
		setBorder(eb);
		
		p = new JPanel[7];
		l = new JLabel[6];
		tf= new JTextField[6];
		
		l[0]=new JLabel("이름    :");
		l[1]=new JLabel("학번    :");
		l[2]=new JLabel("컴퓨터 :");
		l[3]=new JLabel("국어    :");
		l[4]=new JLabel("영어    :");
		l[5]=new JLabel("수학    :");
		
		for(int i=0;i<6;i++) {
			tf[i] = new JTextField(15);
			p[i] = new JPanel();
			p[i].add(l[i]);
			p[i].add(tf[i]);
			
			add(p[i]);
		}
		
		p[6] = new JPanel();
		okb = new JButton("저장하기");
		okb.addActionListener(this);
		
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		
		p[6].add(okb);
		p[6].add(rsb);
		
		add(p[6]);
				
	}
	
	
	//button action 
	public void actionPerformed(ActionEvent ae) {
		String ae_type = ae.getActionCommand();
		
		if(ae_type.equals(okb.getText())) {
			try{
				//JDBC등록
				Class.forName("com.mysql.jdbc.Driver");
				
				//connection
				con = DriverManager.getConnection("jdbc:mysql://localhost/score?user=root&password=비번");
				
				//커넥션으로 부터 실제로 sql쿼리를 실행시키 위한 
				//statement 객체를 얻어온다.
				stmt = con.createStatement();
				
				//sum
				int sum = Integer.parseInt(tf[2].getText()) + Integer.parseInt(tf[3].getText())
					+Integer.parseInt(tf[4].getText()) +Integer.parseInt(tf[5].getText());
				
				//avg
				int avg = sum/4;
				
				//실행시킬 sql문 작성
				String query = "INSERT INTO score(name, snum, com, kor, eng, math, sum, avg) VALUES(";
				
				//MYSQL에 한글이 바르게 입력되도록 하기 위해 8859-1로 인코딩
				query = query + "'" + 
					new String(tf[0].getText().getBytes("KSC5601"), "8859_1") + "',";
				query = query + "'" + tf[1].getText() + "',";
				query = query + tf[2].getText() + ",";
				query = query + tf[3].getText() + ",";
				query = query + tf[4].getText() + ",";
				query = query + tf[5].getText() + ",";
				
				query = query + sum + ",";
				query = query + avg + ")";
				
				//execute()메서드를 사용하여 쿼리를 실행
				stmt.execute(query);
				
				//statement객체는 바로 닫는다.
				stmt.close();
				
				//connection close
				con.close();
								
			}catch (Exception e) {}
		}else if(ae_type.equals(rsb.getText())) {
			//텍스트 필드를 초기화
			for(int i=0;i<6;i++) {
				tf[i].setText(" ");
			}
		}
	}

}
