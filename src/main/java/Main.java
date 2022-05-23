
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.GsonBuildConfig;
import com.google.gson.reflect.TypeToken;
import model.Person;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

//       1. normal json
        //read file
        // String string = new String(Files.readAllBytes(Paths.get("PersonNormal.json")));
        //con2vert to json
        //  Person person = new Gson().fromJson(string, Person.class);
        //
        //        2. normal json
        //read file
//        String string = new String(Files.readAllBytes(Paths.get("./PersonArray.json")));
//        //con2vert to json
//        Type type = new TypeToken<List<Person>>(){}.getType();
//        List<Person> person = new Gson().fromJson(string, type);
//        System.out.println(person);
        //        3. Dash
        //read file
//        String string = new String(Files.readAllBytes(Paths.get("./PersonDash.json")));
//        //con2vert to json
//        Type type = new TypeToken<List<Person>>(){}.getType();
//        List<Person> person = new GsonBuilder()
//                .setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
//                .create()
//                .fromJson(string, type);
//        System.out.println(person);
        //        4. UnderScore
        //read file
//        String string = new String(Files.readAllBytes(Paths.get("./PersonUnderscore.json")));
//        //con2vert to json
//        Type type = new TypeToken<List<Person>>(){}.getType();
//        List<Person> person = new GsonBuilder()
//                .setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
//                .fromJson(string, type);
//        System.out.println(person);
//    }
//        5. UnderScore
        //read file
        String string = new String(Files.readAllBytes(Paths.get("./PersonMultiple.json")));
//        //con2vert to json
        Type type = new TypeToken<List<Person>>() {
        }.getType();
        List<Person> person = new Gson()
                .fromJson(string, type);
        System.out.println(person);
    }
}
