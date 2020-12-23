package com.programmers.structure;

import java.util.*;
/*
Set : 중복 허용 안함
HashSet : 순서 유지 안됨
LinkedHashSet : 입력된 순서대로 데이터가 저장됨
TreeSet : 오름차순 정렬

 */
public class SetTest {
    public static void main(String[] args){
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = Set.of("three", "four");

        s1.addAll(Arrays.asList("one", "two"));
        s1.addAll(s2);
        s1.add("five");
        s1.add("two");
        s1.remove("five");

        System.out.println(s1);
        //[four, one, two, three] 순서유지안됨

        s1.forEach(System.out::println);

        System.out.println(s1.contains("one"));
        //true

        Set<String> lset = new LinkedHashSet<>(Arrays.asList("one", "two", "three", "four"));
        lset.add("five");

        System.out.println(lset);
        //[one, two, three, four, five] 데이터가 입력된 순서대로 저장

        System.out.println("print element using Iterator");
        Iterator<String> iter = lset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Set<Integer> tset = new TreeSet<>(Arrays.asList(50, 10, 60, 20));
        System.out.println(tset);
        //[10, 20, 50, 60] 오름차순정렬

        tset.stream().sorted((o1, o2) -> o2.toString().compareTo(o1.toString())).forEach(System.out::println);
        // 60 50 20 10 내림차순 정렬

    }
}
