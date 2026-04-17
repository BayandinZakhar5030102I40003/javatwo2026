public class Practice1 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.test();

        SamePackage sp = new SamePackage();
        sp.test();
    }
}

class OuterClass {
    public class PublicInner {
        public void show() { System.out.println("Public inner"); }
    }

    private class PrivateInner {
        public void show() { System.out.println("Private inner"); }
    }

    protected class ProtectedInner {
        public void show() { System.out.println("Protected inner"); }
    }

    class PackageInner {
        public void show() { System.out.println("Package inner"); }
    }

    public void test() {
        PublicInner pi = new PublicInner();
        PrivateInner pri = new PrivateInner();
        ProtectedInner proi = new ProtectedInner();
        PackageInner pgi = new PackageInner();
        pi.show(); pri.show(); proi.show(); pgi.show();
    }
}

class SamePackage {
    public void test() {
        OuterClass outer = new OuterClass();
        OuterClass.PublicInner pi = outer.new PublicInner();
        OuterClass.ProtectedInner proi = outer.new ProtectedInner();
        OuterClass.PackageInner pgi = outer.new PackageInner();
        pi.show(); proi.show(); pgi.show();
    }
}