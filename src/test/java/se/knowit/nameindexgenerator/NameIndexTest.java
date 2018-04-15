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
            "Zälmah Lagerlöfh, Selma Lagerlöv, true"

    })
    void generateNameIndex(String name1, String name2, boolean expected) {
        boolean actual = nameIndex.isSameName(name1, name2);
        assertEquals(expected, actual);
    }

}