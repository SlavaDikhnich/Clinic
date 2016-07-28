/**
* ���������� ������
* @ autor vdikhnich
* @since 27.06.2015
*/

public class Dog extends Animal {
	
	private String kind;
	/**
	* �����������
	* @param ��� ���������
	*/	
	public Dog (final String name) {
		super(name, "Dog");
	}
	
	/**
	* (@inheritDoc)
	*/
	@Override
	public String getName() {
		return super.getName();
	}
	
	/**
	* (@inheritDoc)
	*/
	@Override
	public String getKind() {
		return super.getKind();
	}
}