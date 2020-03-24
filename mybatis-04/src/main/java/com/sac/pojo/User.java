package com.sac.pojo;

/**
 * @author ShiAC
 * @date 2020/3/24
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ShiAC
 * @date 2020/3/19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;
}
