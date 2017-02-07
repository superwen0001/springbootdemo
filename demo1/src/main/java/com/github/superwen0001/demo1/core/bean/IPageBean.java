package com.caiyi.financial.nirvana.core.bean;


/**
 * Created by wenshiliang on 2017/1/20.
 * 分页bean接口，实现该接口必须实现getPage方法
 *
 */
public interface IPageBean {

    Integer getPageNum();

    Integer getPageSize();
}
