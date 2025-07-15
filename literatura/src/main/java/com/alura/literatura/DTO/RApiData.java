package com.alura.literatura.DTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record RApiData(List<RBookData> results) {
    }

