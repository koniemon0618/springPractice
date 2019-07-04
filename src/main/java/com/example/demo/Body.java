package com.example.demo;

import javax.validation.constraints.NotBlank;

//リクエストボディの中身
public class Body {
  @NotBlank
  public String body;

  public String getBody() {
      return body;
  }

  public void setBody(String body) {
      this.body = body;
  }

}
