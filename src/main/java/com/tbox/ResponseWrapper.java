package com.tbox;

/**
 * Created by jignesh.r on 2/25/2017.
 */


public class ResponseWrapper<T>
{
    T response;

    public ResponseWrapper()
    {
    }

    public ResponseWrapper(T response)
    {
        this.response = response;
    }

    public T getResponse()
    {
        return response;
    }

    public void setResponse(T response)
    {
        this.response = response;
    }
}
