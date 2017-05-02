package sg.edu.rp.c346.classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class InfoforC347 extends AppCompatActivity {
    ListView lv;
    TextView tvModule;
    ArrayAdapter aa;
    ArrayList<Module> module;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infofor_c347);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvModule = (TextView) findViewById(R.id.tvModule);



        Intent i = getIntent();
        String year = i.getStringExtra("module");


        module = new ArrayList<Module>();
        if(year.equalsIgnoreCase("C302")) {
            module.add(new Module("DG", "B", 1));
            module.add(new Module("DG", "C", 2));
            module.add(new Module("DG", "A", 3));


        }



        aa = new ModuleAdapter(this, R.layout.module, module);
        lv.setAdapter(aa);





    }



}
