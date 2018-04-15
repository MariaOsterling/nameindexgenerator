package se.knowit.nameindexgenerator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameIndexTest {

    private NameIndex nameIndex = new NameIndex();

    @ParameterizedTest
    @CsvSource({
            "Mari Österling, mari Österling, true",
            "JON JOHNSON, jon johnson, true",
            "Anne-Marie, Annmarie, true",
            "Hezt, Häst, true",
            "Filip Lindquist, Philiph Lindkvist, true",
            "Iréne, Irene, true",
            "John Öhlund, Jon Ölund, true",
            "Rebecca, Rebekah, true",
            "Anne Johansen, Ann Johansson, true",
            "Zälmah Lagerlöfh, Selma Lagerlöv, true",
            "Erica Janzon, Erik Jansson, true"

    })
    void compareNames(String name1, String name2, boolean expected) {
        String nameIndex1 = nameIndex.generateNameIndex(name1);
        String nameIndex2 = nameIndex.generateNameIndex(name2);

        boolean actual = nameIndex1.equals(nameIndex2);
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "Kalle Andersson, kal07",
            "Christoffer Andersson, .0207",
            "Eliah Andersson, e-5er-1",
            "Linda Janzén, -503",
            "Eric Österberg, .2oster-4"
    })
    void checkNameIndex(String name, String expected) {
        String actual = nameIndex.generateNameIndex(name);
        assertEquals(expected, actual);
    }
}