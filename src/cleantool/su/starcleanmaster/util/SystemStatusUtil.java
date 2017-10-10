package cleantool.su.starcleanmaster.util;

import android.content.Context;
import android.os.PowerManager;

public class SystemStatusUtil {

    /**
     * Returns true if the device is in an interactive state.
     * <p>
     * When this method returns true, the device is awake and ready to interact
     * with the user (although this is not a guarantee that the user is actively
     * interacting with the device just this moment). The main screen is usually
     * turned on while in this state. Certain features, such as the proximity
     * sensor, may temporarily turn off the screen while still leaving the
     * device in an interactive state. Note in particular that the device is
     * still considered to be interactive while dreaming (since dreams can be
     * interactive) but not when it is dozing or asleep.
     * </p>
     * <p>
     * When this method returns false, the device is dozing or asleep and must
     * be awoken before it will become ready to interact with the user again.
     * The main screen is usually turned off while in this state. Certain
     * features, such as "ambient mode" may cause the main screen to remain on
     * (albeit in a low power state) to display system-provided content while
     * the device dozes.
     * </p>
     * <p>
     * The system will send a {@link android.content.Intent#ACTION_SCREEN_ON
     * screen on} or {@link android.content.Intent#ACTION_SCREEN_OFF screen off}
     * broadcast whenever the interactive state of the device changes. For
     * historical reasons, the names of these broadcasts refer to the power
     * state of the screen but they are actually sent in response to changes in
     * the overall interactive state of the device, as described by this method.
     * </p>
     * <p>
     * Services may use the non-interactive state as a hint to conserve power
     * since the user is not present.
     * </p>
     *
     * @return True if the device is in an interactive state.
     * @see android.content.Intent#ACTION_SCREEN_ON
     * @see android.content.Intent#ACTION_SCREEN_OFF
     */
    public static boolean isScreenOn(Context mContext) {
        PowerManager mPowerManager = (PowerManager) mContext.getSystemService(Context.POWER_SERVICE);
        return mPowerManager.isInteractive();
    }

}
