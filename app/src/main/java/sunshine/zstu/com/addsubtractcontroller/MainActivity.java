package sunshine.zstu.com.addsubtractcontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_add;
    private Button btn_subtract;
    private TextView text_number;

    private static final int min = 1;   //最小值
    private static final int max = 10;  //最大值
    private int value = 1;    //默认值,也是随点击而改变的值

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_subtract = (Button) findViewById(R.id.btn_subtract);
        text_number = (TextView) findViewById(R.id.text_number);

        text_number.setText(String.valueOf(value));
        btn_subtract.setBackgroundResource(R.drawable.rounded_rectangle_left_unclickable);

        btn_add.setOnClickListener(this);
        btn_subtract.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add:
                //加
                if (value == max) {
                    Toast.makeText(MainActivity.this, "已达到最大值", Toast.LENGTH_SHORT).show();
                } else {
                    value++;
                    if (value == max) {
                        btn_add.setBackgroundResource(R.drawable.rounded_rectangle_right_unclickable);
                    }
                    text_number.setText(String.valueOf(value));
                    btn_subtract.setBackgroundResource(R.drawable.selecter_left);
                }
                break;
            case R.id.btn_subtract:
                //减
                if (value == min) {
                    Toast.makeText(MainActivity.this, "已达到最小值", Toast.LENGTH_SHORT).show();
                } else {
                    value--;
                    if (value == min) {
                        btn_subtract.setBackgroundResource(R.drawable.rounded_rectangle_left_unclickable);
                    }
                    text_number.setText(String.valueOf(value));
                    btn_add.setBackgroundResource(R.drawable.selecter_right);
                }
                break;
        }
    }
}
