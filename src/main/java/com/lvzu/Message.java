package com.lvzu;

/**
 * @author Tom Tao
 * @version 1.0, 2017/12/8
 */
public class Message {

    private boolean success;

    private String data;

    public Message(boolean success,String data){
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getData() {
        return data;
    }
}
