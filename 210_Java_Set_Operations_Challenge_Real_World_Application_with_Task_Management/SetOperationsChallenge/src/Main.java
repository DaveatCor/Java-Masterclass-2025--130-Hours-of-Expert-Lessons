import dev.lpa.Task;
import dev.lpa.TaskData;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annaTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annaTasks);

        Set<Task> bobsTasks = TaskData.getTasks("Bob");
        Set<Task> carolsTasks = TaskData.getTasks("Carol");
        List<Set<Task>> sets = List.of(annaTasks, bobsTasks, carolsTasks);

        Set<Task> assignedTasks = getUnion(sets);
        sortAndPrint("Assigned Tasks", assignedTasks);

        Set<Task> everyTask = getUnion(List.of(tasks, assignedTasks));
        sortAndPrint("The True All Tasks", everyTask);

        Set<Task> missingTaskes = getDifference(everyTask, tasks);
        sortAndPrint("Missing tasks", missingTaskes);

        Set<Task> unassignedTasks = getDifference(tasks, assignedTasks);
        sortAndPrint("Unassigned tasks", unassignedTasks, sortByPriority);

        Set<Task> overlap = getUnion(List.of(getIntersect(annaTasks, bobsTasks), getIntersect(carolsTasks, bobsTasks), getIntersect(annaTasks, carolsTasks)));
        sortAndPrint("Assigned to Multiples", overlap, sortByPriority);

        List<Task> overlapping = new ArrayList<>();
        for (Set<Task> set : sets){
            Set<Task> dupes = getIntersect(set, overlap);
            overlapping.addAll(dupes);
        }

        Comparator<Task> priorityNatural = sortByPriority.thenComparing(Comparator.naturalOrder());

        sortAndPrint("Overlapping", overlapping, priorityNatural);
    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private  static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter){
        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }

    private  static Set<Task> getUnion(List<Set<Task>> sets){
        Set<Task> union = new HashSet<>();
        for (var taskSet : sets) {
            union.addAll(taskSet);
        }
        return  union;
    }

    private static Set<Task> getIntersect(Set<Task> a, Set<Task> b){
        Set<Task> intersect = new HashSet<>(a);
        intersect.retainAll(b);
        return intersect;
    }

    private  static Set<Task> getDifference(Set<Task> a, Set<Task> b){
        Set<Task> result = new HashSet<>(a);
        result.removeAll(b);
        return  result;
    }
}