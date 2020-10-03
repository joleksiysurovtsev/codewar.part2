package com.company.level8.Merging_sorted_integer_arrays_withoutduplicates;

import java.util.stream.IntStream;

public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().sorted().toArray();
                //поток  соеденяем       масив 1                масив 2   удаляем дубликаты сортируем в масив
    }
}