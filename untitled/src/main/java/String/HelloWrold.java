package String;

public class HelloWrold {
    public static void main(String[] args) {
        String name = "ReetuRuhalReetu";
        String o = "";
        char ch[] = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            boolean check = false;
            for (int j = 0; j < i; j++) { // Check only up to the current character
                if (ch[i] == ch[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                o = o + ch[i]; // Append the current character, not the entire array
            }
        }
        System.out.println(o);
    }
}


