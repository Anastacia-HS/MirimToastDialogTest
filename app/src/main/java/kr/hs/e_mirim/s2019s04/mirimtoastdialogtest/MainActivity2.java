package kr.hs.e_mirim.s2019s04.mirimtoastdialogtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textName, textEmail, textToast;
    EditText editMainName, editMainEmail;
    Button btnMain;
    View dialogView, toastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editMainName = findViewById(R.id.edit_main2_name);
        editMainEmail = findViewById(R.id.edit_main2_email);
        btnMain = findViewById(R.id.btn_main);
        btnMain.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editMainName = dialogView.findViewById(R.id.edit_main2_name);
            editMainEmail = dialogView.findViewById(R.id.edit_main2_email);
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
            Display display = ((WindowManagerw)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
            int xOffset = (int)(Math.random() * display.getWidth());
            int yOffset = (int)(Math.random() * display.getHeight());
            toast.setGravity(Gravity.TOP|Gravity.LEFT);
            toast.show();
        }
    };
}