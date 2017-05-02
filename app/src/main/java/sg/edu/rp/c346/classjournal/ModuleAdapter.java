package sg.edu.rp.c346.classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15056158 on 2/5/2017.
 */

public class ModuleAdapter extends ArrayAdapter<Module> {

    private Context context;
    private ArrayList<Module> modules;
    private TextView tvModuleCode;
    private TextView tvNameCode;
    private ImageView ivHoliday;
    private TextView textViewWeek;




    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context, resource, objects);

        modules = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.module, parent, false);

        tvModuleCode = (TextView) rowView.findViewById(R.id.textView2);

        tvNameCode = (TextView) rowView.findViewById(R.id.textView);

        textViewWeek = (TextView) rowView.findViewById(R.id.textViewWeek);


        ivHoliday = (ImageView) rowView.findViewById(R.id.imageView);
        ivHoliday.setImageResource(R.drawable.dg);



       Module currentModule = modules.get(position);

        tvModuleCode.setText(currentModule.getCode());

        tvNameCode.setText(currentModule.getName());

        textViewWeek.setText("Week " + currentModule.getWeek().toString());





        return rowView;
    }
}
