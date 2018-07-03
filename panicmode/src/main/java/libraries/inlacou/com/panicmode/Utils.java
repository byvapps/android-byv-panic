package libraries.inlacou.com.panicmode;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by inlacou on 4/10/16.
 */

class Utils {
	static void closeCompletely() {
		int pid = android.os.Process.myPid();
		android.os.Process.killProcess(pid);
	}

	static void openUrl(Context context, String url) {
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
		browserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(browserIntent);
	}
}
