package io.vertx.sample;

import io.vertx.core.AbstractVerticle;

public class MyFirstVerticle extends AbstractVerticle {

    @Override
    public void start() {

      // Handle each incoming HTTP request

    vertx.createHttpServer()
    .requestHandler(req -> {
            req.response().end(
              "Hello John: Time on the server is "
              + java.time.LocalDateTime.now());
    })
    .listen(8080);

    }

}