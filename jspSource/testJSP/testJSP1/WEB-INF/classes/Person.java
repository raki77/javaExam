/* profeel 2006 */

package foo;

public class Person
{
	private String name;
	private Dog dog;

	public Person() {
		// nothing
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}	

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog d) {
		this.dog = d;
	}

}
