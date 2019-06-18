import java.util.Scanner;

public class AccountExample{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Account[] account = { 
				new Account(),
				new Account(),
				new Account(),
				new Account(),
				new Account(),
				};
		for(int i=0; i<account.length; i++) {
			System.out.println("고객명을 입력하세요");
			System.out.print(">");
			account[i].setName(scanner.next());
			
			System.out.println("현재 고객명:" + account[i].getName());
			
			System.out.println("잔고를 입력하세요");
			System.out.print(">");
			account[i].setBalance(scanner.nextInt());
			
			System.out.println("현재 잔고:" + account[i].getBalance());
			System.out.println("=========================");
		}
		
	}
	
}
