package com.nix;

public class Symbols {
    public boolean checkSymbols(String s) {
        if(s.length()==0) return true;
        if (s.length() % 2 != 0) return false;
        char[] characters = s.toCharArray();

        char[] brackets = new char[s.length()];
        int actualLength = 0;
        for(int i = 0; i<characters.length; i++)
        {
            if(characters[i] == '(' || characters[i] == '{' || characters[i] == '[')
            {
                brackets[actualLength++] = characters[i];
            }
            else
            {
                if(actualLength==0) return false;
                if(characters[i]==')' && brackets[actualLength-1]!= '(') return false;
                if(characters[i]=='}' && brackets[actualLength-1]!= '{') return false;
                if(characters[i]==']' && brackets[actualLength-1]!= '[') return false;
                System.arraycopy(brackets, 0, brackets, 0, --actualLength);
            }
        }
        if(actualLength==0) return true;
        else return false;
    }
}
