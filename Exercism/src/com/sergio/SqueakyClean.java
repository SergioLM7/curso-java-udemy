package com.sergio;

class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(' ', '_');

        char[] identifierChar = identifier.toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < identifierChar.length; i++) {
            if(identifierChar[i] == '4') {
                identifierChar[i] = 'a';
            } else if (identifierChar[i] == '3') {
                identifierChar[i] = 'e';
            } else if (identifierChar[i] == '0') {
                identifierChar[i] = 'o';
            } else if (identifierChar[i] == '1') {
                identifierChar[i] = 'l';
            } else if (identifierChar[i] == '7') {
                identifierChar[i] = 't';
            }

            if(Character.isAlphabetic(identifierChar[i]) || identifierChar[i] == '_' ||  identifierChar[i] == '-')
                result.append(identifierChar[i]);
        }

        String[] parts = result.toString().split("-");
        result = new StringBuilder(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            if (!parts[i].isEmpty()) {
                result.append(Character.toUpperCase(parts[i].charAt(0)))
                        .append(parts[i].substring(1));
            }
        }


        return result.toString();
    }

}