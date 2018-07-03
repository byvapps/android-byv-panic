package libraries.inlacou.com.panicmodeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import libraries.inlacou.com.panicmode.PanicCore;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			PanicCore.handleResponse(this, BuildConfig.VERSION_CODE, new JSONObject("\n" +
					"{" +
					"  \"disabled\": false," +
					"  \"os\": \"android\"," +
					"  \"minVersion\": 12," +
					"  \"disabledUrl\": \"http://www.google.com\"," +
					"  \"minVersionUrl\": \"http://www.google.eus\"" +
					"}"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
