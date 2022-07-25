package cn.net.insurance.gateway.common.entity;

import lombok.Data;

@Data
public class AccountCacheDto {

    /**
     * 标识id
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * token
     */
    private String token;

}
