package com.szui.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:szui
 * @Date:2023/9/13 22:13
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Integer id;
    private String type;
    private String name;
    private String description;
}
