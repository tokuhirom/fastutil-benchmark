package com.example;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import org.openjdk.jol.info.GraphLayout;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hello {
    public static void main(String[] args) {
        List<Integer> sizeList = Arrays.asList(
                1,
                10,
                100,
                1000,
                10000,
                100000);
        System.out.printf("%s\t%s\t%s\n", "Size", "HashMap", "Int2ObjectArrayMap");
        for (Integer size : sizeList) {
            Map<Integer, String> hashMap = buildHashMap(size);
            Map<Integer, String> int2ObjectArrayMap = buildInt2ObjectArrayMap(size);

            long hashMapSize = GraphLayout.parseInstance(hashMap).totalSize();
            long int2ObjectArrayMapSize = GraphLayout.parseInstance(int2ObjectArrayMap).totalSize();

            System.out.printf("%d\t%d\t%d\n", size, hashMapSize, int2ObjectArrayMapSize);
        }
    }

    private static Map<Integer, String> buildInt2ObjectArrayMap(Integer size) {
        Int2ObjectArrayMap<String> map = new Int2ObjectArrayMap<>();
        for (int i = 0; i < size; i++) {
            map.put(i, "");
        }
        return map;
    }

    private static Map<Integer, String> buildHashMap(Integer size) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(i, "");
        }
        return map;
    }
}
