package cn.piao888.cg.thrift;

import cn.piao888.ProcessorDTO;
import cn.piao888.Proctocol;
import cn.piao888.cg.DTO.OrgService;
import cn.piao888.cg.service.OrgDemo;

public class ProessceService implements Proctocol {

    @Override
    public ProcessorDTO registerProcessor() {
        ProcessorDTO processorDTO=new ProcessorDTO();
        processorDTO.setProcessorName("org");
        processorDTO.setProcessor(new OrgService.Processor(new OrgDemo()));
        System.out.println("hello world3!");
        return processorDTO;
    }
}
