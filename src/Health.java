public class Health {
    private Integer healthPool;
    private  Integer healthAmount;
    public Health(){
        healthPool = 50;
        healthAmount = 50;
    }
    public Integer getPool(){
        return healthPool;
    }
    public Integer getCurr(){
        return healthAmount;
    }
    public void setPool(Integer i){
        healthPool = i;
    }
    public void setHealthAmount(Integer i){
        healthAmount = i;
    }

}
