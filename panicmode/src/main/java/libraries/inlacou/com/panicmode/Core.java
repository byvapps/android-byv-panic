package libraries.inlacou.com.panicmode;

import android.content.Context;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by inlacou on 4/10/16.
 */

public class Core {

	private static String DEBUG_TAG = Core.class.getName();

	/**
	 * Example
	 *  {
	 *      "disabled": false,
	 *      "minVersion": "0",
	 *      "disabledUrl": "http://www.baseUrl.com/panic/serverOff",
	 *      "minVersionUrl": "http://www.baseUrl.com/panic/needsUpdate"
	 *  }
	 * @param jsonObject
	 */
	public static void handleResponse(Context context, int versionCode, JSONObject jsonObject) throws JSONException {
		if(!jsonObject.getBoolean("disabled")){
			Utils.openUrl(context, jsonObject.getString("disabledUrl"));
			Utils.closeCompletely();
		}else{
			if(jsonObject.has("minVersion") && versionCode<jsonObject.getInt("minVersion")){
				Utils.openUrl(context, jsonObject.getString("minVersionUrl"));
				Utils.closeCompletely();
			}
		}
	}

}
