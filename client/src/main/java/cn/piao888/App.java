package cn.piao888;

import cn.piao888.DTO.OrgService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import java.util.List;

public class App {
    public static void main(String[] args) throws TException {
        TSocket socket=new TSocket("127.0.0.1",8888,30000);
        //客户端要与 服务端 的配置 保持一致 （传输协议 '帧传输'，传输格式 ‘二进制’）
        TTransport transport= new TFramedTransport(socket);
        try {
            transport.open();
        } catch (TTransportException e) {
            e.printStackTrace();
            System.out.println("用户服务出问题了");
        }
        //设置传输协议
        TProtocol protocol=new TBinaryProtocol(transport);
        //构造客户端对象
        OrgService.Client client=new OrgService.Client(protocol);
        List list=client.getUserByName("a");
        list.get(1);
        System.out.println();
    }
}
