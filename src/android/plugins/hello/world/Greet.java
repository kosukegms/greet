package plugins.hello.world;

import android.util.Log;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Greet extends CordovaPlugin{
  private static final String TAG = "GREET:";

  public void initialize(CordovaInterface cordova, CordovaWebView webView){
    Log.e(TAG,"GREET: java initialize");
    super.initialize(cordova, webView);
  }

  @Override
  public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
    if(action.equals("sayHi")){
      sayHi(data.getString(0), callbackContext);
    } else {
      return false;
    }
    return true;
  }

  private void sayHi(final String message, final CallbackContext callbackContext){
    Log.e(TAG,"GREET: java sayHi");
    Log.d(TAG,"GREET: " + message);

      callbackContext.success(message);


  }
}
