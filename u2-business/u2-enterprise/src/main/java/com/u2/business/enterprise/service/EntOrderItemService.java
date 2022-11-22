package com.u2.business.enterprise.service;

import com.u2.api.enterprise.domain.EntOrderItem;

import java.util.List;

/**
 * 订单子项信息Service接口
 *
 * @author vhans
 * @date 2022-05-26
 */
public interface EntOrderItemService {
    /**
     * 查询订单子项信息
     *
     * @param id 订单子项信息主键
     * @return 订单子项信息
     */
    EntOrderItem selectOrderItemById(Long id);

    /**
     * 查询订单子项信息列表
     *
     * @param entOrderItem 订单子项信息
     * @return 订单子项信息集合
     */
    List<EntOrderItem> selectOrderItemList(EntOrderItem entOrderItem);

    /**
     * 根据所属订单ID查询订单子项信息列表
     *
     * @param orderId 所属订单ID
     * @return 订单子项信息集合
     */
    List<EntOrderItem> selectOrderItemListByOrderId(Long orderId);

    /**
     * 根据所属订单编号查询订单子项信息列表
     *
     * @param sn 所属订单sn
     * @return 订单子项信息集合
     */
    List<EntOrderItem> selectOrderItemListBySn(String  sn);

    /**
     * 新增订单子项信息
     *
     * @param entOrderItem 订单子项信息
     * @return 结果
     */
    int insertOrderItem(EntOrderItem entOrderItem);

    /**
     * 修改订单子项信息
     *
     * @param entOrderItem 订单子项信息
     * @return 结果
     */
    int updateOrderItem(EntOrderItem entOrderItem);

    /**
     * 批量删除订单子项信息
     *
     * @param ids 需要删除的订单子项信息主键集合
     * @return 结果
     */
    int deleteOrderItemByIds(Long[] ids);

    /**
     * 删除订单子项信息信息
     *
     * @param id 订单子项信息主键
     * @return 结果
     */
    int deleteOrderItemById(Long id);
}
