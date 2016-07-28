/**
* ������
* @author parsentev
* @since 25.03.2015
*/

public class Client {
	private final String id;
	private final Animal pet;

	/**
	* �����������
	* @param ��� �������
	* @param �������
	*/	
	public Client (String id, Animal pet) {
		this.id = id;
		this.pet = pet;
	}
	
	/**
	* ��������� ������ �������
	*/
	public String getPetName() {
		return this.pet.getName();
	}
	
	/**
	* ��������� ���� �������
	*/
	public String getPetKind() {
		return this.pet.getKind();
	}
	
	/**
	* ����������� ����� �������
	*/
	public String getClientName() {
		return this.id;
	}
	
}