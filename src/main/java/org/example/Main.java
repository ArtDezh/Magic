package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result;
        for (int i = 1; i <= 5; i++) {
            sb.append(new Random().nextInt());
        }

        String str = String.valueOf(sb);
        result = str.replaceAll("1", "i").replaceAll("-", "")
                .replaceAll("0", "o").replaceAll("6", "b");
        System.out.println(result);
        System.out.println(result.contains("23"));
        System.out.println(result.indexOf("ob"));

        castSpell();
    }

    public static void castSpell() {
        String str = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA".toLowerCase();
        int start = new Random().nextInt(50) + 1;
        String newStr = str.substring(start);
        StringBuilder spell = new StringBuilder(newStr);
        spell.reverse();
        char tempChar = spell.charAt(1);
        spell.replace(1, 2, String.valueOf(spell.charAt(0)));
        spell.replace(0, 1, String.valueOf(tempChar));
        System.out.println(spell);
    }
}