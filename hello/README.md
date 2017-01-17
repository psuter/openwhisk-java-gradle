# How to run

  1. `gradle jar`
  2. `wsk action create hello-java build/libs/hello-1.0.jar --main example.Hello`
  3. `wsk action invoke -br hello-java -p name world`
