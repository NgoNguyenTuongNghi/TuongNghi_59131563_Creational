package bai2;

public class MyStringBuilder {
    String string;
    public MyStringBuilder(String string) {
        this.string = string;    
    }
    public MyStringBuilder addString(String st) {
        string += st;
        return this;
    }
    public MyStringBuilder addFloat(float fl) {
        string += fl;
        return this;
    }
    public MyStringBuilder addbool(boolean bl) {
        string += bl;
        return this;
    }
    @Override
    public String toString(){
        return string;
    }
}