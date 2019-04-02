package org.side;

import java.util.Scanner;

public class UserInput {
	
public String userEntrey() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" entree un mos");
		String inputuser = sc.nextLine();
		System.out.println(" Your entrer " + (inputuser));
		//sc.close();
		return inputuser;
	}
}
