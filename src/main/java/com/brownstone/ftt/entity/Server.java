package com.brownstone.ftt.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "server")
public class Server {
    @Id
    private String ip;
    private String hostname;
    private String serverType;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getServerType() {
        return serverType;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ip='" + ip + '\'' +
                ", hostname='" + hostname + '\'' +
                ", systemType='" + serverType + '\'' +
                '}';
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }
}
