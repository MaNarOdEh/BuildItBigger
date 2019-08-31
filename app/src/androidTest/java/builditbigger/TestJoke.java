package builditbigger;

import android.content.Context;
import android.util.Log;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import androidx.test.platform.app.InstrumentationRegistry;

import com.udacity.gradle.builditbigger.GetJokeTask;

public class TestJoke {

    @Test
    public void testFunctionAsyncJokes(){
      Context context= InstrumentationRegistry.getInstrumentation().getTargetContext();
        new GetJokeTask(context){
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                if(s==null||s.isEmpty()){
                    Log.e("ERORRR","Wrong!!");
                }
              assertNotNull(s);
            }
        }.execute();

    }

}
