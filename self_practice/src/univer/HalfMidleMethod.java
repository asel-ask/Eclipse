package univer;

public class HalfMidleMethod {
	
	 public static interface Fn {
	        double f(double x);
	    }
    private boolean isGoodEnough(double left, double right) {
        return (right - left) < 0.0001;
    }
    private double getAdgePoint(Fn y, double middle, double x) {
        double y1 = y.f(middle);
        double y2 = y.f(x);
        if (y1 > 0 && y2 > 0) {
            return middle;
        } else if (y1 < 0 && y2 < 0) {
            return middle;
        } else {
            return x;
        }
    }
    private double getMiddle(double left, double right) {
        return (left + right) / 2;
    }
    private double getRoot(Fn y, double left, double middle, double right) {
        //System.out.println("left=" + left + ", middle=" + middle + ", right=" + right);
        if (isGoodEnough(left, right)) {
            return getMiddle(left, right);
        }
        left = getAdgePoint(y, middle, left);
        right = getAdgePoint(y, middle, right);
        middle = getMiddle(left, right);
        return getRoot(y, left, middle, right);
    }
    public double getRoot(Fn y, double left, double right) {
        return getRoot(y, left, getMiddle(left, right), right);
    }
    public static void main(String[] arvg) {
        Fn sin = new Fn() {
            @Override
            public double f(double x) {
                return 1-x-x*x*x;
            }
        };
        System.out.println(new HalfMidleMethod().getRoot(sin, -2, 2));
        System.out.println(new HalfMidleMethod().getMiddle(-2, 2));
    }
}
