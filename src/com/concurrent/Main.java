package com.concurrent;

import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //声明队列，这个是一个无界队列，所以用的时候需要谨慎
        PriorityBlockingQueue<User> priorityBlockingQueue = new PriorityBlockingQueue<User>();

        priorityBlockingQueue.put(new User("张三",20));
        priorityBlockingQueue.put(new User("李四",30));
        priorityBlockingQueue.put(new User("王二",24));
        priorityBlockingQueue.put(new User("刘一",27));
        priorityBlockingQueue.put(new User("麻子",21));

        //
        while(true){
            User user = priorityBlockingQueue.take();
            System.out.println(user.getName()+","+user.getAge());
        }
    }
}
