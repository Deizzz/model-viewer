package ru.kozlov.volsu.core.web.api.response;

import lombok.Getter;

@Getter
public class BaseApiResponse extends ApiResponse<String> {

    public BaseApiResponse(){
        this.result = "OK";
    }

}
