package pack.capg.module.collections2;

import java.util.Iterator;

/*
 *  A banking system needs to manage customer accounts efficiently. The system must perform various
    operations, such as:
      
Adding a new account.
Depositing money into an account.
Withdrawing money from an account.
Checking the balance of an account.
Removing inactive accounts.
Displaying accounts with the highest and lowest balances.

 The system needs to maintain unique accounts (no duplicates), perform operations like deposit and withdrawal,
 and track inactive accounts. Additionally, the system should support streaming and iterating over accounts 
 to find those with the maximum and minimum balances.
 To implement this system, we will use the Set interface (via HashSet) to store unique account details and 
 leverage Java 8 streams and iteration techniques for performing operations.
 */

import java.util.LinkedHashSet;
import java.util.ListIterator;

public class BankingSys {
	public static void display(LinkedHashSet<BankAccount> customers) {
		for(BankAccount acc : customers) {
			System.out.println(acc);
		}
	}

	public static void main(String[] args) {
		LinkedHashSet<BankAccount> customers = new LinkedHashSet<BankAccount>();
//		SortedSet<Student> students = new TreeSet<Student>();
		customers.add(new BankAccount(101, "ABC",1000));
		customers.add(new BankAccount(102, "XYZ",2000));
		
		// display 
		System.out.println("Display All Accounts : ");
		display(customers);
		
		// add new acc
		System.out.println("Adding new Account: ");
		Iterator<BankAccount> itr = customers.iterator();
		customers.add(new BankAccount(103, "acc3",3000));
		itr.add(new BankAccount(104, "acc4",5000));
		display(customers);
		
		// deposit

		
		// withdraw
		
		// check bal
		
		// display highest and lowest acc bal:
		
		System.out.println("\n Student in the list >= 102 " + stu.higher(new Student(102,"","")));
		System.out.println("\n Student in the list < id 105 " + stu.lower(new Student(105,"","")));
		
	}

}
