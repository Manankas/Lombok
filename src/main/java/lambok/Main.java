/**
 * 
 */
package lambok;

import lambok.entities.Person;

/**
 * @author Tsiry MANANKASINA
 *
 */
public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("MANANKASINA");
		
		Person p2 = new Person("RAKOTO", "");
		
		System.out.println(p2.toString());
	}

}
