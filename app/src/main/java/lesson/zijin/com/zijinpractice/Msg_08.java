package lesson.zijin.com.zijinpractice;

/**
 * Created by A on 2017/5/13.
 */

public class Msg_08 {
    public static final int TYPE_SENT = 1;
    public static final int TYPE_RECEIVED = 0;
    private String content;
    private int type;
    public Msg_08(String content, int type)
    {
        this.content = content;
        this.type = type;
    }
    public String getContent()
    {
        return content;
    }
    public int getType()
    {
        return type;
    }
}
