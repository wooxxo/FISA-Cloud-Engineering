package lab02;

import java.util.Arrays;
import java.util.List;

import java.lang.Math;

public class StreamAPILab {

    static List<String> names = Arrays.asList("James", "Mary", "Robert", "Patricia", "John", "Jennifer", "Michael", "Linda", "David", "Elizabeth", "William", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Christopher", "Karen", "Charles", "Lisa", "Daniel", "Nancy", "Matthew", "Betty", "Anthony", "Margaret", "Mark", "Sandra", "Donald", "Ashley", "Steven", "Kimberly", "Paul", "Emily", "Andrew", "Donna", "Joshua", "Michelle", "Kenneth", "Dorothy", "Kevin", "Carol", "Brian", "Amanda", "George", "Melissa", "Timothy", "Deborah", "Ronald", "Stephanie", "Edward", "Rebecca", "Jason", "Sharon", "Jeffrey", "Laura", "Gregory", "Cynthia", "Jacob", "Kathleen", "Gary", "Amy", "Nicholas", "Angela", "Eric", "Shirley", "Jonathan", "Anna", "Stephen", "Brenda", "Larry", "Pamela", "Justin", "Emma", "Scott", "Nicole", "Brandon", "Helen", "Benjamin", "Samantha", "Samuel", "Katherine", "Gregory", "Christine", "Alexander", "Debra", "Patrick", "Rachel", "Frank", "Carolyn", "Raymond", "Janet", "Jack", "Catherine", "Dennis", "Maria", "Jerry", "Heather");

    static void m1() {
        List<String> result = names.stream()
        .filter(name -> name.startsWith("A"))
        .filter(name -> name.length() > 3)
        .map(String::toUpperCase)
        .map(name -> name + " is a name")
        .toList();

        //System.out.println(result);

    }

    public static void main(String[] args) {

        long m1Time = 0, beforeTime, afterTime;

        long max = -1000, min = 10000000;

        final int START = 10000000;

       //for (int i = 0; i < 20000; i++) {
       //    m1();
       //}

        for (int i = 0; i < START; i++) {
            beforeTime = System.nanoTime();
            m1();
            afterTime = System.nanoTime();

            m1Time += afterTime - beforeTime;
            max = Math.max(max, afterTime - beforeTime);
            min = Math.min(min, afterTime - beforeTime);
        }

        System.out.println("Avg: " + (m1Time / START) + "ns | " + " Max: " + max + "ns | " + " Min: " + min + "ns");
    }
}
