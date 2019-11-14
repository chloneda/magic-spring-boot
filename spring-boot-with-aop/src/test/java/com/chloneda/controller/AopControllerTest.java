package com.chloneda.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chloneda
 * @description: 面向切面Aop测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AopControllerTest {

    @Test
    public void restClientGet() throws IOException {
        URL url = new URL("http://localhost:8056/aop/sayHello");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod("GET");
        con.setRequestProperty("accept", "application/json, text/plain, */*");
        con.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
        con.setRequestProperty("dataType", "jsonp");
        Map<String, String> headders = fillHeaders();
//        String principal=headders.get("principal");
//        con.setRequestProperty("principal", principal);
//        System.out.println("principal: " + principal);

        con.connect();
        StringBuffer sb = new StringBuffer();
        if (con.getResponseCode() == 200) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), Charset.forName("UTF-8")));
            String line = reader.readLine();
            while (line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            close(reader);
        } else {
            System.out.println("Http status code : " + con.getResponseCode());
        }
        con.disconnect();
        System.out.println(sb.toString());
    }


    protected static Map<String, String> fillHeaders() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes == null || !(requestAttributes instanceof ServletRequestAttributes)) {
            return new HashMap<>(32);
        }
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Enumeration<String> headerNames = request.getHeaderNames();
        Map<String, String> headers = new HashMap<>(32);
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            headers.put(name, request.getHeader(name));
        }
        return headers;
    }

    public void close(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}