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

public class activity_questions extends AppCompatActivity  implements View.OnClickListener{

    @Override
    public void onClick(View view){
        Intent close= new Intent(this, activity_thanks.class);
        startActivity(close);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        //se pone a escuchar el boton
        Button cerrar = (Button) findViewById(R.id.btn_ir);
        cerrar.setOnClickListener(this);
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
                Intent b = new Intent(this, MainActivity.class);
                startActivity(b);
                break;
            default:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
