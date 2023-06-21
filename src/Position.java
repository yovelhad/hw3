public class Position {
    private Integer x;
    private Integer y;
    public Position(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public  Integer getX(){ return x;}
    public  Integer getY(){ return y;}


    public static Position at(int x, int y) {
        return new Position(x,y);
    }

    public Double calcRange(Position p ){
        Double range = Math.sqrt(Math.pow(p.x - x,2) + (Math.pow(p.y - y,2)));
        return  range;
    }

}
