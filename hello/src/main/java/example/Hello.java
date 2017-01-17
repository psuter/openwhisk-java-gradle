package example;

import com.google.gson.JsonObject;

public class Hello {
  public static JsonObject main(JsonObject args) {
    String name = args.getAsJsonPrimitive("name").getAsString();
    JsonObject response = new JsonObject();
    response.addProperty("greeting", "Hello " + name + "!");
    return response;
  }
}
