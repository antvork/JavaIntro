package Lesson.lesson4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.management.Query;

public class _Queue {
    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<Integer>();

        // queue.add(1);
        // int item = queue.remove(); // Извлечение элемента


        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); //Наивысший приоритет имеет "наименьший " элемент
        // pq.add(123);
        // pq.add(2);
        // pq.add(14);
        // pq.add(1);
        // System.out.println(pq); //[1, 2, 14, 123]
        // System.out.println(pq.poll()); //Извлечение
        // System.out.println(pq); //[2, 123, 14]

        // Deque<Integer> deque = new ArrayDeque<>();
        // deque.addFirst(1); // добавить сначала
        // deque.addLast(2);
        // deque.removeFirst(); //удаление первого элемента
        // deque.removeLast();
        // deque.offerFirst(1); //добавляет элемент в начало списка
        // deque.offerLast(2);
        // deque.pollFirst(); //удаляет первый элемент из начала списка
        // deque.pollLast();
        // deque.getFirst(); //получает первый элемент
        // deque.getLast();
        // deque.peekFirst(); //получает первый элемент
        // deque.peekLast();

        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy
         
        System.out.printf("Queue size: %d \n", states.size());  // 5
        
        // перебор коллекции        
        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }

        // очередь из объектов Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // перебор без извлечения
        for(Person p : people){
          
            System.out.println(p.getName());
        }


    }
    
}
class Person{
      
    private String name;
    public Person(String value){
          
        name=value;
    }
    String getName(){return name;}
}
