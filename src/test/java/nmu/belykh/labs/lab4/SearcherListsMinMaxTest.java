package nmu.belykh.labs.lab4;

import static org.junit.Assert.*;

public class SearcherListsMinMaxTest {
    @org.junit.Test
    public void getMaximum() throws Exception {
        ListsOfNum listsOfNum = new ListsOfNum();
        SearcherListsMinMax searcherListsMinMax =new SearcherListsMinMax();

        listsOfNum.setLength(25);
        listsOfNum.getRandomLists();
        listsOfNum.printList();

        assertNotSame(searcherListsMinMax.getMaximum(listsOfNum), searcherListsMinMax.getMinimum(listsOfNum));

    }

    @org.junit.Test
    public void getMinimum() throws Exception {
       ListsOfNum listsOfNum = new ListsOfNum();
        SearcherListsMinMax searcherListsMinMax =new SearcherListsMinMax();

        listsOfNum.setLength(25);
        listsOfNum.getRandomLists();
        listsOfNum.printList();

        assertNotSame(searcherListsMinMax.getMaximum(listsOfNum), searcherListsMinMax.getMinimum(listsOfNum));

    }

}