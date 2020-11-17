package kr.hs.e_mirim.s2019s04.mirimtoastdialogtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textName, textEmail, textToast;
    EditText editName, editEmail;
    View dialogView, toastView;
    Button btnHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.text_name);
        textEmail = findViewById(R.id.text_email);
        textToast = findViewById(R.id.text_toast);
        editName = findViewById(R.id.edit_name);
        editEmail = findViewById(R.id.edit_email);
        textToast = findViewById(R.id.text_toast);
        btnHere = findViewById(R.id.btn_here);
        btnHere.setOnClickListener(btnHereListener);
    }

    View.OnClickListener btnHereListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialogView = View.inflate(MainActivity.this, R.layout.dialog1, null);
            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setTitle("사용자 정보 입력");
            dlg.setIcon(R.drawable.strowberry);
            dlg.setView(dialogView);
            dlg.setPositiveButton("확인", null);
            dlg.setNegativeButton("취소", null);
            dlg.show();
        }
    };
}