package com.cardinal.project.human_isekai_transfer.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterSURequest {
    
    @NotBlank
    @Size(max = 100)
    private String userName;

    @NotBlank
    @Size(max = 100)
    private String superName;

    @NotBlank
    @Size(max = 100)
    private String password;
}
