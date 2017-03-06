package com.tbox;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.io.IOException;

/**
 * Created by jignesh.r on 2/25/2017.
 */
@RestController
public class HellowWorldController
{
    @RequestMapping("/sayhello")
    public ResponseEntity<ResponseWrapper<String>> sayHello(@RequestParam String name)
    {
        return ResponseEntity.ok(new ResponseWrapper<>("Hello " + name));
    }

    @RequestMapping("/sayhello2")
    public ResponseEntity<ResponseWrapper<String>> sayHelloRequestBody(@RequestBody String name)
    {
        return ResponseEntity.ok(new ResponseWrapper<>("Hello " + name));
    }

    @RequestMapping("/sayhello3")
    public ResponseEntity<ResponseWrapper<String>> sayHelloRequestBody3(@RequestBody RequestWrapper<String> name)
    {
        return ResponseEntity.ok(new ResponseWrapper<>("Hello " + name.getData()));
    }


    @RequestMapping("/upload")
        public ResponseEntity<ResponseWrapper<String>> upload(@RequestPart MultipartFile file)
    {
            return ResponseEntity.ok(new ResponseWrapper<>("Hello " + file.getOriginalFilename() + " : " + file.getSize() ));
    }

}
