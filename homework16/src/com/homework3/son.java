package com.homework3;

public class son implements DadLikeDo,MonLikeDo{
    @Override
    public String smoke() {
        return "抽烟";
    }

    @Override
    public String fish() {
        return "钓鱼";
    }

    @Override
    public String watch() {
        return "看电视";
    }

    @Override
    public String cook() {
        return "做饭";
    }
}
