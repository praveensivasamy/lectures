public class Pen extends AWriter {


    public String getWriterType() {
        return super.type;
    }

    @Override
    public String write() {
        return "I'm a pen";
    }
}
