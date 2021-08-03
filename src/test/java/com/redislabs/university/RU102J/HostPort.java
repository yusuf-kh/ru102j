package com.redislabs.university.RU102J;

public class HostPort {
    final private static String defaultHost = "redis-12392.c270.us-east-1-3.ec2.cloud.redislabs.com";
    final private static Integer defaultPort = 12392;
    final private static String defaultPassword = "redisru101";

    public static String getRedisHost() {
        return defaultHost;
    }

    public static Integer getRedisPort() {
        return defaultPort;
    }

    public static String getRedisPassword() {
        return defaultPassword;
    }
}
