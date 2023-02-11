package com.datdt.sortfilterdemo.dto;

import com.datdt.sortfilterdemo.util.enums.SortDirection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SortRequest {

    private String key;

    private SortDirection direction;

}