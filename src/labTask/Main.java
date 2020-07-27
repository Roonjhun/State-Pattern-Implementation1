package labTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateMachineContext sm = new StateMachineContext();

		Scanner obj = new Scanner(System.in);

		while (true) {
			System.out.println("\n Enter user input");
			int inp = obj.nextInt();
			switch (inp) {
			case 0:
				try {
					obj.close();
					sm.OperationExit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 1:
				try {
					sm.Opertaion1();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					sm.Opertaion2();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					sm.Opertaion3();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					sm.Opertaion4();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					sm.Operation5();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try {
					sm.Operation6();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				try {
					sm.Operation7();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			}
		}
		//obj.close();
	}

}
