package hw1;

import java.util.HashMap;
import java.util.Map;

public class LeeTest {

    public static void main(String[] args) {
        final HashMap<String, String> MY_INFO = new HashMap<String, String>();
        MY_INFO.put("name", "Anson Lee");
        MY_INFO.put("school", "SJSU");

        for (Map.Entry<String, String> info: MY_INFO.entrySet()){
            System.out.print(info.getKey() + ": ");
            System.out.print(info.getValue() + "\n");
        }
    }
}
