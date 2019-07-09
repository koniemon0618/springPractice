package com.example.demo;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     
    @RequestMapping(value = "/jsonexception",
            produces = MediaType.APPLICATION_JSON_VALUE) //レスポンスにJSON指定
    public String jsonexception() {
        throw new RuntimeException("test");
    }
 
    @RequestMapping(value = "/xmlexception",
            produces = MediaType.APPLICATION_XML_VALUE)
    public String xmlexception() {
        throw new RuntimeException("test");
    }
}

//@RestController    //WebAPIの機能を追加するアノテーション
//public class Controller {
//     
//    @RequestMapping(value = "/jsonexception",
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public String jsonexception() {
//        throw new RuntimeException("test");
//    }
//}
 
//@RestController    //WebAPIの機能を追加するアノテーション
//public class Controller {
//     
//    @RequestMapping(value = "/test")
//    public String test() {
//        return "Hello World!";
//    }
// 
//    @RequestMapping(value = "/parameter/param1/{param1}")
//    public String parameter(
//            //パスパラメータの設定
//            @PathVariable(required = true)
//            @NotBlank//Null、空文字、スペースをバリデーション
//            String param1,
//             
//            //リクエストパラメータの設定
//            @RequestParam
//            @NotBlank//Null、空文字、スペースをバリデーション
//            String param2
//            )
//    {
//    	return "param1:" + param1 + " param2:" + param2;}
//    }

//@RestController
//public class Controller {
//     
//    @Autowired
//    String stringBean;
// 
//    @Autowired
//    ComponentBean componentBean;
//     
//    @RequestMapping(value = "/di",
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public Response di(@Validated @RequestBody Body body)
//    {
//        Nest nest = new Nest();
//        nest.setKey1(stringBean);
//        nest.setKey2(componentBean.getIntval());
// 
//        Response response = new Response();
//        response.setNest(nest);
//         
//        return response;
//    }
//}

//@RestController
//@Validated
//public class Controller {
//    @RequestMapping(value = "/xml",//RESTクライアントで実行する際は、ヘッダーにContent-Type:application/xmlを追加する
//            consumes = MediaType.APPLICATION_XML_VALUE,//XMLをリクエストにする設定
//            produces = MediaType.APPLICATION_XML_VALUE)//XMLをリクエストにする設定
//    public Response xml(@Validated @RequestBody Body body)
//    {
//        Nest nest = new Nest();
//        nest.setKey1(body.getBody());
//        nest.setKey2(1);
// 
//        Response response = new Response();
//        response.setNest(nest);
//         
//        return response;
//    }
//}

//@RestController
//@Validated
//public class Controller {
//    @RequestMapping(value = "/json",
//            consumes = MediaType.APPLICATION_JSON_VALUE, //Jsonをリクエストにする設定
//            produces = MediaType.APPLICATION_JSON_VALUE) //Jsonをレスポンスにする設定
//    public Response json(@Validated @RequestBody Body body)
//    {
//        Nest nest = new Nest();
//        nest.setKey1(body.getBody());
//        nest.setKey2(1);
// 
//        Response response = new Response();
//        response.setNest(nest);
//         
//        return response;
//    }
//}

//@RestController
//public class Controller {
//     
//    @RequestMapping(value = "/body",
//            //Jsonをリクエストにする設定
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public String body(
//            //リクエストボディの設定
//            @Validated @RequestBody Body body)
//    {
//        return "body:" + body.getBody();
//    }
//}


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