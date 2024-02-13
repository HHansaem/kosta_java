import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("driver", "org.mariadb.jdbc.Driver");
		props.setProperty("url", "jdbc:mariadb://localhost:3306/testdb");
		props.setProperty("user", "root");
		props.setProperty("password", "7564");
		
		try {
//			props.store(new FileOutputStream("props.properties"), "Database connection");
			props.storeToXML(new FileOutputStream("props.xml"), "Database connection");
			//FileOutputStream : 파일에 byte단위의 데이터 생성 후 저장
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
