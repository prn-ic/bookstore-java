package ru.bookstore.bookstore.responses;

public class BaseResponse<T> {
    private final String status;
    private final int code;
    private final T data;

    public BaseResponse(String status, int code, T data) {
        this.status = status;
        this.code = code;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }

    public T getData() {
        return data;
    }
}
