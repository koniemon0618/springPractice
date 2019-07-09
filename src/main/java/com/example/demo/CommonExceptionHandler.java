package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@ControllerAdvice
//public class CommonExceptionHandler extends ResponseEntityExceptionHandler {
// 
//    @Override
//    public ResponseEntity<Object> handleMethodArgumentNotValid ( 
//            MethodArgumentNotValidException exception, HttpHeaders headers, 
//            HttpStatus status, WebRequest request) {
//        return handleExceptionInternal(
//                exception, //例外
//                exception, //レスポンスボディ
//                new HttpHeaders(), //レスポンスヘッダー
//                HttpStatus.BAD_REQUEST,  //レスポンスステータス
//                request); //リクエスト
//    }
//}

@ControllerAdvice //①コントローラークラスに対する共通処理を実装
public class CommonExceptionHandler 
extends ResponseEntityExceptionHandler { //②独自の例外処理を実装
     
    @ExceptionHandler //③任意例外に対する例外処理を実装
    public ResponseEntity<Object> handleRuntimeException(
            RuntimeException exception, //③任意の例外を設定
            WebRequest request) {
        return handleExceptionInternal( //④handleExceptionInternalで任意のレスポンスを返却
                exception, //例外
                exception, //レスポンスボディ
                new HttpHeaders(), //レスポンスヘッダー
                HttpStatus.INTERNAL_SERVER_ERROR,  //レスポンスステータス
                request); //リクエスト
    }
}