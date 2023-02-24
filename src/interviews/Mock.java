package interviews;

import java.util.Random;

public class Mock {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Student: " + random.nextInt(36));
        System.out.println("Question: " + random.nextInt(20));

    }
}