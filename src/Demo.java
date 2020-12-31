import java.util.ArrayList;
import java.util.List;

/**
 * @author chenbin
 */
public class Demo {
    public static void main(String[] args) {

    }


    /*考题：在一个房间里有10个神秘的宝箱，全部打开就能过关
    宝箱有以下几个属性：宝箱编号、时间戳、Hash值、上一个宝箱的Hash值、神秘数字
    宝箱属性说明：
    宝箱编号：从1到10；
    时间戳：当你尝试打开宝箱时，记录下时间；
    Hash值：将宝箱编号、时间戳、上一个宝箱的Hash值、神秘数字拼成一个字符串，然后求字符串的Hash值，Hash统一采用sha256算法；
    上一个宝箱的Hash值：上一个序号的宝箱的Hash值，1号宝箱的上一个宝箱的Hash值是0；
    神秘数字：可以打开宝箱的神秘数字，是一个正整数；
    宝箱开启规则：找到那个神秘数字，使得宝箱的Hash值的前5位都是数字0，宝箱即为开启状态
    1.找到1-10号宝箱对应的神秘数字*/

    private void initData() {
        List<Box> list = new ArrayList<>();
        String preBoxHash = "0";
        for (int i = 1; i <= 10; i++) {
            Box box = new Box(i, String.valueOf(System.currentTimeMillis()), "0", "0", 0);
            box.setPreBoxHash(preBoxHash);
            box.setMysticNumber();
            // 与神秘数字拼接成字符串，然后得到hash前5为都是数字0，也就是说得到的所有hash值前5位都是0
            String hash = box.match();
            box.setHash(hash);
            preBoxHash = hash;
            list.add(box);
        }
    }
}
