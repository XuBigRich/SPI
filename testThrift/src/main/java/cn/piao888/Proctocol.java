package cn.piao888;

import org.apache.thrift.TProcessor;

import java.util.List;

public interface Proctocol {
    public List<ProcessorDTO> registerProcessor();
}
