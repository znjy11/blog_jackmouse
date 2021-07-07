package com.jackmouse.blog.dto;

import lombok.Data;

import java.util.List;


@Data
public class UrlRoleDTO {

    /**
     * 资源id
     */
    private Integer id;

    /**
     * 路径
     */
    private String url;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 角色名
     */
    private List<String> roleList;

    /**
     * 是否匿名
     */
    private Integer isAnonymous;

}
