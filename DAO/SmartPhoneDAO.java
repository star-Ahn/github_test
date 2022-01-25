package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SmartPhoneDAO {
	private Connection con;//�������
	private Statement st;//������ �������
	private ResultSet rs;//���� ������ ����� ���� ����Ʈ ��(�������)
	public SmartPhoneDAO(){
		//java database connectivity
		//����Ŭ �� ���� (express����)-18c,19c,21c (express)
		//express,enterprise
		//localhost:�� ��ǻ�� (127.0.0.1)
		//1521-��Ʈ��ȣ (���α׷� ��ȣ)
		//xe-SID, SID-xe �Ǵ� orcl
		try {
			String user="c##scott";//system
			String pw="tiger";//1234
			String url="jdbc:oracle:thin:@localhost:1521:xe";//�ּ�
			Class.forName("oracle.jdbc.driver.OracleDriver");//����Ŭ ����̹� ������
			try {
				con=DriverManager.getConnection(url,user,pw);//����
				st=con.createStatement();//������Ʈ��Ʈ ��ü ����
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//�����ͺ��̽��� SQL������ ������ ���� ������Ʈ��Ʈ ��ü�� �����Ѵ�
			//Creates a Statement object for sending SQL statements to the database
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void Search() {
		String SQL="SELECT * FROM smartphone";
		try {
			rs=st.executeQuery(SQL);
			while(rs.next()) {
				String name=rs.getString("name");
				System.out.print(name+" ");
				
				String company=rs.getString("company");
				System.out.print(company+" ");
				
				int price=rs.getInt("price");
				System.out.print(price+" ");
				
				String provider=rs.getString("provider");
				System.out.print(provider+" ");
				
				int weight=rs.getInt("weight");
				System.out.print(weight+" ");
				
				String color=rs.getString("color");
				System.out.print(color+" ");
				System.out.println("");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
