package cn.piao888.cg.service;

import cn.piao888.cg.thriftAPI.MMainPlan;
import cn.piao888.cg.thriftAPI.MainPlanService;
import cn.piao888.cg.thriftAPI.UserInfo;
import org.apache.thrift.TException;

public class MainPlanServiceImpl implements MainPlanService.Iface {
    @Override
    public MMainPlan getMMainPlan() throws TException {
        UserInfo userInfo=new UserInfo();
        userInfo.setCreateOrg("aaa");
        MMainPlan mMainPlan=new MMainPlan();
        mMainPlan.setUserInfo(userInfo);
        mMainPlan.setState((byte) 2);
        return mMainPlan;
    }
}
