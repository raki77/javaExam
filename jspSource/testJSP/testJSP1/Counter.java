/* profeel 2006 */
package foo;

public class Counter
{

	private static int count;

	public static synchronized int getCount() {
		count++;
		return count;
	}

}
