
package com.micron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class GoRestUser {

    private String email;
    private String gender;
    private long id;
    private String name;
    private String status;

}
