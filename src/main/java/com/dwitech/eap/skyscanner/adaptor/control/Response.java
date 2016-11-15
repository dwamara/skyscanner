package com.dwitech.eap.skyscanner.adaptor.control;


import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.HttpURLConnection;


public final class Response {
    public final static int OK = 200;
    public final static int CREATED = 201;
    public final static int FOUND = 302;
    public final static int BAD_REQUEST = 400;
    public final static int AUTHENTICATION_REQUIRED = 401;
    public final static int ACCESS_DENIED = 403;
    public final static int NOT_FOUND = 404;
    public final static int METHOD_NOT_ALLOWED = 405;
    public final static int NOT_ACCEPTABLE = 406;
    public final static int CONFLICT = 409;
    public final static int PRECONDITION = 412;
    public final static int UNSUPPORTED_MEDIA_TYPE = 415;
    public final static int TOO_MANY_REQUEST = 429;
    public final static int INTERNAL_SERVER_ERROR = 500;
    public final static int NOT_IMPLEMENTED = 501;
    public final static int TEMPORARILY_NOT_AVAILABLE = 503;

    public final int statusCode;
    public final String statusMessage;
    public final String body;

    public Response(HttpURLConnection connection, String body) throws IOException {
        this.statusCode = connection.getResponseCode();
        this.statusMessage = StringUtils.trimToNull(connection.getResponseMessage());
        this.body = StringUtils.trimToNull( body );
    }

    public String getBody()
    {
        return body;
    }
    public int getStatusCode()
    {
        return statusCode;
    }
    public String getStatusMessage()
    {
        return statusMessage;
    }
}
