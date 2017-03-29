package com.czy;

import com.avos.avoscloud.AVOSCloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Created by hu on 2017/3/29.
 */

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // 参数依次为 AppId、AppKey、MasterKey
        AVOSCloud.initialize("Jf3RcvbzUHSQuQfB1p47lHAa-gzGzoHsz", "UENbcun86WyTmQNngxYEX1VA", "DUyqEXuJVXqOvbOxBq06txRy");

        SpringApplication.run(Main.class, args);
    }
}