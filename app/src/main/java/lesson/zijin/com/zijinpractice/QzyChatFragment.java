package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static lesson.zijin.com.zijinpractice.R.id.input_text;

;


/**
 * Created by asus on 2017/5/15.
 */

public class QzyChatFragment extends Fragment {
    private View view;
    private ListView msgListView;
    private MsgAdapter_09 adapter = null;
    private ArrayList<Msg_09> mylist=new ArrayList<Msg_09>();
    private EditText inputText;
    private Button send;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_qianzhaoyue6109,container,false);
        findView();
        //初始化数据 将数据添加到容器中
        initData();
        //将数据放入到适配器中
        adapter=new MsgAdapter_09(getActivity(),R.layout.msg_09,mylist);
        msgListView.setAdapter(adapter);
        //按钮的监听事件
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content=inputText.getText().toString();
                //判空
                if ("".equals(content)){
                    Toast.makeText(getActivity(),"你输入的内容为空",Toast.LENGTH_SHORT).show();
                }else {
                    //不为空
                    Msg_09 msg = new Msg_09(content, Msg_09.TYPE_RECEIVED );
                    mylist.add(msg);
                    //刷新消息
                    adapter.notifyDataSetChanged();
                    msgListView.smoothScrollToPosition(mylist.size()-1);;//将listview定位到最后一行
                    inputText.setText("");//清空
                }
            }
        });
        return view;
    }

    public void findView(){
        msgListView = (ListView) view.findViewById(R.id.msg_list_view);
        inputText = (EditText) view.findViewById(input_text);
        send = (Button) view.findViewById(R.id.send);
    }
    public void initData(){
        Msg_09 msg1 = new Msg_09("你好，今天天气不错",Msg_09.TYPE_RECEIVED);
        mylist.add(msg1);
        Msg_09 msg2 = new Msg_09("是的，适合出游",Msg_09.TYPE_SENT);
        mylist.add(msg2);
        Msg_09 msg3 = new Msg_09("一起吧？",Msg_09.TYPE_RECEIVED);
        mylist.add(msg3);
    }
}
