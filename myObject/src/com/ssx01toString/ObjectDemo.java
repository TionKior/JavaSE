package com.ssx01toString;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("史晟贤");
        s.setAge(18);
        System.out.println(s);
        System.out.println(s.toString());

        /*
        public void println(Object x) {
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }

        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
        */
    }
}
