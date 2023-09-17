package com.szui;

import redis.clients.jedis.Jedis;

/**
 * @Author:szui
 * @Date:2023/9/15 19:38
 * @Description:
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        System.out.println(jedis.ping());

    }
}
