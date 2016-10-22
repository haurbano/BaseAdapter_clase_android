package salt.movil.baseadaptertest;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Hamilton Urbano on 22/10/2016.
 */

public class PersonAdapter extends BaseAdapter {

    List<Person> persons;
    Context context;


    public PersonAdapter(List<Person> persons,Context context){
        this.persons = persons;
        this.context = context;
    }


    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int position) {
        Person person = persons.get(position);
        return person;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v;
        if (convertView==null){
            v = View.inflate(context,R.layout.adpter_layout,null);
        }else {
            v = convertView;
        }

        Person person = persons.get(position);

        ImageView imageView = (ImageView) v.findViewById(R.id.image_person);
        TextView textView = (TextView) v.findViewById(R.id.fullname_person);
        TextView textViewAge = (TextView) v.findViewById(R.id.age_person);


        Picasso.with(context).load(person.getPhoto()).into(imageView);
        textView.setText(person.fullname);
        textViewAge.setText(person.getAge());

        return v;
    }
}
