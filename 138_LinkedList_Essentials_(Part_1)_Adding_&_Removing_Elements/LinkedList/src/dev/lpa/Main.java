package dev.lpa;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        var placeToVisit = new LinkedList<String>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra");
        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);

        removeElement(placeToVisit);
        System.out.println(placeToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        /// Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        /// Stack Methods
        list.push("Alice Springs");
    }

    private static void removeElement(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // remove first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // remove Last element
        System.out.println(s2 + " was removed");

        // Queue/Deque poll methods
        String p1 = list.poll(); // removes first elements
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); // removes first elements
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); // removes last elements
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brishbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");
    }
}
