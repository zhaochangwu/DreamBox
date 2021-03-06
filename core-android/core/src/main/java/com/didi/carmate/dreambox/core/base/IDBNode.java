package com.didi.carmate.dreambox.core.base;

import com.google.gson.JsonObject;

import java.util.List;

/**
 * author: chenjing
 * date: 2020/4/30
 */
public interface IDBNode {
    /**
     * 获取节点名称
     */
    String getTagName();

    /**
     * 设置节点名称
     */
    void setTagName(String tagName);

    /**
     * 设置节点属性
     */
    void putAttr(String key, String value);

    /**
     * 设置当前节点的父节点
     */
    void setParent(IDBNode parent);

    /**
     * 获取当前节点的父节点，用于从父节点拿相关数据
     */
    IDBNode getParent();

    /**
     * 设置当前节点的子节点
     */
    void addChild(IDBNode child);

    /**
     * 获取当前节点的所有子节点
     */
    List<IDBNode> getChildren();

    /**
     * 解析节点属性
     */
    void parserAttribute();

    /**
     * 做一些预处理的工作，例：将树形节点进一步做结构化处理，方便使用
     */
    void parserNode();

    /**
     * 节点预处理完成后调用
     */
    void finishParserNode();

    /**
     * 设置数据对象
     */
    void setData(JsonObject jsonObject);

    /**
     * 获取数据对象
     */
    JsonObject getData();

    /**
     * 节点相关资源释放和清理
     */
    void release();
}
