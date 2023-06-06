public interface Visitor {
    public boolean visit(Empty empty);
    public boolean visit(Wall wall);
    public boolean visit(Unit unit);
}
