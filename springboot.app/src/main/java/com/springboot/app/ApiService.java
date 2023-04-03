package com.springboot.app;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

  public void callApi() {
    RestTemplate restTemplate = new RestTemplate();
    String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";
    String response = restTemplate.getForObject(apiUrl, String.class);
    System.out.println(response);
  }
}
