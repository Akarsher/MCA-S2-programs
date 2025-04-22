import java.util.*;
class Bank{
	int acno;
	double bal,amt;
	String name,type;
	
	Bank(int acno,String name,String type,double bal){
		this.acno=acno;
		this.name=name;
		this.type=type;
		this.bal=bal;
	}
	void deposite(double amt){
		if(amt>0){
		  bal+=amt;
		  System.out.println("Transaction Completed Successfully ");
		  System.out.println("Deposited amount: "+amt);
		  System.out.println("Current balance: "+bal);
		}
		else{
		  System.out.println("Transaction failed.");
		}
	}
	void withdraw(double amt){
		if(amt > 0 && amt <= bal){
		  bal-=amt;
		  System.out.println("Transaction Completed Successfully ");
		  System.out.println("Withdrawed amount: "+amt);
		  System.out.println("Current balance: "+bal);
		}
		else{
		  System.out.println("Insufficient balance.");
		}
	}
	void display(){
		System.out.println("Account Details: ");
		System.out.println("Account number: "+acno);
		System.out.println("Account holders name: "+name);
		System.out.println("Account type: "+type);
		System.out.println("Current balance: "+bal);
	}
}
class Account{
	public static void main(String args[]){
		int ch;
		double amt;
		Scanner sc = new Scanner(System.in);
		Bank[] account = new Bank[2];
		
	for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            int acno = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Account Type : ");
            String type = sc.nextLine();
            System.out.print("Initial Balance: ");
            double bal = sc.nextDouble();
            
            account[i] = new Bank(acno,name,type,bal);
            } 
	do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
            	case 1:
            	System.out.println("Enter account number :");
            	int depacno = sc.nextInt();
            	System.out.println("Enter amount to deposite :");
            	amt = sc.nextDouble();
            	for(Bank acc : account){
            	    if (acc.acno == depacno){
            	       acc.deposite(amt);
            	       break;
            	    }
            	}break;
            	case 2:
            	System.out.println("Enter account number :");
            	int wdacno = sc.nextInt();
            	System.out.println("Enter amount to withdraw :");
                amt = sc.nextDouble();
            	for(Bank acc : account){
            	    if (acc.acno == wdacno){
            	       acc.withdraw(amt);
            	       break;
            	    }
            	}break;
            	case 3:
            	System.out.println("Enter account number :");
            	int acno1 = sc.nextInt();
            	for(Bank acc : account){
            	    if (acc.acno == acno1){
            	       acc.display();
            	       break;
            	    }
            	}break;
            	case 4:
            	System.out.println("exiting ...");
            	break;
            	default:
            	System.out.println("invalid choice.");	
	}
	}
	while(ch!=4);
	}
   }
