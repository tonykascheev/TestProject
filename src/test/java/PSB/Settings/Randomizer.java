package PSB.Settings;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Randomizer {
    public static String[] stringArr;

    public static String randomizer(String path) throws IOException {
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String str;


        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);

            }
        }
        stringArr = list.toArray(new String[0]);
        int idx = new Random().nextInt(stringArr.length);
        String random = (stringArr[idx]);
        return random;

    }

}
