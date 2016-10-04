package libraries.inlacou.com.panicmode;

/**
 * Created by inlacou on 18/07/16.
 */
public enum PanicStatus {
	Unknown, ForceBlock, Normal, CheckVersion;

	public static PanicStatus fromInt(int i){
		switch (i){
			case -1:
				return ForceBlock;
			case 200:
				return Normal;
			case 400:
				return CheckVersion;
			default:
				return Unknown;
		}
	}
}
