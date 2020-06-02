<<<<<<< HEAD
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
=======
package cn.piao888.gc.thrift;

import cn.piao888.ProcessorDTO;
import cn.piao888.Proctocol;
import cn.piao888.gc.DTO.UserService;
import cn.piao888.gc.service.ThrirftDemo;

import java.util.ArrayList;
import java.util.List;

public class ProessceService implements Proctocol {

    public List<ProcessorDTO> registerProcessor() {
        List<ProcessorDTO> processorDTOS=new ArrayList<>();
        ProcessorDTO processorDTO=new ProcessorDTO();
        processorDTO.setProcessorName("ThrirftDemo");
        processorDTO.setProcessor(new UserService.Processor(new ThrirftDemo()));
        System.out.println("hello world1!");
        processorDTOS.add(processorDTO);
        return processorDTOS;
    }
}
>>>>>>> d9fed244bc331bfdb9fbdb83eefa515d68770e37
