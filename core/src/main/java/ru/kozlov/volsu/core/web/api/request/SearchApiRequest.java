package ru.kozlov.volsu.core.web.api.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Sort;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class SearchApiRequest {
    private String query = "";
    private Integer limit = 20;
    private Integer offset = 0;

    private String sortName = "id";
    private Sort.Direction sortDirection = Sort.Direction.DESC;

    public SearchApiRequest() {
    }

    public SearchApiRequest(String query) {
        this.query = query;
    }

    public SearchApiRequest(String query, Integer limit) {
        this.query = query;
        this.limit = limit;
    }
}