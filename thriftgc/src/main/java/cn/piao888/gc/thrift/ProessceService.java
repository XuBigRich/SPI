package cn.piao888.gc.thrift;

import cn.piao888.ProcessorDTO;
import cn.piao888.Proctocol;
import cn.piao888.gc.DTO.UserService;
import cn.piao888.gc.service.ThrirftDemo;

public class ProessceService implements Proctocol {

    public ProcessorDTO registerProcessor() {
        ProcessorDTO processorDTO=new ProcessorDTO();
        processorDTO.setProcessorName("ThrirftDemo");
        processorDTO.setProcessor(new UserService.Processor(new ThrirftDemo()));
        System.out.println("hello world2!");
        return processorDTO;
    }
}
