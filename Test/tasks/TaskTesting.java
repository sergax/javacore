package tasks;

import com.sergax.javacore.tasks.Task1;
import com.sergax.javacore.tasks.Task2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TaskTesting {
    @Test
    public void TestingTask1() throws Exception {
        Task1 task1 = new Task1();
        System.out.println(Arrays.toString(task1.indexReturn(new int[]{5, 6, 4, 8}, 10)));
        System.out.println(Arrays.toString(task1.indexReturnByMap(new int[]{5, 6, 4, 8,}, 10)));
    }

    @Test
    public void TestingTask2() {
        Task2 task2 = new Task2();
        System.out.println(task2.duplicatesInArray(new int[]{4, 6, 5, 6}));
        System.out.println(task2.duplicatesInArrayByList(new int[]{1}));
        System.out.println(task2.duplicatesInArrayByHashMap(new int[]{1,3,5,5}));
    }
}
