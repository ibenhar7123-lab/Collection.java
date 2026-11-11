package Exercice2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Apprendre Java Collections"));
        tasks.add(new Task("Faire les courses"));
        
        tasks.get(0).setCompleted(true);
        
        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}
