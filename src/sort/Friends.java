package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friendsNames = new ArrayList<>();
        friendsNames.add("Олександра");
        friendsNames.add("Андрій");
        friendsNames.add("Сергій");
        friendsNames.add("Юлія");
        friendsNames.add("Мирослава");

        // 1 варіант
        // Collections.sort(friendsNames);
        // System.out.println(friendsNames);

        // 2 варіант
        Object[] a = friendsNames.toArray();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
