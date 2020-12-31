/**
 * @author chenbin
 */
public class Box {
    private int id;
    private String timestamp;
    private String hash;
    private String preBoxHash;
    private int mysticNumber;

    public Box() {
    }

    public Box(int id, String timestamp, String hash, String preBoxHash, int mysticNumber) {
        this.id = id;
        this.timestamp = timestamp;
        this.hash = hash;
        this.preBoxHash = preBoxHash;
        this.mysticNumber = mysticNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
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
     * 将宝箱编号、时间戳、上一个宝箱的Hash值、神秘数字拼成一个字符串
     */
    public String match() {
        return id + timestamp + preBoxHash + mysticNumber;
    }
}
