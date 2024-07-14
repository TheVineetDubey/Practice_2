public class StringP {
    public static void main(String[] args) {
        String x="java";
        System.out.println(x.charAt(0));
        x.concat("Rules");
        System.out.println(x);

        x= x.concat("rules");
        System.out.println(x);

        String y="1245686355";
        String sub1= y.substring(3);
        System.out.println(sub1);
        String  sub2=y.substring(3,7);
        System.out.println(sub2);
    }
}
