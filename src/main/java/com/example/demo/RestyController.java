package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Controller
public class RestyController {

  @GetMapping("/rude")
  @ResponseBody
  public Map<String, Object> home() {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("ding", UUID.randomUUID().toString());
    model.put("content", "Hey Man");
    return model;
  }

}

