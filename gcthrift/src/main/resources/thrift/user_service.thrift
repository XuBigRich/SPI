namespace java cn.piao888.cg.thriftAPI
struct UserInfo{
    1:i64 id,
    2:string CreaterName,
    3:string CreaterId,
    4:string CreateTime,
    5:string CreateOrg,
    6:string CreateOrgId
}
struct MMainPlan{
     1:i64 id,
     2:i32 P_BaseInfo_Id,
     3:string PlanTitle,
     4:byte State,
     5:string Remark,
     6:bool IsChangePlan,
     7:UserInfo userInfo
}
service MainPlanService{
    MMainPlan getMMainPlan();
}