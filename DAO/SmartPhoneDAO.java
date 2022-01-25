package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SmartPhoneDAO {
	private Connection con;//연결관련
	private Statement st;//쿼리문 실행관련
	private ResultSet rs;//쿼리 실행한 결과를 담을 리절트 셋(결과집합)
	public SmartPhoneDAO(){
		//java database connectivity
		//오라클 씬 버전 (express버전)-18c,19c,21c (express)
		//express,enterprise
		//localhost:내 컴퓨터 (127.0.0.1)
		//1521-포트번호 (프로그램 번호)
		//xe-SID, SID-xe 또는 orcl
		try {
			String user="c##scott";//system
			String pw="tiger";//1234
			String url="jdbc:oracle:thin:@localhost:1521:xe";//주소
			Class.forName("oracle.jdbc.driver.OracleDriver");//오라클 드라이버 가져옴
			try {
				con=DriverManager.getConnection(url,user,pw);//연결
				st=con.createStatement();//스테이트먼트 객체 생성
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//데이터베이스에 SQL문자을 보내기 위한 스테이트먼트 객체를 생성한다
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
