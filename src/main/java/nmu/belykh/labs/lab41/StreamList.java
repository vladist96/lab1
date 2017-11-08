package nmu.belykh.labs.lab41;

public class StreamList {
    public static void main(String[] args) {
        StreamListsOfNum listNum = new StreamListsOfNum();
        SearcherStreamMinMax listMinMax =new SearcherStreamMinMax();

        listNum.setLength(25);
        listNum.setWidth(25);
        listNum.getRandomLists();
        listNum.printList();
        listMinMax.getMaximum(listNum);
        listMinMax.getMinimum(listNum);
    }
}
