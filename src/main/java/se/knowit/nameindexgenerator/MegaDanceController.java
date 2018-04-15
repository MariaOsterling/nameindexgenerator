package se.knowit.nameindexgenerator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaDanceController {

    @RequestMapping(value = "/greeting",method= RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + generateNameIndex(name);
    }

    protected boolean isSameName(String name1, String name2) {
        String nameIndex1 = generateNameIndex(name1);
        String nameIndex2 = generateNameIndex(name2);

        return nameIndex1.equals(nameIndex2);

    }

    private String generateNameIndex(String name){
        String s = name.toLowerCase();
        // Dubbelnamn
        s = s.replaceAll("e-", "");
        s = s.replaceAll("a-", "");
        s = s.replaceAll("h-", "");
        s = s.replaceAll("-", "");
        s = s.replaceAll("e ", "");
        s = s.replaceAll("a ", "");
        s = s.replaceAll("h ", "");
        s = s.replaceAll(" ", "");

        // Omskrivningar för andra bokstäver
        s = s.replaceAll("ch", "k");
        s = s.replaceAll("ck", "k");
        s = s.replaceAll("ph", "f");
        s = s.replaceAll("th", "t");
        s = s.replaceAll("qu", "kv");
        s = s.replaceAll("qv", "kv");
        s = s.replaceAll("ea", "a");
        s = s.replaceAll("oe", "o");
        s = s.replaceAll("ou", "o");
        s = s.replaceAll("ae", "e");
        s = s.replaceAll("aa", "a");
        s = s.replaceAll("ie", "i");
        s = s.replaceAll("ia", "i");

        // Bort med vissa bokstäver
        s = s.replaceAll("ä", "e");
        s = s.replaceAll("å", "a");
        s = s.replaceAll("ö", "o");
        s = s.replaceAll("c", "k");
        s = s.replaceAll("w", "v");
        s = s.replaceAll("z", "s");
        s = s.replaceAll("f", "v");
        s = s.replaceAll("x", "ks");
        s = s.replaceAll("'", "");
        s = s.replaceAll("\\.", "");

        return s;
    }
}
