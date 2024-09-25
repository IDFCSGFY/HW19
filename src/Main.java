import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("\n#1\n");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

        //2
        System.out.println("\n#2\n");

        Set<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numSet.add(num);
            }
        }
        System.out.println(numSet);

        //3
        System.out.println("\n#3\n");

        List<String> initialList = new ArrayList<>(List.of("да", "нет", "нет", "да", "нет", "возможно", "нет", "вероятно", "может", "да"));
        Set<String> wordSet = new HashSet<>(initialList);
        System.out.println(wordSet);

        //4
        System.out.println("\n#4\n");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> strMap = new HashMap<>();
        for (String string : strings) {
            if (strMap.containsKey(string)) {
                Integer temp = strMap.get(string);
                strMap.put(string, strMap.get(string) + 1);
            } else {
                strMap.put(string, 1);
            }
        }
        System.out.println(strMap);
    }
}
