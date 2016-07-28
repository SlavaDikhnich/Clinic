/**
* Абстрактный класс, реализующий животное
* @author vdikhnich
* @since 27.06.2015
*/
abstract class Animal {
	
	private String name;
	private String kind;
	
	/**
	* Конструктор
	* @param имя животного
	*/
	Animal(final String n, final String k) {
		name = n;
		kind = k;
	}
	
	/**
	* Имя питомца
	*/
	String getName() {
		return name;
	}
	
	/**
	* Вид питомца
	*/
	String getKind() {
		return kind;
	}
}
