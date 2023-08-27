/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.triple;

/**
 * @author zhaowang
 * @version : OriginHelloImpl.java, v 0.1 2020年05月28日 3:12 下午 zhaowang Exp $
 */
public class OriginHelloImpl implements OriginHello {
    @Override
    public String hello0() {
        return "hello0" + 123;
    }

    @Override
    public String hello1(String hello) {
        return "hello, " + hello;
    }

    @Override
    public HelloResponse hello2(HelloRequest1 helloRequest, HelloRequest2 request2) {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setMessage(helloRequest.getName() + request2.getName());
        return helloResponse;
    }

}