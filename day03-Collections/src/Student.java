import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Maths", 65);
        marks.put("Science", 80);
        marks.put("Physics", 75);
        marks.put("Java", 85);
        System.out.println(marks.get("Science"));
        System.out.println(marks.containsKey("Science"));

        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
