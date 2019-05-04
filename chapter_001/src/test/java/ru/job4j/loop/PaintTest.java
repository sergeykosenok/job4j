package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author S Kosenok (sergeykosenok@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {

    @Test
    public void whenPyramid4Height() {
        Paint paint = new Paint();
        String piramid = paint.piramid(4);
        System.out.println(piramid);
        assertThat(piramid,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }

    @Test
    public void whenPyramid15Height() {
        Paint paint = new Paint();
        String piramid = paint.piramid(15);
        System.out.println(piramid);
        assertThat(piramid,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("              ^              ")
                                .add("             ^^^             ")
                                .add("            ^^^^^            ")
                                .add("           ^^^^^^^           ")
                                .add("          ^^^^^^^^^          ")
                                .add("         ^^^^^^^^^^^         ")
                                .add("        ^^^^^^^^^^^^^        ")
                                .add("       ^^^^^^^^^^^^^^^       ")
                                .add("      ^^^^^^^^^^^^^^^^^      ")
                                .add("     ^^^^^^^^^^^^^^^^^^^     ")
                                .add("    ^^^^^^^^^^^^^^^^^^^^^    ")
                                .add("   ^^^^^^^^^^^^^^^^^^^^^^^   ")
                                .add("  ^^^^^^^^^^^^^^^^^^^^^^^^^  ")
                                .add(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^ ")
                                .add("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
                                .toString()
                )
        );
    }
}