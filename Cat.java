/**
* Реализация кошки
* @ autor vdikhnich
* @since 27.06.2015
*/

public class Cat extends Animal {
	
	/**
	* Конструктор
	* @param имя животного
	*/	
	public Cat (final String name) {
		super(name, "Cat");
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