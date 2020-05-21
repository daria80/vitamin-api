package com.vitamin.vitamin.transfers;

import com.vitamin.vitamin.models.CountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {

    private long id;

    private int count;

    private CountType count_type;

    private String name;

}
