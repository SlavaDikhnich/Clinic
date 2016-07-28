/**
* Клиент
* @author parsentev
* @since 25.03.2015
*/

public class Client {
	private final String id;
	private final Animal pet;

	/**
	* Конструктор
	* @param имя клиента
	* @param питомец
	*/	
	public Client (String id, Animal pet) {
		this.id = id;
		this.pet = pet;
	}
	
	/**
	* Получение клички питомца
	*/
	public String getPetName() {
		return this.pet.getName();
	}
	
	/**
	* Получение вида питомца
	*/
	public String getPetKind() {
		return this.pet.getKind();
	}
	
	/**
	* Возвращение имени клиента
	*/
	public String getClientName() {
		return this.id;
	}
	
}