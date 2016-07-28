/**
* Класс, описывающий клинику
* @author parsentev
* @since 25.03.2015
*/
public class Clinic {
	/**
	* Список клиентов
	*/
	private final Client[] clients;
	
	public Clinic (final int size) {
		this.clients = new Client[size];
	}
	
	/**
	* Добавить клиента
	* @param position Позиция
	* @param client Клиент
	*/ 
	public void addClient(final int position, final Client client) {
		if (position > -1 && position < clients.length) {
			this.clients[position] = client;
		} else {
			System.out.println("Заданный идентификатор выходит за размер массива");
		}
	}
	
	/**
	* Найти клиента по имени питомца
	* @param name Имя питомца
	*/
	public Client findClientsByPetName (final String name) {
		int p = -1;													// Если клиент не найден, значение останется -1
		final Client nullClient = new Client("-1", new Cat("-1"));	// Пустой клиент для возврата, если нужный клиент не найден
		
		for (int i = 0; i < this.clients.length; i++) {
			if (name.equals(this.clients[i].getPetName())) {
				p = i;
			}
		}
		
		if (p == -1) {
			System.out.println("В клинике нет питомца с именем " + name);
		}
		else {
			System.out.println("Питомец с именем " + name + " вида " + this.clients[p].getPetKind() + " живет у клиента " + this.clients[p].getClientName());
		}
		
		return  p == -1 ? nullClient : this.clients[p]; 
	}
	
	/**
	* Найти клиента по имени
	* @param name Имя клиента
	*/
	public Client findClientByName (final String cl_name) {
		int p = -1;
		final Client nullClient = new Client("-1", new Cat("-1"));		
		
		for (int i = 0; i < this.clients.length; i++) {
			if (cl_name.equals(this.clients[i].getClientName())) {
				p = i;
			}
		}
		
		if (p == -1) {
			System.out.println("В клинике нет клиента с именем " + cl_name);
		}
		else {
			System.out.println("У клиента с именеи " + cl_name + " живет питомец " + this.clients[p].getPetName());
		}
		
		return p == -1 ? nullClient : this.clients[p]; 
	}
	
	/**
	* Показать список клиентов
	*/
	public void printClinicClients() {
		
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				System.out.println(clients[i]);
			} else {
				System.out.println(i + " " + clients[i].getClientName() + " " + clients[i].getPetKind() + " " + clients[i].getPetName());
			}
		}
	}
	
	/**
	* Удалить клиента
	* @param name Имя клиента
	*/
	public void deleteClient (final String name ) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && name.equals(this.clients[i].getClientName())) {
				this.clients[i] = null;
				System.out.println("Клиент с именем " + name + " удален.");
			}
		}
	}
	
	/**
	*	Изменить имя клиента
	*	@param name
	*   @param new_name
	*/
	public void changeClientName (final String name, final String new_name) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && name.equals(this.clients[i].getClientName())) {
				if ( "Cat".equals(clients[i].getPetKind())) {
					addClient(i, new Client(new_name, new Cat (clients[i].getPetName())));
				} else {
					addClient(i, new Client(new_name, new Dog (clients[i].getPetName())));
				}
			}
		}		
	}
	
	
	
	
	
	
}