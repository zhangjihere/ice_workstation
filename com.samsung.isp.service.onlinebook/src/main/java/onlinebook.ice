#pragma once
[["java:package:com.samsung.isp.service.onlinebook"]]
module generated
{
    sequence<byte> ByteSeq;
    ["java:serializable:java.lang.Integer"]
    sequence<byte> Integer;

   /**
    * 消息类型
    **/
    ["java:getset"]
    class Message
    {
        string name;
        Integer type;
        bool valid;
        double price;
        string content;
        ByteSeq digest;
    };
    ["java:serializable:com.samsung.isp.service.onlinebook.entity.Person"]
    sequence<byte> Author;
    ["java:type:java.util.List<Person>"]
    sequence<Author> AuthorList;
    ["java:type:java.util.Map<Long,Message>"]
    dictionary<long, Message> MsgMap;

    /**订阅图书的结果**/
    enum TickRST{Success, Failure};

    /**在线书店接口**/
    interface OnlineBook
    {
        /**订书**/
        TickRST bookTick(Message msg);
        /**获取作者列表**/
        AuthorList getAuthors();
        /**获取消息映射表**/
        MsgMap getMsgMap();
    };

};