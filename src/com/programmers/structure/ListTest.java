package com.programmers.structure;

import java.util.*;
/*
ArrayList 는 내부적으로 배열 구조를 사용하고 있으므로
중간에 데이터가 추가되거나 삭제될 경우 기존 데이터를 복사해 새로운 구조를 만들어야 하기 때문으로
이와 같은 경우에는 LinkedList 를 사용할 것을 권장 합니다.
 */
public class ListTest {
    public static void main(String[] args){
        List<String> l1 = new ArrayList<>();
        List<String> l2 = Arrays.asList("one", "two");
        List<String> l3 = List.of("three", "four");

        //add data
        l1.addAll(l2);
        l1.addAll(1, l3);
        l1.add("five");

        System.out.println(l1);
        //[one, three, four, two, five]

        LinkedList<String> llist = new LinkedList<>();
        llist.addAll(l2);
        llist.addAll(1, l3);
        llist.add("five");

        System.out.println(llist);
        //[one, three, four, two, five]

        System.out.println("first element: " + l1.get(0));
        System.out.println("last index of three: " + l1.lastIndexOf("three"));

        l1.set(0, "zero"); //0번째 인덱스 값 바꿈
        System.out.println("after set():element in linkedlist");
        System.out.println(l1);
        //[zero, three, four, two, five]

        Collections.sort(l1); //내림차순 정렬
        System.out.println(l1);
        //[five, four, three, two, zero]

        //오름차순 정렬
        l1.sort((Comparator<Object>) (o1, o2) -> o2.toString().compareTo(o1.toString()));
        System.out.println(l1);
        //[zero, two, three, four, five]

        System.out.println("오름차순 sort with stream api");
        l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);





    }


}
