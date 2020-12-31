/**
 * @author chenbin
 */
public class Box {
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
        this.id = id;
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
        this.mysticNumber = mysticNumber;
    }

    /**
     * 将宝箱编号、时间戳、上一个宝箱的Hash值组合起来
     */
    public String matchIdAndTimeStampAndPreBoxHash() {
        return id + timestamp + preBoxHash;
    }
}
