package com.wei.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 为为
 * @create 6/16
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Accessors(chain = true)
public class User implements Serializable{

    private String id;
    private String name;
    private String nickName;

}