import emp.Employee;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;
import emp.iBusinessTrip;

public class Company {
	
	Employee emps[] = new Employee[50];
	int cnt;
	
	void addEmployee(Employee emp) {  //Employee emp = new Permanent, Sales, PartTime("",""..);(자식들 업캐스팅해서 부모 타입으로 설정)
		emps[cnt++] = emp;
	}
	
	void allEmployeeInfo() {
		for(int i = 0; i < cnt; i++) {
			System.out.println(emps[i].toString());  //=>toString() 생략 가능
			//자식들을 new해서 Employee(부모)타입으로 설정했으니, new한 자식들의 toString()이 실행됨
		}
	}
	
	int getTotalPay() {
		int totalPay = 0;
		for(int i = 0; i < cnt; i++) {
			totalPay += emps[i].getPay();
			//자식들을 new해서 Employee(부모)타입으로 설정했으니, new한 자식들의 getPay()가 실행됨
		}
		return totalPay;
	}
	
	void regBusinessTrip(iBusinessTrip emp, int day) {  //iBusinessTip 인터페이스를 상속한 클래스만 해당 메서드를 호출할 수 있다.(상속하지 않은 클래스가 사용하면 에러 나도록)
		emp.goBusinessTrip(day);
	}
	
	public static void main(String[] args) {
		Company com = new Company();
		Permanent emp1 = new Permanent("100", "홍길동", 1000000);
		Sales emp2 = new Sales("101", "김길동", 800000, 500000);
		PartTime emp3 = new PartTime("102", "고길동", 160, 10000);
		com.addEmployee(emp1);
		com.addEmployee(emp2);
		com.addEmployee(emp3);
//		com.regBusinessTrip(emp1, 2);  //error
		com.regBusinessTrip(emp2, 2);
		com.regBusinessTrip(emp3, 2);
		com.allEmployeeInfo();
		System.out.println("총 급여액: " + com.getTotalPay());
	}
}
//출력결과
//사번:100, 이름:홍길동, 급여:1000000
//사번:101, 이름:김길동, 급여:1300000
//사번:102, 이름:고길동, 급여:1600000
//총 급여액: 3900000