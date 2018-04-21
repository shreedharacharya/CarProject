package emts.cars;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {

    Context context;
    Gson gson = new Gson();
    Cars result;

    public Utility(Context context) {
        this.context = context;
    }

    BufferedReader reader = null;

   public Cars readDataFromFile(){

       try

       {
           reader = new BufferedReader(
                   new InputStreamReader(context.getAssets().open("json.txt")));

            result = gson.fromJson(reader, Cars.class);

           Log.e("TRY","********************");

       } catch(
               IOException e)

       {
           Log.e("CATCH",e.getMessage());

           //log the exception
       } finally

       {
           Log.e("Finally","****************************************");

           if (reader != null) {
               try {
                   reader.close();
               } catch (IOException e) {
                   //log the exception
               }
           }
       }
       return result;
    }

}
