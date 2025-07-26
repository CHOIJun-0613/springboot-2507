package com.example.demo;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class JasyptTest {
    @Test
    public void jasyptTest() {
        String value ="devpass";
        String result = jasyptEncoding(value);
        //log.debug("-----{}-----", result);
        System.out.println("-----" + result + "-----");
    }

    public String jasyptEncoding(String value) {
        String key= "rJgMr9hwDAiOJAfFJeJ4zJw79+AyAb7RJDuTbVG8uejSD8bz9uuBf9TQh6ndlHN2";
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm("PBEWithMD5AndDES");
        encryptor.setPassword(key); // 암호화 키 설정

        return encryptor.encrypt(value);
    }

}
