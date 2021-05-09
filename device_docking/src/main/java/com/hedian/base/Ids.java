package com.hedian.base;

import com.hedian.entity.Boiler;
import lombok.*;
import java.util.List;

/**
 * @Desc:
 * @Author: HC
 * @Since: 2021/3/1
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ids {

    List<Boiler> boilerStream;

    List<String> streamIds;
}
