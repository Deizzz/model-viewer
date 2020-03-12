package ru.kozlov.volsu.core.web.api.response;

import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotNull;

@ApiModel(" ")
public class ApiResponse<Result> {
    protected Result result;

    @NotNull
    public static <Result> ApiResponse<Result> of(Result result) {
        return new ApiResponse<>(result);
    }

    public ApiResponse() {
    }

    public ApiResponse(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
