import java.util.Scanner;

public class Bank {
	
	Scanner sc = new Scanner(System.in);
	Account[] accs = new Account[100];  //null로 자동 초기화
	int cnt;  //0으로 자동 초기화

	Bank() {}
	
	int menu() {
		System.out.println("\n[코스타 은행]");
		System.out.println("0.종료");
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.계좌조회");
		System.out.println("5.전체계좌조회");
		System.out.print("선택>> ");
		return sc.nextInt();
	}
	
	void makeAccount() {
		System.out.println("\n[계좌개설]");
		System.out.print("계좌번호: ");
		String id = sc.next();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("입금액: ");
		int money = sc.nextInt();
		
		//1. Account 객체 만들기
		//2. 생성된 객체를 accs에 담기
		accs[cnt++] = new Account(id, name, money);
	}
	
	void deposit() {
		System.out.println("\n[입금]");
		System.out.print("계좌를 입력하세요: ");
		String id = sc.next();
		for(int i = 0; i < cnt; i++) {
			if(id.equals(accs[i].id)) {
				System.out.print("금액을 입력하세요: ");
				int money = sc.nextInt();
				accs[i].balance += money;
				System.out.println(money + "원이 입금되었습니다.");
				break;
			}else {
				System.out.println("해당 계좌가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	void withdraw() {
		System.out.println("\n[출금]");
		System.out.print("계좌를 입력하세요: ");
		String id = sc.next();
		for(int i = 0; i < cnt; i++) {
			if(id.equals(accs[i].id)) {
				System.out.print("금액을 입력하세요: ");
				int money = sc.nextInt();
				if(accs[i].balance >= money) {
					accs[i].balance -= money;
					System.out.println(money + "원이 출금되었습니다.");
					break;
				}else {
					System.out.println("잔액이 부족합니다.");
					break;
				}
			}else {
				System.out.println("해당 계좌가 존재하지 않습니다.");
				break;
			}
		}
	}
	
	void accountInfo() {
		System.out.println("\n[계좌조회]");
		System.out.print("계좌번호: ");
		String id = sc.next();
		
		//1. accs에서 id에 해당하는 Account를 찾는다.
		//2. 찾은 Account의 정보를 출력한다.
		for(int i = 0; i < cnt; i++) {
			if(id.equals(accs[i].id)) {
				System.out.println("계좌번호:" + accs[i].id +", 이름:" + accs[i].name + ", 잔액:" + accs[i].balance);
				break;
			}else {
				System.out.println("해당 계좌가 존재하지 않습니다.");
				break;
			}
		}

	}
	
	void allAccountInfo() {
		System.out.println("\n[전체계좌조회]");
		for(int i = 0; i < cnt; i++) {
			System.out.println("계좌번호:" + accs[i].id +", 이름:" + accs[i].name + ", 잔액:" + accs[i].balance);
		}
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		while(true) {
			int sel = bank.menu();
			if(sel == 0) break;
			switch(sel) {
			case 1: bank.makeAccount(); break;
			case 2: bank.deposit(); break;
			case 3: bank.withdraw(); break;
			case 4: bank.accountInfo(); break;
			case 5: bank.allAccountInfo(); break;
			}
		}
	}
}
