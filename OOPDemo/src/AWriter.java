public abstract class AWriter {

    String type="I NEVER CHANGE"; // Ballpoint,Roller- Pen Pencil: carbon,graphite
    String colour;
    String size;
    String usage;

    public String getWriterType(String type){
        System.out.println("Im'm from the BaseAbstractClass of the tpye you passed "+ type);
        return type;
    }

    public abstract String write();

    public String setType(String type) {
        return type;
    }
}
