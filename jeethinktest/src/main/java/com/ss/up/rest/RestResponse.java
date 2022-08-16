package com.ss.up.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class RestResponse {

    @JsonProperty("code")
    private String code;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("data")
    private Object result;

    @JsonProperty("message")
    public String getMessage() {
        return this.msg;
    }

    private RestResponse(String code, RestResponse restResponse) {
    }

    private RestResponse(String code) {
        this.code = code;
    }

    private RestResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @JsonIgnoreType
    public static class RestResponseBuilder {
        private final RestResponse response;

        private RestResponseBuilder(String code) {
            this.response = new RestResponse(code, (RestResponse)null);
        }

        private RestResponseBuilder(String code, String message) {
            this.response = new RestResponse(code, (RestResponse)null);
            this.setMessage(message);
            this.setResult((Object)"");
        }

        public static RestResponse.RestResponseBuilder createSuccessBuilder() {
            return createBuilder("0");
        }

        public static RestResponse.RestResponseBuilder createSuccessBuilder(String message) {
            return createBuilder("0", message);
        }

        public static RestResponse.RestResponseBuilder createFailBuilder() {
            return createBuilder("-1");
        }

        public static RestResponse.RestResponseBuilder createFailBuilder(String message) {
            return createBuilder("-1", message);
        }

        public static RestResponse.RestResponseBuilder createFailForServerBuilder(String message) {
            return createBuilder("1", message);
        }

        public static RestResponse.RestResponseBuilder createFailForTemplateBuilder(String message) {
            return createBuilder("2", message);
        }

        public static RestResponse.RestResponseBuilder createBuilder(String code) {
            return createBuilder(code, "");
        }

        public static RestResponse.RestResponseBuilder createBuilder(String code, String message) {
            return new RestResponse.RestResponseBuilder(code, message);
        }

        public RestResponse.RestResponseBuilder setMessage(String message) {
            if (message == null) {
                this.response.setMsg("");
            } else {
                this.response.setMsg(message);
            }

            return this;
        }

        public <T> RestResponse.RestResponseBuilder setResult(List<T> result) {
            if (result != null) {
                this.response.setResult(result);
            }

            return this;
        }

        public <T> RestResponse.RestResponseBuilder setResult(T result) {
            this.response.setResult(result);
            return this;
        }

        public <T> RestResponse.RestResponseBuilder setResult(Collection<T> result) {
            this.response.setResult(result);
            return this;
        }

        public <KEY, VALUE> RestResponse.RestResponseBuilder setResult(Map<KEY, VALUE> result) {
            this.response.setResult(result);
            return this;
        }

        public <P, R> RestResponse.RestResponseBuilder setResult(P paginator, R[] resultList) {
            if (paginator != null && resultList != null) {
                Map<String, Object> pageData = new HashMap();
                pageData.put("paginator", paginator);
                pageData.put("resultList", resultList);
                this.response.setResult(pageData);
            }

            return this;
        }

        public RestResponse buidler() {
            return this.response;
        }
    }
}
