package lesson.zijin.com.zijinpractice;

public class ZhqMsg {
    public static final int TYPE_RECEIVER=0;
    public  static final int TYPE_SEND=1;

    private String content;//短信的内
    private int type;

//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    public wcbMsg() {
//        super();
//    }

    public ZhqMsg(String content, int type) {

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

