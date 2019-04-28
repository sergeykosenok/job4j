package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergey Kosenok (sergey.kosenok@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
/**
*    Test echo
*/

	@Test
	public void whenTakeNameThenEchoPlusName() {
		String input = "Sergey Kosenok";
		String expect = "Echo: Sergey Kosenok";

		Calculate calc = new Calculate();
		String result = calc.echo(input);

		assertThat(result, is(expect));
	}

}
