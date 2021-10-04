
package com.micron.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class GoRestUserDTO {

    private List<GoRestUser> data;
    private Meta meta;

}
