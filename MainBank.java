public class MainBank
{

	public static void main(String[] args) 
	{
		
        Bank bank = new Bank("Banque Nationale");

        bank.addBranch("Montreal");

        bank.addCustomer("Montreal", "Toto", 50.05);
        bank.addCustomer("Montreal", "Martin", 175.34);
        bank.addCustomer("Montreal", "Julie", 220.12);

        bank.addBranch("Laval");
        bank.addCustomer("Laval", "Eric", 150.54);

        bank.addCustomerTransaction("Montreal", "Toto", 44.22);
        bank.addCustomerTransaction("Montreal", "Toto", 12.44);
        bank.addCustomerTransaction("Montreal", "Martin", 1.65);

        bank.listCustomers("Montreal", false);

        System.out.println("---------------------");

        bank.listCustomers("Montreal", true);

        System.out.println("---------------------");
        
        bank.listCustomers("Laval", true);

	}
}