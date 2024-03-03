package Jiwon_Kim;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class practice_ArrayDeque {
    public static void main(String[] args) {

        // 선언 + 선언 & 초기값 세팅
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(1,2,3));

        // 데이터 추가
        deque.addFirst(1); // 앞으로 삽입
        System.out.println(deque.add(2)); // true 반환
        deque.addLast(3); // 뒤로 삽입
        System.out.println(deque); // [1, 2, 3]

        deque.addAll(Arrays.asList(4,5,6)); // 한꺼번에 삽입
        System.out.println(deque); // [1, 2, 3, 4, 5, 6]

        System.out.println(deque.pop()); // 1 (앞에서 나옴)
        System.out.println(deque.size()); // 5

        // 제거 등
        System.out.println(deque.removeLast()); // 6
        System.out.println(deque.remove()); // 2
        System.out.println(deque.removeFirst()); // 3

        // 알고리즘을 풀이할 때는 직관적인 메서드를 사용하도록 한다.
        //
        // 1 스택 활용시
        // - 뒤에 추가 ⇒ addLast()
        // - 뒤에서 제거 ⇒ removeLast()
        //
        // 2 큐 활용시
        // - 뒤에 추가 ⇒ addLast()
        // - 앞에서 제거 ⇒ removeFirst()
    }
}
