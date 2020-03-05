## Providers of JClouds for Aliyun

[![Build Status](https://travis-ci.com/oliver4u/aliyun-jclouds.svg?branch=master)](https://travis-ci.com/oliver4u/aliyun-jclouds)

### Introduction

aliyun-jclouds adapt for jclouds to use cloud service of [aliyun](https://www.aliyun.com)

### Providers

| Provider | Service | Remark |
|------|------|------|
|aliyun-ecs|ComputeService|Removed in this repo|
|aliyun-oss|BlobStore||
|aliyun-slb|LoadBalancerService|Removed in this repo|

For aliyun-ecs/slb, refer to origin [repo](https://github.com/aliyun-beta/aliyun-jclouds).

### Maven

    <dependencies>
      <dependency>
        <groupId>io.github.aliyun-beta</groupId>
        <artifactId>aliyun-oss</artifactId>
        <version>1.0.0</version>
      </dependency>
    </dependencies>

### Usage

Offical documents link [Apache-jclouds](http://jclouds.apache.org/start)

### BlobStore

    BlobStore blobStore;
    String provider = "aliyun-oss";
    String key = "Your AccessKey";
    String secret = "Your AccessKeySecret";
    BlobStoreContext context = ContextBuilder
          .newBuilder(provider)
          .credentials(key, secret)
          .buildView(BlobStoreContext.class);
    blobStore = context.getBlobStore();



### Build

> mvn package -DskipTests

### Local Dev

#### Compile

Providers use **Google Auto** to generate services

**It is important to do like this**
> mvn clean compile

Then you will find an folder named services from target\classes\META-INF in each modules

If you do not do the operation, an error will happends.

    key [aliyun-oss] not in the list of providers or apis

#### test
Change the accessKey and secret witch generate by your own account of [Aliyun](http://www.aliyun.com) in each test classes before test

    private static final String key = "xxx";
    private static final String secret = "yyy";

Then run command
> mvn test


### License

Licensed under the Apache License, Version 2.0
