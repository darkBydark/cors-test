package com.example;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@RestController
public class ClientContronller {
    @GetMapping("/sendMsg")
    public void sendMsg(String mes){
        try {
            new EchoClient("127.0.0.1", 8090,
                    Unpooled.copiedBuffer(mes, CharsetUtil.UTF_8)).start();
        }catch (Exception e){
            System.out.println();
        }
    }

    @GetMapping("/test")
    @CrossOrigin(value = "*",allowCredentials = "true")
    public void test(String mes){

            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

            HttpServletRequest request = servletRequestAttributes.getRequest();
            Cookie[] cookies = request.getCookies();
            System.out.println(Arrays.toString(cookies));
    }
}
