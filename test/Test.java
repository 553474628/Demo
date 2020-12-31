import java.io.UnsupportedEncodingException;

public class Test {

    @org.junit.Test
    public void testSha256() {
        String str = "123456789";
        try {
            String encodeStr = SHA256Utils.sha256Hex(str.getBytes("UTF-8"));
            System.out.println(encodeStr);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void testNull() {
        String str = null;
        try {
            String encodeStr = SHA256Utils.sha256Hex(str.getBytes("UTF-8"));
            System.out.println(encodeStr);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void testBox() {
        Box box = new Box();
        box.setId(1);
        box.setTimestamp(System.currentTimeMillis());
        box.setPreBoxHash("0");
        String result = box.matchIdAndTimeStampAndPreBoxHash();
        System.out.println(result);
    }

    @org.junit.Test
    public void testBoxException() {
        Box box = new Box();
        box.setId(0);
        box.setTimestamp(System.currentTimeMillis());
        box.setPreBoxHash("0");
        String result = box.matchIdAndTimeStampAndPreBoxHash();
        System.out.println(result);
    }

    @org.junit.Test
    public void testBoxException2() {
        Box box = new Box();
        box.setId(1);
        box.setTimestamp(System.currentTimeMillis());
        box.setPreBoxHash("0");
        box.setMysticNumber(-1);
        String result = box.matchIdAndTimeStampAndPreBoxHash();
        System.out.println(result);
    }
}