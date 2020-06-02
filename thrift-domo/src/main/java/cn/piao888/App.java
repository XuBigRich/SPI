package cn.piao888;

import org.apache.thrift.transport.TTransportException;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException, TTransportException {
        ThriftStar thriftStar=new ThriftStar();
        thriftStar.starThriftServer();
    }
}
