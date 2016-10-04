package libraries.inlacou.com.panicmodeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import libraries.inlacou.com.panicmode.Core;
import libraries.inlacou.com.panicmode.PanicStatus;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			Core.handleResponse(this, BuildConfig.VERSION_CODE, new JSONObject("\n" +
					"{" +
					"  \"status\": 400," +
					"  \"minVersionCode\": 12," +
					"  \"url\": \"http://www.google.es\"" +
					"}"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
