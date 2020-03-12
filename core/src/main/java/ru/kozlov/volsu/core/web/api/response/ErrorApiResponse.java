package ru.kozlov.volsu.core.web.api.response;

public class ErrorApiResponse<Error> {

    private Error errors;

    public static <Error> ErrorApiResponse<Error> of(Error result) {
        return new ErrorApiResponse<>(result);
    }

    public ErrorApiResponse(Error errors) {
        this.errors = errors;
    }

    public Error getErrors() {
        return errors;
    }

    public void setErrors(Error errors) {
        this.errors = errors;
    }
}
