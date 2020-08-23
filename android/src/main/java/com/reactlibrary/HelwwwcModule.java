package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class HelwwwcModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public HelwwwcModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Helwwwc";
    }

    @ReactMethod
    public void HelloWorld(String text, Promise promise) {
      JavaToC sample = new JavaToC();
      text = sample.helloC();
      promise.resolve( text );
    }
}
