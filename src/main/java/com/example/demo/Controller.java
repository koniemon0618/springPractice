package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     
    @RequestMapping(value = "/body",
            //Jsonをリクエストにする設定
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String body(
            //リクエストボディの設定
            @Validated @RequestBody Body body)
    {
        return "body:" + body.getBody();
    }
}

//package com.example.demo;
//
//import javax.validation.constraints.NotBlank;
//
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Validated
//public class Controller {
//     
//    @RequestMapping(value = "/parameter/param1/{param1}")
//    public String parameter(
//            //パスパラメータの設定
//            @PathVariable(required = true)
//            @NotBlank	//Null、空文字、スペースをバリデーション
//            String param1,
//             
//            //リクエストパラメータの設定
//            @RequestParam
//            @NotBlank	//Null、空文字、スペースをバリデーション
//            String param2
//            ) 
//    {
//        return "param1:" + param1 + " param2:" + param2;
//    }
//}

//package com.example.demo;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController    //WebAPIの機能を追加するアノテーション
//public class Controller {
//   
//  @RequestMapping(value = "/test")    //URL「〜/test」にアクセスされたときのアノテーション
//  public String test() {
//      return "Hello World!";
//  }
//}