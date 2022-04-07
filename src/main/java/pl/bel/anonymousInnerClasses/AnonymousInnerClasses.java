package pl.bel.anonymousInnerClasses;

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        /**
         * Anonymous classes wil be created here
         */
        SomethingInterfacesForAnonymousClasses some = new SomethingInterfacesForAnonymousClasses() {
            @Override
            public String talk() {
                return "Hello anonymous";
            }
        };
        System.out.println(some.talk());
    }

    public class Book implements SomethingInterfacesForAnonymousClasses {
        @Override
        public String talk() {
            return "Inner classes";
        }
    }

    public static class AeroPlane {

    }
}
