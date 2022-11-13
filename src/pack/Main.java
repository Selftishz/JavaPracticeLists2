package pack;

public class Main {
    public static void main(String[] args) {
        ListRealize list = new ListRealize();


        list.insertLast("fefe");
        list.insertLast("aa");
        list.insertLast("errre");
        list.insertLast("ebe");
        list.insertLast("aaa");
        list.insertLast("ad");
        list.insertLast("aaahhh");
        list.toString("рандомные строки (латинские буквы)");


        list.sort();
        list.toString("сортировка");

        list.insertSort("bvebe");
        list.insertSort("dddd");
        list.insertSort("ada");

        list.toString("добавление новых строк");
    }
}