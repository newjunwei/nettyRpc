package com.recklessMo.rpc.bootstrap.server;

import com.recklessMo.rpc.bootstrap.protocol.IRobotProtocol;
import com.recklessMo.rpc.transport.server.AbstractRpcSerivce;

/**
 * TODO 如何让服务自动加载, 可以通过继承, 或者标签
 * <p>
 * 目前通过继承来实现
 * <p>
 * <p>
 * Created by hpf on 11/21/17.
 */
public class RobotService extends AbstractRpcSerivce implements IRobotProtocol {

    @Override
    public String sendMsg(String msg) {
        return "hello there ! nice to meet you !";
    }

    @Override
    public String getServiceName() {
        return "RobotService";
    }
}