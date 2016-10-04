package libraries.inlacou.com.panicmode;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by inlacou on 4/10/16.
 */

public class Core {

	/**
	 * Example
	 *  {
	 *      "status": 400,
	 *      "minVersionCode": 12,
	 *      "url": "http://www.google.es"
	 *  }
	 * @param jsonObject
	 */
	public void handleResponse(Context context, JSONObject jsonObject) throws JSONException {
		PanicStatus panicStatus = PanicStatus.fromInt(jsonObject.getInt("status"));
		switch (panicStatus){
			case Normal:
				//Do nothing
				break;
			case ForceBlock:
				Utils.openUrl(context, jsonObject.getString("url"));
				Utils.closeCompletely();
				break;
			case CheckVersion:
				if(jsonObject.has("minVersionCode") && BuildConfig.VERSION_CODE<jsonObject.getInt("minVersionCode")){
					Utils.openUrl(context, jsonObject.getString("url"));
					Utils.closeCompletely();
				}
				break;
		}
	}

}
