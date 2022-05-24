package cntt61.mssv60136773.bai1_thigiuaki;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editCa,editCb, editCh;
    TextView textViewKetQua;
    Button nutCV,nutDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editCa = (EditText)findViewById(R.id.edCa);
        editCb = (EditText)findViewById(R.id.edCb);
        editCh = (EditText)findViewById(R.id.edCh);
        textViewKetQua = (TextView)findViewById(R.id.tvKetQua);
        nutCV = (Button)findViewById(R.id.btnCV);
        nutDT = (Button)findViewById(R.id.btnDT);

    }

    public void XuLyCV(View v){
        String canhA = editCa.getText().toString();
        String canhB = editCb.getText().toString();

        int a = Integer.parseInt(canhA);
        int b = Integer.parseInt(canhB);

        int cv = (a+b)*2;

        String chuoiCV = String.valueOf(cv);

        textViewKetQua.setText("Chu vi là: "+ chuoiCV);
    }

    public void XuLyDT(View v){
        String canhA = editCa.getText().toString();
        String duongCao = editCh.getText().toString();
        int a = Integer.parseInt(canhA);
        int h = Integer.parseInt(duongCao);
        int s = a*h;
        String chuoiDT = String.valueOf(s);

        textViewKetQua.setText("Diện tích là: "+ chuoiDT);
    }

}