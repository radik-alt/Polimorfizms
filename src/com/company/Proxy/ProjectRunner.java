package com.company.Proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com");
        project.run();
    }
}
