package cn.piao888;

import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.*;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class ThriftStar{
    public void starThriftServer() throws TTransportException, IOException {
        ServerSocket socket = new ServerSocket(8888);
        TServerSocket serverTransport = new TServerSocket(socket);
        TTransportFactory tTransport=new TFramedTransport.Factory();
        TBinaryProtocol.Factory proFactory = new TBinaryProtocol.Factory();
        TMultiplexedProcessor multiplexedProcessor = new TMultiplexedProcessor();
        //使用SPI 规定SPI接口
        ServiceLoader<Proctocol> loadedParsers = ServiceLoader.load(Proctocol.class);
        //搜索第三方实现该SPI接口的实现类 返回到迭代器中  （第三方jar包要在META-INF.services文件夹下建立一个与SPI接口名一致的文件 里面内容填写 实现SPI接口的实现类）
        Iterator<Proctocol> iterable=loadedParsers.iterator();
        //迭代每一个实现SPI接口的实现类
        while(iterable.hasNext()){
            Proctocol proctocol=iterable.next();
            ProcessorDTO processorDTO= proctocol.registerProcessor();
            multiplexedProcessor.registerProcessor(processorDTO.getProcessorName(), processorDTO.getProcessor());
        }
        TThreadPoolServer.Args serverArgs = new TThreadPoolServer.Args(serverTransport);
        serverArgs.processor(multiplexedProcessor);
        serverArgs.protocolFactory(proFactory);
        serverArgs.transportFactory(tTransport);
        TServer server = new TThreadPoolServer(serverArgs);
        server.serve();
    }
}
