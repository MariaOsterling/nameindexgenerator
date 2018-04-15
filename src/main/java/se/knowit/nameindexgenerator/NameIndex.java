package se.knowit.nameindexgenerator;

import org.springframework.stereotype.Component;

@Component
public class NameIndex {

    protected String generateNameIndex(String name) {
        String s = name.toLowerCase();
        // Dubbelnamn
        s = s.replaceAll("e-", "");
        s = s.replaceAll("a-", "");
        s = s.replaceAll("h-", "");
        s = s.replaceAll("-", "");
        s = s.replaceAll("e ", "");
        s = s.replaceAll("ah ", "");
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

        // Accenter
        s = s.replaceAll("é", "e");
        s = s.replaceAll("è", "e");
        s = s.replaceAll("á", "a");
        s = s.replaceAll("à", "a");
        s = s.replaceAll("ü", "y");

        //Stumma h

        s = s.replaceAll("oh", "o");
        s = s.replaceAll("ih", "i");
        s = s.replaceAll("ah", "a");
        s = s.replaceAll("eh", "e");
        s = s.replaceAll("uh", "u");

        // Bort med dubbelkonsonanter
        s = s.replaceAll("bb", "b");
        s = s.replaceAll("ff", "f");
        s = s.replaceAll("kk", "k");
        s = s.replaceAll("ll", "l");
        s = s.replaceAll("mm", "m");
        s = s.replaceAll("nn", "n");
        s = s.replaceAll("ss", "s");
        s = s.replaceAll("tt", "t");
        s = s.replaceAll("vv", "v");

        // Bort med sista bokstaven om det är e, a eller h
        s = s.replaceAll("[eah]$", "");


        // Komprimeringar hela namn

        s = s.replaceAll("sara", ".1");
        s = s.replaceAll("erik", ".2");
        s = s.replaceAll("daniel", ".3");
        s = s.replaceAll("karin", ".4");
        s = s.replaceAll("mari", ".5");
        s = s.replaceAll("joana", ".6"); // Johanna
        s = s.replaceAll("malin", ".7");
        s = s.replaceAll("amanda", ".8");
        s = s.replaceAll("rebek", ".9"); // Rebecka
        s = s.replaceAll("aleksand", ".01");
        s = s.replaceAll("kristover", ".02");

        // Diverse namnled
        s = s.replaceAll("son", "-1");
        s = s.replaceAll("sen", "-1");
        s = s.replaceAll("sin", "-1");
        s = s.replaceAll("gren", "-2");
        s = s.replaceAll("kvist", "-3");
        s = s.replaceAll("berg", "-4");
        s = s.replaceAll("lind", "-5");

        // Vanliga efternamn
        s = s.replaceAll("joan-1", "01");
        s = s.replaceAll("sven-1", "02");
        s = s.replaceAll("jan-1", "03");
        s = s.replaceAll("gustav-1", "04");
        s = s.replaceAll("nil-1", "05");
        s = s.replaceAll("karl-1", "06");
        s = s.replaceAll("ander-1", "07");

        s = s.substring(0, Math.min(20, s.length()));

        return s;
    }
}
