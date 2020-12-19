package com.programmers.structure;

import java.util.*;

/*
최종적으로 컬렉션 c1 의 데이터는 one, two, three, four, five 가 됨.
HashSet 의 특성상 순서가 보장되지 않으므로 데이터를 넣는 순서대로 출력되는 것은 아님.
4가지 방법으로 데이터를 출력하고 있으므로 동일 결과가 4번 반복됨.
 */
public class ColllectionTest {
    public static void main(String[] args) {
        Collection<String> c1 = new HashSet<>();
        c1.add("one");
        c1.add("two");

        Collection<String> c2 = Arrays.asList("three", "four");
        Collection<String> c3 = Collections.singleton("five");

        c1.addAll(c2);
        c1.addAll(c3);

        System.out.println("Size of c1: " + c1.size());
        Object[] converted1 = c1.toArray();
        String[] converted2 = c1.toArray(new String[c1.size()]);

        for (String s : c1) {
            System.out.println(s);
        }

        for (int i = 0; i < converted2.length; i++) {
            System.out.println(converted2[i]);
        }

        Iterator iter = c1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        c1.forEach(System.out::println);

    }
}
