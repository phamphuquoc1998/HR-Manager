package com.phamphuquoc.hradministrator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnThemPhong, btnQuanLi, btnDs, btnClear, btnSave;
    EditText editStt, editMaPhong, editTenphong;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnThemPhong=findViewById(R.id.btnThemPhong);
        btnQuanLi=findViewById(R.id.btnQuanLi);
        btnDs=findViewById(R.id.btnDS);

        btnThemPhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder( MainActivity.this);
                builder.setTitle("Thêm Phòng Ban");
                builder.setMessage("Nhâp đầy đủ thông tin ");
                builder.setIcon(R.drawable.ic_launcher_background);
                View mview=getLayoutInflater().inflate(R.layout.them_phong_dialog,null);
                editMaPhong=mview.findViewById(R.id.editMaPhong);
                editStt=mview.findViewById(R.id.editStt);
                editTenphong=mview.findViewById(R.id.editTenPhong);

                editMaPhong=mview.findViewById(R.id.editMaPhong);

            }
        });

    }

}
