package salt.movil.baseadaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listViewPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar listview desde el layour
        listViewPersonas = (ListView) findViewById(R.id.list_view_personas);
        //Colocar a escuchar cuando el usuario hace click en uno de los items del ListView
        listViewPersonas.setOnItemClickListener(this);

        PersonAdapter adapter = new PersonAdapter(getPeople(),this);
        listViewPersonas.setAdapter(adapter);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"Selecciono algo",Toast.LENGTH_SHORT).show();
    }



    //Metodo que me devulve una lista de personas
    private List<Person> getPeople(){

        Person diego = new Person();
        diego.setFullname("Diego Chicangana");
        diego.setAge("26");
        diego.setAdress("Carrera 4 # 4");
        diego.setDescription("Diego es un hombre alto, de camiseta morada");
        diego.setPhoto("http://vignette4.wikia.nocookie.net/violetta/images/6/6e/Diego_Temp_3.jpg/revision/latest?cb=20141116123538&path-prefix=es");

        Person diana = new Person();
        diana.setFullname("Diana Burbano");
        diana.setAge("22");
        diana.setAdress("Casa de diana # 22N");
        diana.setDescription("Diana es una niña con chaqueta de jean");
        diana.setPhoto("https://pbs.twimg.com/profile_images/549719526439661569/qw5V7OWB.jpeg");

        Person alejandra = new Person();
        alejandra.setFullname("Alejandra Martinez");
        alejandra.setAge("22");
        alejandra.setAdress("Casa aleja #55");
        alejandra.setDescription("Alejandra es una niña con gafas bonitas");
        alejandra.setPhoto("https://media.licdn.com/mpr/mpr/shrinknp_200_200/AAEAAQAAAAAAAAagAAAAJDQyMmE1YzlmLTU5OGYtNGI1My1hNjgwLWVlYzM1ZjI0YmE5NA.jpg");

        Person jimmy = new Person();
        jimmy.setFullname("Jimmy Realpe");
        jimmy.setAge("18");
        jimmy.setAdress("Casa Jimmy");
        jimmy.setDescription("Jimmy es un muchacho con camiseta blanca");
        jimmy.setPhoto("https://2.bp.blogspot.com/-k5RdIHoLMKo/VzY8z0C6CyI/AAAAAAAA3yw/w6Ur9Y5YEhU7s1mpSCri8Hus7WPZeMWkQCLcB/s1600/Santiago.jpg");

        Person hamilton = new Person();
        hamilton.setFullname("Hamilton Urbano");
        hamilton.setAge("23");
        hamilton.setAdress("Carrera 4 # 20N");
        hamilton.setDescription("Profesor");
        hamilton.setPhoto("https://lh4.googleusercontent.com/-Yjh5ftUJb4A/AAAAAAAAAAI/AAAAAAAAOrE/BhMopo77wIM/photo.jpg");

        //Creo la lista de personas vacia
        List<Person> listPersonas = new ArrayList<>();

        //Lleno la lista con pas personas creadas
        listPersonas.add(diego);
        listPersonas.add(diana);
        listPersonas.add(alejandra);
        listPersonas.add(jimmy);
        listPersonas.add(hamilton);

        return listPersonas;

    }


}
