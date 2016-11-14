# panicmode

[![](https://jitpack.io/v/byvapps/android-byv-panic.svg)](https://jitpack.io/#byvapps/android-byv-panic)

Make a call to the server (use retrofit or volley, for example). It must provide a JSON with at least this:

```json
{
  "disabled": false,
  "minVersion": "0",
  "disabledUrl": "/panic/serverOff",
  "minVersionUrl": "/panic/needsUpdate"
}
```

On response, call (WARNING! Import your apps BuildConfig):

```java
handleResponse(context, BuildConfig.VERSION_CODE, jsonObject)
```

It will check versions and, if needed, close your app completely and open the provided URL.
