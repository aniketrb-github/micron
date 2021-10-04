
package com.micron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class Pagination {

    private long limit;
    private Links links;
    private long page;
    private long pages;
    private long total;

}
