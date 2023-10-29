public class Pencil extends AWriter {
    public String getWriterType() {
        System.out.println("I'm only inside the Pencil class");
        return super.type;
    }

    @Override
    public String write() {
        return "I'm a pencil";
    }
}
