package com.jinting.controller;import org.springframework.boot.SpringApplication;import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;/** * Date:2018-8-20,Author:jt */@SpringBootApplication@EnableEurekaServerpublic class RestServiceApplication {    public static void main(String[] args) {        SpringApplication.run(RestServiceApplication.class);    }}