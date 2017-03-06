package com.tbox;

/**
 * Created by jignesh.r on 2/25/2017.
 */
public class RequestWrapper<T>
{
    T data;

    public RequestWrapper()
    {
    }

    public RequestWrapper(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
