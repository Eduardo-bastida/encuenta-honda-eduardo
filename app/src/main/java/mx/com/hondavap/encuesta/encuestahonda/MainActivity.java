package mx.com.hondavap.encuesta.encuestahonda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, IntroductionActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //Poner al Boton a escuchar
        Button login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
           case  R.id.opt_about:
               //Toast.makeText(this, R.string.m_action_about, Toast.LENGTH_SHORT).show();
               Intent i = new Intent(this, activity_About.class);
               startActivity(i);
               break;
           case R.id.opt_settings:
               Toast.makeText(this, R.string.m_action_setting, Toast.LENGTH_SHORT).show();
               break;
           case R.id.opt_exit:
               Toast.makeText(this, R.string.m_action_exit, Toast.LENGTH_SHORT).show();
               setResult(item.getItemId());
               finish();
               Intent intent = new Intent(Intent.ACTION_MAIN);
               intent.addCategory(Intent.CATEGORY_HOME);
               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               startActivity(intent);
               break;
                default:
                  return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
