/**
 * 
 */
package lambok.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Tsiry MANANKASINA
 * L'installation de lombok sur eclipse est necessaire
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of={"name"})
public class Person {
	private String name;
	private String adress;
}
