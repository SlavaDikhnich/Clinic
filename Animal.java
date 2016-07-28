/**
* ����������� �����, ����������� ��������
* @author vdikhnich
* @since 27.06.2015
*/
abstract class Animal {
	
	private String name;
	private String kind;
	
	/**
	* �����������
	* @param ��� ���������
	*/
	Animal(final String n, final String k) {
		name = n;
		kind = k;
	}
	
	/**
	* ��� �������
	*/
	String getName() {
		return name;
	}
	
	/**
	* ��� �������
	*/
	String getKind() {
		return kind;
	}
}
