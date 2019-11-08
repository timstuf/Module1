package com.nix;

public class UniqueNumbers {
    /*Дан массив чисел. Вернуть число уникальных символов
Пример: для 1 4 5 1 1 3 ответ 4
*/
    public int uniqueSymbols(int[] array) {
        if(array==null) throw new NullPointerException();
        if(array.length==0) throw new IllegalStateException();
        int[] unique = new int[array.length];
        boolean isUnique = true;
        int actualLength = 1;
        unique[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < actualLength; j++) {
                if (array[i] == unique[j]) {
                    isUnique = false;
                    break;
                }
                else isUnique = true;
            }
            if(isUnique)
            {
                unique[actualLength++] = array[i];
            }
        }
        return actualLength;
    }
}
