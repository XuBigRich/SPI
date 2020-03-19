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
        ServiceLoader<Proctocol> loadedParsers = ServiceLoader.load(Proctocol.class);
        Iterator<Proctocol> iterable=loadedParsers.iterator();
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
