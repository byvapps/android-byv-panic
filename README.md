# panicmode

[![](https://jitpack.io/v/inlacou/panicmode.svg)](https://jitpack.io/#inlacou/panicmode)

Make a call to the server (use retrofit or volley, for example). It must provide a JSON with at least this:

```json
{
  "status": 400,
  "minVersionCode": 12,
  "url": "http://www.google.es"
}
```

Status:
   -1: Force block.
  200: Normal.
  400: Check minVersionCode.

On response, call:

```java
handleResponse(context, jsonObject)
```

It will check versions and, if needed, close your app completely and open the provided URL.
