package kr.hs.e_mirim.s2019s04.mirimtoastdialogtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
            dlg.setPositiveButton("확인", positiveButtonListener);
            dlg.setNegativeButton("취소", negativeButtonListener);
            dlg.show();
        }
    };

    DialogInterface.OnClickListener positiveButtonListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            editName = dialogView.findViewById(R.id.edit_name);
            editEmail = dialogView.findViewById(R.id.edit_email);
            textName.setText(editName.getText().toString() + "님 입니다.");
            textEmail.setText(editEmail.getText().toString() + "이메일 주소입니다.");
        }
    };

    DialogInterface.OnClickListener negativeButtonListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast toast = new Toast(MainActivity.this);
            toastView = View.inflate(MainActivity.this, R.layout.toast1, null);
            textToast = findViewById(R.id.text_toast);
            textToast.setText("취소버튼을 누르셨습니다.");
            toast.setView(toastView);
            toast.show();
        }
    };
}