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
			System.out.println("������ �Է��ϼ���");
			System.out.print(">");
			account[i].setName(scanner.next());
			
			System.out.println("���� ����:" + account[i].getName());
			
			System.out.println("�ܰ� �Է��ϼ���");
			System.out.print(">");
			account[i].setBalance(scanner.nextInt());
			
			System.out.println("���� �ܰ�:" + account[i].getBalance());
			System.out.println("=========================");
		}
		
	}
	
}
