package com.samsung.isp.service.onlinebook;

import com.samsung.isp.service.onlinebook.entity.Person;
import com.samsung.isp.service.onlinebook.generated.Message;
import com.samsung.isp.service.onlinebook.generated.OnlineBook;
import com.samsung.isp.service.onlinebook.generated.TickRST;
import com.zeroc.Ice.Current;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * 服务端，提供远程调用的接口实现
 * Created by ji.zhang on 9/16/17.
 */
public class OnlineBookImpl implements OnlineBook {

    private Logger logger = LoggerFactory.getLogger(OnlineBookImpl.class);

    @Override
    public TickRST bookTick(Message msg, Current current) {
        msg.setValid(true);
        logger.debug("bookTick called {} {}", msg.getContent(), Thread.currentThread().getId());
        return TickRST.Success;
    }

    @Override
    public List<Person> getAuthors(Current current) {
        return Person.createPersonList();
    }

    @Override
    public Map<Long, Message> getMsgMap(Current current) {
        return null;
    }
}
