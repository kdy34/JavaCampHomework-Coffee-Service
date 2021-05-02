
public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		
		customer1.setFirstName("Deniz");
		customer1.setLastName("Yazýcýoðlu");
		customer1.setId(1);
		customer1.setDateTimeofBirth("2002");
		customer1.setNationalityId("12345");
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager1.save(customer1);
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(customer1);


	}

}
