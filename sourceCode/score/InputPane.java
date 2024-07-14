
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
		
		l[0]=new JLabel("�̸�    :");
		l[1]=new JLabel("�й�    :");
		l[2]=new JLabel("��ǻ�� :");
		l[3]=new JLabel("����    :");
		l[4]=new JLabel("����    :");
		l[5]=new JLabel("����    :");
		
		for(int i=0;i<6;i++) {
			tf[i] = new JTextField(15);
			p[i] = new JPanel();
			p[i].add(l[i]);
			p[i].add(tf[i]);
			
			add(p[i]);
		}
		
		p[6] = new JPanel();
		okb = new JButton("�����ϱ�");
		okb.addActionListener(this);
		
		rsb = new JButton("�ٽþ���");
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
				//JDBC���
				Class.forName("com.mysql.jdbc.Driver");
				
				//connection
				con = DriverManager.getConnection("jdbc:mysql://localhost/score?user=root&password=���");
				
				//Ŀ�ؼ����� ���� ������ sql������ �����Ű ���� 
				//statement ��ü�� ���´�.
				stmt = con.createStatement();
				
				//sum
				int sum = Integer.parseInt(tf[2].getText()) + Integer.parseInt(tf[3].getText())
					+Integer.parseInt(tf[4].getText()) +Integer.parseInt(tf[5].getText());
				
				//avg
				int avg = sum/4;
				
				//�����ų sql�� �ۼ�
				String query = "INSERT INTO score(name, snum, com, kor, eng, math, sum, avg) VALUES(";
				
				//MYSQL�� �ѱ��� �ٸ��� �Էµǵ��� �ϱ� ���� 8859-1�� ���ڵ�
				query = query + "'" + 
					new String(tf[0].getText().getBytes("KSC5601"), "8859_1") + "',";
				query = query + "'" + tf[1].getText() + "',";
				query = query + tf[2].getText() + ",";
				query = query + tf[3].getText() + ",";
				query = query + tf[4].getText() + ",";
				query = query + tf[5].getText() + ",";
				
				query = query + sum + ",";
				query = query + avg + ")";
				
				//execute()�޼��带 ����Ͽ� ������ ����
				stmt.execute(query);
				
				//statement��ü�� �ٷ� �ݴ´�.
				stmt.close();
				
				//connection close
				con.close();
								
			}catch (Exception e) {}
		}else if(ae_type.equals(rsb.getText())) {
			//�ؽ�Ʈ �ʵ带 �ʱ�ȭ
			for(int i=0;i<6;i++) {
				tf[i].setText(" ");
			}
		}
	}

}
