import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenbin
 */
public class Demo {

    private static final int MAX_LENGTH = 10;
    private static final String PRE_FIVE_NUMBERS = "00000";

    public static void main(String[] args) {
        List<Box> boxes = initData();
        boxes.forEach(box -> System.out.println(box.getMysticNumber()));
    }

    private static List<Box> initData() {
        List<Box> list = new ArrayList<>();
        String preBoxHash = "0";
        for (int i = 1; i <= MAX_LENGTH; i++) {
            Box box = new Box();
            box.setId(i);
            box.setTimestamp(System.currentTimeMillis());
            box.setPreBoxHash(preBoxHash);
            // 与神秘数字拼接成字符串，然后得到hash前5为都是数字0，也就是说得到的所有hash值前5位都是0
            String hash = box.match();
            box.setMysticNumber(getMysticNumber(hash));
            box.setHash(hash);
            preBoxHash = hash;
            list.add(box);
        }
        return list;
    }

    private static int getMysticNumber(String str) {
        int index = 0;
        try {
            while (!str.startsWith(PRE_FIVE_NUMBERS)) {
                str = str + index;
                str = SHA256Utils.sha256Hex(str.getBytes("UTF-8"));
                index ++;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return index;
    }
}