/*
 * MIT License
 *
 * Copyright (c) 2023 Cesar "Aran" Pasillas
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the “Software”), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.programingsquirrel;

import com.google.protobuf.InvalidProtocolBufferException;


public class ProtoBufTester {

    public static void main(String[] args) {
       PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder()
                .setAge(38)
                .setName("Aran")
                .build();

        System.out.println(person);

        try {
            PersonOuterClass.Person person2 = PersonOuterClass.Person.parseFrom(person.toByteString());
            System.out.println(person2);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
}
