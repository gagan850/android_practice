/*
 *
 */
package com.example.gagandeepbansal.myapplication;

/**
 * The Class Response.
 *
 *
 */
public class Response<T> {


    /** The status. */
    int statusCode;

    /** The body. */
    T body;

    /** The error msg. */
    String errorMsg;


    public Response() {
        super();
    }

    /**
     * Instantiates a new response.
     *
     * @param body the body
     * @param status the status
     */
    public Response(int statusCode, T body) {
        super();
        this.body = body;
        this.statusCode = statusCode;
    }

    /**
     * Instantiates a new response.
     *
     * @param status the status
     * @param body the body
     * @param errorMsg the error msg
     */
    public Response(int statusCode, T body, String errorMsg) {
        super();
        this.body = body;
        this.statusCode = statusCode;
        this.errorMsg = errorMsg;
    }

    /**
     * Gets the body.
     *
     * @return the body
     */
    public T getBody() {
        return this.body;
    }

    /**
     * Sets the body.
     *
     * @param body the new body
     */
    public void setBody(T body) {
        this.body = body;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public int getStatusCode() {
        return this.statusCode;
    }

    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Gets the error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * Sets the error msg.
     *
     * @param errorMsg the new error msg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "statusCode=" + statusCode +
                ", body=" + body +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
