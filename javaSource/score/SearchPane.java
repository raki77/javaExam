import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.*;

public class SearchPane extends JPanel implements ActionListener{

	//jdbc
	private String url = "jdbc:odbc:score";
	private Connection con;
	private Statement stmt;
	
	//Swing
	private JPanel p[];
	private JLabel l[];
	private JTextField tf[];
	private JButton okb;
	private JButton rsb;
	
	public SearchPane() {
		setLayout(new GridLayout(9,1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		p = new JPanel[9];
		l = new JLabel[8];
		tf = new JTextField[8];
		
		l[0] = new JLabel("��   ��:");
		l[1] = new JLabel("��   ��:");
		l[2] = new JLabel("��ǻ��:");
		l[3] = new JLabel("��   ��:");
		l[4] = new JLabel("��   ��:");
		l[5] = new JLabel("��   ��:");
		l[6] = new JLabel("��   ��:");
		l[7] = new JLabel("��   ��:");
		
		for(int i=0; i<8; i++) {
			tf[i] = new JTextField(15);
			p[i] = new JPanel();
			p[i].add(l[i]);
			p[i].add(tf[i]);
			
			add(p[i]);
		}
		
		tf[2].setEditable(false);
		tf[3].setEditable(false);
		tf[4].setEditable(false);
		tf[5].setEditable(false);
		tf[6].setEditable(false);
		tf[7].setEditable(false);
		
		p[8] = new JPanel();
		okb = new JButton("���� ��ȸ");
		okb.addActionListener(this);
		
		rsb = new JButton("�ٽ� ����");
		rsb.addActionListener(this);

		p[8].add(okb);
		p[8].add(rsb);

		add(p[8]);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String ae_type = ae.getActionCommand();
		if(ae_type.equals(okb.getText())) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/score?user=root&password=���");
				stmt = con.createStatement();
				
				//select
				String query = "SELECT * FROM score WHERE name=";
				query = query + "'" + new String(tf[0].getText().getBytes("KSC5601"),"8859_1");
				query = query + "' and snum='" + tf[1].getText() + "'";
				
				//executeQuery() �޼���� select���� �����Ű�� �����
				//ResultSet ��ü�� �޴´�.
				ResultSet rs = stmt.executeQuery(query);
				
				//���ڵ尡 �ִ��� �˻�
				if(rs.next()) {
					tf[0].setText(new String(rs.getString("name").getBytes("8859_1"),"KSC5601"));
					tf[1].setText(rs.getString("snum"));
					tf[2].setText(""+ rs.getInt("com"));
					tf[3].setText(""+ rs.getInt("kor"));
					tf[4].setText(""+ rs.getInt("eng"));
					tf[5].setText(""+ rs.getInt("math"));
					tf[6].setText(""+ rs.getInt("sum"));
					tf[7].setText(""+ rs.getInt("avg"));
				}
				stmt.close();
				con.close();
			}catch(Exception e) {e.printStackTrace(); }
		}else if(ae_type.equals(rsb.getText())) {
			for(int i=0; i<8; i++) {
				tf[i].setText(" ");
			}
		}
	}

}
