package Classes.Design_Pattern.Factory_Design_1;

// enum PlanType{
//     domestic,commerical,instituation
// }
public class PlanFactory {
    
    public Plan getPlan(String planName){
        if(planName == null){
            return null;
        }

        if(planName.equalsIgnoreCase("domestic")){
            return new DemesticPlan();
        }else if (planName.equalsIgnoreCase("commerical")){
            return new CommericalPlan();
        }else if(planName.equalsIgnoreCase("instituation")){
            return new InstituationPlan();
        }
        return null;
    }
}
