package br.com.luan.possenai;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    private Handler handler = new TesteHandler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button play = (Button) findViewById(R.id.btnCalcular);
        play.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        handler.sendMessageDelayed(new Message(), 3000);
    }

    private class TesteHandler extends Handler {
        public void handleMessage(Message msg){
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
        }

    }
}
