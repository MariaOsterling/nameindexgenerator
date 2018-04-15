package se.knowit.nameindexgenerator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MegaDanceControllerTest {
    private MegaDanceController megaDanceController = new MegaDanceController();

    @ParameterizedTest
    @CsvSource({
            "Mari Österling, mari Österling, true",
            "JON JOHNSON, jon johnson, true",
            "Anne-Marie, Annmarie, true",
            "Hezt, Häst, true"
    })
    void generateNameIndex(String name1, String name2, boolean expected) {
        boolean actual = megaDanceController.isSameName(name1, name2);
        assertEquals(expected, actual);
    }

}