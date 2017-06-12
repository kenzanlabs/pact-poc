package io.kenzanlabs.pactpoc.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

  @GetMapping(path = "/greetings/{name}")
  public Greetings greetings(@PathVariable("name") String name) {
    return new Greetings("Mr.", name);
  }

}
