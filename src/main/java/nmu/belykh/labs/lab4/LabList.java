package nmu.belykh.labs.lab4;

public class LabList {
    public static void main(String[] args) {
        ListsOfNum listsOfNum = new ListsOfNum();
        SearcherListsMinMax searcherListsMinMax =new SearcherListsMinMax();

        listsOfNum.setLength(25);
        listsOfNum.setWidth(25);
        listsOfNum.getRandomLists();
        listsOfNum.printList();
        searcherListsMinMax.getMaximum(listsOfNum);
        searcherListsMinMax.getMinimum(listsOfNum);
    }
}
