/**
 * @author chenbin
 */
public class Box {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;

    private int id;
    private long timestamp;
    private String hash;
    private String preBoxHash;
    private int mysticNumber;

    public Box() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= MIN_NUMBER && id <= MAX_NUMBER) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("请输入正确范围的宝箱编号");
        }
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreBoxHash() {
        return preBoxHash;
    }

    public void setPreBoxHash(String preBoxHash) {
        this.preBoxHash = preBoxHash;
    }

    public int getMysticNumber() {
        return mysticNumber;
    }

    public void setMysticNumber(int mysticNumber) {
        if (mysticNumber < MIN_NUMBER) {
            throw new IllegalArgumentException("神秘数字必须是正整数");
        }
        this.mysticNumber = mysticNumber;
    }

    /**
     * 将宝箱编号、时间戳、上一个宝箱的Hash值组合起来
     */
    public String matchIdAndTimeStampAndPreBoxHash() {
        return id + timestamp + preBoxHash;
    }
}
