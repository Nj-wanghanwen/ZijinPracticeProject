package lesson.zijin.com.zijinpractice;

/**
 * Created by 王陈博 on 2017/3/26.
 */

public class cylMsg {
    public static final int TYPE_RECEIVER=0;
    public  static final int TYPE_SEND=1;

    private String content;//短信的内容
    private int type;

//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    public cylMsg() {
//        super();
//    }

    public cylMsg(String content, int type) {

        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

//    public void setContent(String content) {
//        this.content = content;
//    }

    public int getType() {
        return type;
    }

//    public void setType(int type) {
//        this.type = type;
//    }
}
