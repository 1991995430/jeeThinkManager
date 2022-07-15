package com.jeethink.common.utils;

public class AtomicBuilderModel extends Number{

    private String a;

    private String b;

    private String c;

    private String d;



/*    public Atomic(String a, String b) {
        this(a, b, "0");
    }

    public Atomic(String a, String b, String c) {
        this(a, b, c, "0");
    }

    public Atomic(String a, String b, String c, String d) {
        this(a, b, c, d, "0");
    }*/

    public static class Builder{

        private String a;

        private String b;

        private String c;

        private String d;

        public Builder (String a, String b) {
            this.a = a;
            this.b = b;
        }

        public Builder setA(String val) {
            this.a = val;
            return this;
        }

        public Builder setB(String val) {
            this.b = val;
            return this;
        }

        public Builder setc(String val) {
            this.c = val;
            return this;
        }

        public Builder setD(String val) {
            this.d = val;
            return this;
        }

        public AtomicBuilderModel build() {
            return new AtomicBuilderModel(this);
        }
    }

    private AtomicBuilderModel(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }
    @Override
    public String toString() {
        return "Atomic{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
