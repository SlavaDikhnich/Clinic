/**
* Работа клиники
* @author parsentev
* @since 30.06.2016
*/
public class ClinicRunner {
	public static void main (String args[]) {
		final Clinic clinic = new Clinic(10);
		final String nullResult = "-1";
		
		clinic.addClient(0, new Client("Brown", new Cat ("Kitty")));
		clinic.addClient(1, new Client("Grey",  new Dog ("Gav")));
		clinic.addClient(2, new Client("Blue",  new Cat ("Tom")));
		clinic.addClient(3, new Client("Red",   new Dog ("Rrrr")));
		clinic.addClient(4, new Client("Dark",  new Cat ("Tihon")));
		
		System.out.println();
		clinic.printClinicClients();
		
		clinic.addClient(5, new Client("White", new Dog ("Bubble")));
		clinic.addClient(6, new Client("Pink",  new Cat ("Pushok")));
		clinic.addClient(7, new Client("Orange",new Dog ("Bum")));
		clinic.addClient(8, new Client("Black", new Cat ("Musya")));
		clinic.addClient(9, new Client("Yellow", new Dog ("Rex")));
		
		System.out.println();
		System.out.println("Список клиентов и их питомцев:");
		
		clinic.printClinicClients();
		
		System.out.println();
		
		System.out.println("Найдем клиента для питомца с именем Tihon");
		final Client cl1 = clinic.findClientsByPetName("Tihon");
		
		System.out.println();
		
		System.out.println("Найдем клиента для питомца с именем Murka");
		final Client cl2 = clinic.findClientsByPetName("Murka");
		
		System.out.println();
		
		System.out.println("Добавим нового клиента в пятую ячейку.");
		clinic.addClient(4, new Client("Magic", new Cat("SSS")));
		
		System.out.println();
		
		System.out.println("Список клиентов и их питомцев:");
		clinic.printClinicClients();
		
		System.out.println();
		System.out.println("Удалим клиента с именем Orange");
		clinic.deleteClient("Orange");
		System.out.println();
		clinic.printClinicClients();
		
		System.out.println();
		System.out.println("Изменим имя клиента Black на Green");
		clinic.changeClientName("Black","Green");
		System.out.println();
		clinic.printClinicClients();
	}
	
	
}