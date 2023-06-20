public class Health {
    private Integer healthPool;
    private  Integer healthAmount;
    public Health(int initialHealth){
        healthPool = initialHealth;
        healthAmount = initialHealth;
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
    public String toString(){
        return healthAmount + "/" + healthPool;
    }

}
