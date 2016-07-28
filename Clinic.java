/**
* �����, ����������� �������
* @author parsentev
* @since 25.03.2015
*/
public class Clinic {
	/**
	* ������ ��������
	*/
	private final Client[] clients;
	
	public Clinic (final int size) {
		this.clients = new Client[size];
	}
	
	/**
	* �������� �������
	* @param position �������
	* @param client ������
	*/ 
	public void addClient(final int position, final Client client) {
		if (position > -1 && position < clients.length) {
			this.clients[position] = client;
		} else {
			System.out.println("�������� ������������� ������� �� ������ �������");
		}
	}
	
	/**
	* ����� ������� �� ����� �������
	* @param name ��� �������
	*/
	public Client findClientsByPetName (final String name) {
		int p = -1;													// ���� ������ �� ������, �������� ��������� -1
		final Client nullClient = new Client("-1", new Cat("-1"));	// ������ ������ ��� ��������, ���� ������ ������ �� ������
		
		for (int i = 0; i < this.clients.length; i++) {
			if (name.equals(this.clients[i].getPetName())) {
				p = i;
			}
		}
		
		if (p == -1) {
			System.out.println("� ������� ��� ������� � ������ " + name);
		}
		else {
			System.out.println("������� � ������ " + name + " ���� " + this.clients[p].getPetKind() + " ����� � ������� " + this.clients[p].getClientName());
		}
		
		return  p == -1 ? nullClient : this.clients[p]; 
	}
	
	/**
	* ����� ������� �� �����
	* @param name ��� �������
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
			System.out.println("� ������� ��� ������� � ������ " + cl_name);
		}
		else {
			System.out.println("� ������� � ������ " + cl_name + " ����� ������� " + this.clients[p].getPetName());
		}
		
		return p == -1 ? nullClient : this.clients[p]; 
	}
	
	/**
	* �������� ������ ��������
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
	* ������� �������
	* @param name ��� �������
	*/
	public void deleteClient (final String name ) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && name.equals(this.clients[i].getClientName())) {
				this.clients[i] = null;
				System.out.println("������ � ������ " + name + " ������.");
			}
		}
	}
	
	/**
	*	�������� ��� �������
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