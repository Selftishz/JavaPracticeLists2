package pack;

public class Element {
    public String str;
    public Element next, prev;

    public void printNodeData() {
        System.out.print(str + " ");
    }

    public boolean needSwap() {
        String left = str;
        String right = next.str;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) > right.charAt(i)) {
                return true;
            }
            if (left.charAt(i) < right.charAt(i)) {
                return false;
            }
        }
        return false;
    }
}
