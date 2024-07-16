/* profeel 2006 */
package foo;

public class Dog
{

	private String name;
	private Dog dog;
	private Toy[] toys;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setToys(Toy[] toys) {
		this.toys = toys;
	}

	public Toy[] getToys() {
		return toys;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Dog getDog() {
		return dog;
	}

}
